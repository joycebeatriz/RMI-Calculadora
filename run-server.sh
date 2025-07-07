#!/bin/bash

echo "Iniciando Servidor Calculadora RMI..."
echo ""
echo "Certifique-se de que o projeto foi compilado primeiro (execute ./compile.sh)"
echo ""
read -p "Pressione Enter para continuar..."

echo ""
echo "Iniciando servidor na porta 1099..."
java -cp bin server.CalculadoraServer

echo ""
echo "Servidor encerrado." 