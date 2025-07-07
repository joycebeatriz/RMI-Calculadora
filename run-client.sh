#!/bin/bash

echo "Iniciando Cliente Calculadora RMI..."
echo ""
echo "Certifique-se de que o projeto foi compilado primeiro (execute ./compile.sh)"
echo "e que o servidor está rodando (execute ./run-server.sh)"
echo ""

read -p "Digite o endereço IP do servidor (ou pressione Enter para localhost): " endereco

if [ -z "$endereco" ]; then
    echo "Conectando ao servidor local (localhost)..."
    java -cp bin client.CalculadoraClient
else
    echo "Conectando ao servidor $endereco..."
    java -cp bin client.CalculadoraClient "$endereco"
fi

echo ""
echo "Cliente encerrado." 