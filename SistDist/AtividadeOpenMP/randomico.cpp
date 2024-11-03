#include <iostream>
#include <cmath>
#include <bits/stdc++.h>
#include <chrono>
#include <random>
#include <limits>
#include <sys/resource.h>
#include <omp.h>

typedef std::chrono::high_resolution_clock Clock;
using namespace std;

#define PONTOS 10000000

typedef double (*funcao)(double);

inline double funcao_1(double x) {
    double d = (1 + pow(x, 2));
    if (d != 0.0D) {
        return 4.0D / d;
    }
    throw string("Divisão por zero.");
}

void get_cpu_time(double *user_time, double *system_time) {
    struct rusage usage;
    getrusage(RUSAGE_SELF, &usage);
    *user_time = (double)usage.ru_utime.tv_sec + (double)usage.ru_utime.tv_usec / 1e6; // Tempo de usuário
    *system_time = (double)usage.ru_stime.tv_sec + (double)usage.ru_stime.tv_usec / 1e6; // Tempo do sistema
}

class FuncoesMonteCarlo {
public:
    static double calculaFP(vector<double> amostra, funcao f) {
        long double somatorio = 0.0D;
        #pragma omp parallel for reduction(+:somatorio)
        for (int i = 0; i < PONTOS; ++i) {
            somatorio += f(amostra[i]);
        }
        return (double)(1.0D / amostra.size()) * somatorio;
    }
};

int main() {
    std::ofstream arquivo_csv("resultados_randomico.csv");
    arquivo_csv << "Nucleos,Tempo_Real,Tempo_User,Tempo_Sys\n"; // Adiciona coluna para Tempo_Sys

    for (int num_nucleos = 1; num_nucleos <= 16; ++num_nucleos) {
        omp_set_num_threads(num_nucleos); // Define o número de núcleos para OpenMP
        double soma_tempo_real = 0.0;
        double soma_tempo_user = 0.0;
        double soma_tempo_sys = 0.0;

        for (int i = 0; i < 20; ++i) {
            // Começa a medir o tempo real
            auto start = std::chrono::high_resolution_clock::now();

            unsigned seed = std::chrono::system_clock::now().time_since_epoch().count();
            std::mt19937_64 aleatorio(seed);
            vector<double> amostra;

            while (amostra.size() < PONTOS) {
                double numero = (double)aleatorio() / LLONG_MAX; // de 0 até 1
                amostra.push_back(numero);
            }

            // Captura do tempo do sistema e do usuário antes da execução paralela
            double inicio_user, inicio_sys;
            get_cpu_time(&inicio_user, &inicio_sys);

            try {
                auto t1 = Clock::now();
                double resultado = FuncoesMonteCarlo::calculaFP(amostra, funcao_1);
                auto t2 = Clock::now();
            }
            catch (string e) {
                cout << e << endl;
            }

            // Captura do tempo do sistema e do usuário após a execução paralela
            double fim_user, fim_sys;
            get_cpu_time(&fim_user, &fim_sys);

            auto end = std::chrono::high_resolution_clock::now();
            std::chrono::duration<double> tempo_real = end - start;

            // Calcule os tempos
            soma_tempo_real += tempo_real.count(); // Acumula o tempo real
            soma_tempo_user += (fim_user - inicio_user); // Acumula o tempo de usuário
            soma_tempo_sys += (fim_sys - inicio_sys); // Acumula o tempo de sistema
        }

        // Média dos tempos para o núcleo atual
        double media_tempo_real = soma_tempo_real / 20;
        double media_tempo_user = soma_tempo_user / 20;
        double media_tempo_sys = soma_tempo_sys / 20;

        // Escreve no arquivo CSV
        arquivo_csv << num_nucleos << "," << media_tempo_real << "," << media_tempo_user << "," << media_tempo_sys << "\n";
    }

    arquivo_csv.close();
    std::cout << "Resultados salvos em 'resultados_randomico.csv'." << std::endl;

    return 0;
}
