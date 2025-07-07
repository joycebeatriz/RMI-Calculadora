#!/bin/bash

echo "Compilando Calculadora RMI..."

# Criar diretórios de saída
mkdir -p bin/shared bin/server bin/client

# Compilar interface compartilhada
echo "Compilando interface compartilhada..."
javac -d bin src/shared/Calculadora.java

# Compilar servidor
echo "Compilando servidor..."
javac -cp bin -d bin src/server/CalculadoraImpl.java
javac -cp bin -d bin src/server/CalculadoraServer.java

# Compilar cliente
echo "Compilando cliente..."
javac -cp bin -d bin src/client/CalculadoraClient.java

echo "Compilação concluída!"
echo ""
echo "Para executar o servidor: ./run-server.sh"
echo "Para executar o cliente: ./run-client.sh" 