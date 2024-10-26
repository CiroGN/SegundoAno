#include <iostream>
#include <cstdlib>
#include <cstring>
#include <thread>
#include <vector>
#include <netinet/in.h>
#include <unistd.h>

const int PORT = 8080;
const int MAX_CLIENTS = 5;

void handleClient(int clientSocket) {
    char buffer[1024];
    std::string welcomeMessage = "Bem-vindo ao servidor IPv6!\n";
    send(clientSocket, welcomeMessage.c_str(), welcomeMessage.size(), 0);

    while (true) {
        memset(buffer, 0, sizeof(buffer));
        int bytesRead = recv(clientSocket, buffer, sizeof(buffer), 0);
        if (bytesRead <= 0) {
            std::cout << "Cliente desconectado." << std::endl;
            break;
        }

        std::cout << "Mensagem do cliente: " << buffer << std::endl;
        send(clientSocket, buffer, bytesRead, 0);
    }

    close(clientSocket);
}

int main() {
    int serverSocket = socket(AF_INET6, SOCK_STREAM, 0);
    if (serverSocket == -1) {
        std::cerr << "Erro ao criar o socket do servidor." << std::endl;
        return 1;
    }

    sockaddr_in6 serverAddr{};
    serverAddr.sin6_family = AF_INET6;
    serverAddr.sin6_addr = in6addr_any;
    serverAddr.sin6_port = htons(PORT);

    if (bind(serverSocket, (struct sockaddr*)&serverAddr, sizeof(serverAddr)) == -1) {
        std::cerr << "Erro ao ligar o servidor." << std::endl;
        return 1;
    }

    if (listen(serverSocket, MAX_CLIENTS) == -1) {
        std::cerr << "Erro ao escutar conexões." << std::endl;
        return 1;
    }

    std::cout << "Servidor IPv6 esperando conexões na porta " << PORT << "..." << std::endl;

    std::vector<std::thread> clientThreads;

    while (true) {
        sockaddr_in6 clientAddr{};
        socklen_t clientAddrLen = sizeof(clientAddr);

        int clientSocket = accept(serverSocket, (struct sockaddr*)&clientAddr, &clientAddrLen);
        if (clientSocket == -1) {
            std::cerr << "Erro ao aceitar a conexão do cliente." << std::endl;
            continue;
        }

        std::cout << "Novo cliente conectado." << std::endl;

        // Cria uma nova thread para lidar com o cliente.
        std::thread clientThread(handleClient, clientSocket);
        clientThreads.push_back(std::move(clientThread));
    }

    // Aguarda que todas as threads do cliente terminem.
    for (std::thread& t : clientThreads) {
        t.join();
    }

    close(serverSocket);
    return 0;
}