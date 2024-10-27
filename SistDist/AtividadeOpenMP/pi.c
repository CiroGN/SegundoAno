#include <omp.h>
#include <stdio.h>
#include <sys/time.h>
#include <sys/resource.h>

void get_cpu_time(double *user_time, double *system_time) {
    struct rusage usage;
    getrusage(RUSAGE_SELF, &usage);
    *user_time = (double)usage.ru_utime.tv_sec + (double)usage.ru_utime.tv_usec / 1e6; // Tempo de usuário
    *system_time = (double)usage.ru_stime.tv_sec + (double)usage.ru_stime.tv_usec / 1e6; // Tempo do sistema
}

int main() {
    FILE *arquivo_csv = fopen("resultados_pi.csv", "w");
    fprintf(arquivo_csv, "Nucleos,Tempo_Real,Tempo_User,Tempo_Sys\n");

    for (int num_nucleos = 1; num_nucleos <= 16; ++num_nucleos) {
        omp_set_num_threads(num_nucleos); // Define o número de núcleos para OpenMP
        double soma_tempo_real = 0.0;
        double soma_tempo_user = 0.0;
        double soma_tempo_sys = 0.0;

        for (int j = 0; j < 20; ++j) {
            // Começa a medir o tempo real
            double inicio_real = omp_get_wtime();

            int n = 1000000000; // Número de iterações
            double area = 0.0;

            // Captura do tempo do sistema e do usuário antes da execução paralela
            double inicio_user, inicio_sys;
            get_cpu_time(&inicio_user, &inicio_sys);

            #pragma omp parallel for reduction (+:area)
            for (long int i = 0; i < n; i++) {
                double x = (i + 0.5) / n;
                area += 4.0 / (1.0 + x * x);
            }

            double pi = area / n; // Cálculo de pi

            // Captura do tempo do sistema e do usuário após a execução paralela
            double fim_user, fim_sys;
            get_cpu_time(&fim_user, &fim_sys);

            double fim_real = omp_get_wtime();
            // Calcule os tempos
            soma_tempo_real += (fim_real - inicio_real);
            soma_tempo_user += (fim_user - inicio_user); // Tempo de usuário
            soma_tempo_sys += (fim_sys - inicio_sys); // Tempo do sistema
        }

        // Média dos tempos para o núcleo atual
        double media_tempo_real = soma_tempo_real / 20;
        double media_tempo_user = soma_tempo_user / 20;
        double media_tempo_sys = soma_tempo_sys / 20;

        // Escreve no arquivo CSV
        fprintf(arquivo_csv, "%d,%.5f,%.5f,%.5f\n", num_nucleos, media_tempo_real, media_tempo_user, media_tempo_sys);
    }

    fclose(arquivo_csv);
    printf("Resultados salvos em 'resultados_pi.csv'.\n");

    return 0;
}
