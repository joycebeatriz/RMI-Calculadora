# Calculadora RMI

Calculadora distribuída usando Java RMI (Remote Method Invocation) que permite realizar operações matemáticas remotamente através de um servidor central.

## Requisitos
- Java JDK 8 ou superior
- Windows (para os scripts .bat)

## Uso

### 1. Compilar o projeto
Execute o comando abaixo para compilar todos os arquivos Java:

```bash
.\compile.bat
```

### 2. Iniciar o servidor
Rode este comando no mesmo terminal do comando anterior, ele iniciará o servidor na porta 1099. Aguarde a mensagem "Servidor rodando na porta 1099":

```bash
.\run-server.bat
```

### 3. Conectar o cliente
Em um outro terminal, rode este comando para conectar ao servidor. A interface da calculadora aparecerá:

```bash
.\run-client.bat
```

## Operações Disponíveis
- 1 - Soma
- 2 - Subtração
- 3 - Multiplicação
- 4 - Divisão
- 5 - Sair

## Exemplo de Uso
```
                    CALCULADORA RMI
==================================================
Selecione uma opção:
1 - Soma
2 - Subtração
3 - Multiplicação
4 - Divisão
5 - Sair
--------------------------------------------------
Opção: 1
--------------------------------------------------
Digite o primeiro número: 10
Digite o segundo número: 5
--------------------------------------------------
Soma: 10.00 + 5.00 = 15.00
==================================================
```