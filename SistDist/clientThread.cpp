#include <iostream>
#include <cstring>
#include <netinet/in.h>
#include <unistd.h>

const char* SERVER_IP = "localhost";
const int SERVER_PORT = 8080;

int main() {
    int clientSocket = socket(AF_INET6, SOCK_STREAM, 0);
    if (clientSocket == -1) {
        std::cerr << "Erro ao criar o socket do cliente." << std::endl;
        return 1;
    }

    sockaddr_in6 serverAddr{};
    serverAddr.sin6_family = AF_INET6;
    serverAddr.sin6_port = htons(SERVER_PORT);

    if (inet_pton(AF_INET6, SERVER_IP, &serverAddr.sin6_addr) <= 0) {
        std::cerr << "Erro ao converter o endereço IP." << std::endl;
        return 1;
    }

    if (connect(clientSocket, (struct sockaddr*)&serverAddr, sizeof(serverAddr)) == -1) {
        std::cerr << "Erro ao conectar ao servidor." << std::endl;
        return 1;
    }

    char buffer[1024];
    while (true) {
        std::cout << "Digite uma mensagem para o servidor (ou digite 'sair' para sair): ";
        std::cin.getline(buffer, sizeof(buffer));

        send(clientSocket, buffer, strlen(buffer), 0);

        if (strcmp(buffer, "sair") == 0) {
            break;
        }

        memset(buffer, 0, sizeof(buffer));
        recv(clientSocket, buffer, sizeof(buffer), 0);
        std::cout << "Resposta do servidor: " << buffer << std::endl;
    }

    close(clientSocket);
    return 0;
}