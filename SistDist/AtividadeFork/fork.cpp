#include <iostream>
#include <unistd.h>
#include <sys/types.h>
#include <cerrno>
#include <cstdlib>

int main(int argc, char *argv[])
{
    pid_t iPid;

    std::cout << "\nDuplicando o processo\n";

    iPid = fork();
    if (iPid < 0)
    {
        std::cerr << argv[0] << ": " << strerror(errno) << std::endl;
        std::exit(errno);
    }

    if (iPid != 0)
    {
        // Código executado apenas no processo pai
        std::cout << "\nCódigo executado no processo pai\n";
        std::cout << "\nPAI - Processo pai. PID: |" << getpid() << "|\n";
        std::cout << "\nPAI - Processo filho. PID: |" << iPid << "|\n";
    }
    else
    {
        std::cout << "\nCódigo executado pelo filho";
    }

    // Código executado tanto pelo pai quanto pelo filho
    if (iPid == 0)
    {
        std::cout << "\nCódigo executado no processo filho\n";
        std::cout << "\nFILHO - Processo pai. PID: |" << getppid() << "|\n";
        std::cout << "\nFILHO - Processo filho. PID: |" << getpid() << "|\n";
        std::cout << "\nValor do iPid: |" << iPid << "|\n";
    }
    else
    {
        std::cout << "\nCódigo executado pelo pai";
    }

    // Esta mensagem será impressa por ambos, pai e filho
    std::cout << "\nEsta mensagem será impressa 2 vezes\n";

    // Pausa para visualizar o comportamento dos processos
    sleep(100);

    return 0;
}