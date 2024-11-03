#include <iostream>
#include <vector>
#include <unistd.h>

class Processo {
public:
    int id;
    bool ativo;

    Processo(int id) : id(id), ativo(true) {}
};

class SistemaDistribuido {
private:
    std::vector<Processo> processos;
    int coordenador;

public:
    SistemaDistribuido(int n) {
        for (int i = 1; i <= n; ++i) {
            processos.push_back(Processo(i));
        }
        coordenador = n;  // O coordenador inicial é o processo com maior ID
        std::cout << "Coordenador inicial é o processo " << coordenador << std::endl;
    }

    void falhaCoordenador() {
        std::cout << "Processo " << coordenador << " falhou!" << std::endl;
        processos[coordenador - 1].ativo = false;
        elegerNovoCoordenador();
    }

    void elegerNovoCoordenador() {
        std::cout << "Iniciando nova eleição..." << std::endl;
        int novoCoordenador = -1;
        
        for (int i = processos.size() - 1; i >= 0; --i) {
            if (processos[i].ativo) {
                novoCoordenador = processos[i].id;
                break;
            }
        }

        if (novoCoordenador != -1) {
            coordenador = novoCoordenador;
            std::cout << "Novo coordenador eleito: Processo " << coordenador << std::endl;
        } else {
            std::cout << "Nenhum processo ativo. Sistema falhou!" << std::endl;
        }
    }

    void falhaProcesso(int id) {
        if (id > 0 && id <= processos.size()) {
            processos[id - 1].ativo = false;
            std::cout << "Processo " << id << " falhou." << std::endl;

            if (id == coordenador) {
                falhaCoordenador();
            }
        } else {
            std::cout << "ID de processo inválido!" << std::endl;
        }
    }

    void reiniciarProcesso(int id) {
        if (id > 0 && id <= processos.size()) {
            processos[id - 1].ativo = true;
            std::cout << "Processo " << id << " reiniciado." << std::endl;

            if (id > coordenador) {
                elegerNovoCoordenador();
            }
        } else {
            std::cout << "ID de processo inválido!" << std::endl;
        }
    }

    void mostrarEstado() {
        std::cout << "Estado atual dos processos:" << std::endl;
        for (const auto& processo : processos) {
            std::cout << "Processo " << processo.id << (processo.ativo ? " está ativo." : " está inativo.") << std::endl;
        }
        std::cout << "Coordenador atual: Processo " << coordenador << std::endl;
    }
};

int main() {
    SistemaDistribuido sistema(5); // Inicializa o sistema com 5 processos

    sistema.mostrarEstado();

    sistema.falhaProcesso(5);  // Coordenador falha
    sistema.mostrarEstado();

    sistema.falhaProcesso(3);  // Outro processo falha
    sistema.mostrarEstado();

    sistema.reiniciarProcesso(4);  // Reinicia um processo
    sistema.mostrarEstado();

    sistema.reiniciarProcesso(5);  // Reinicia o antigo coordenador
    sistema.mostrarEstado();

    return 0;
}