package server;

import shared.Calculadora;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculadoraImpl extends UnicastRemoteObject implements Calculadora {
    
    public CalculadoraImpl() throws RemoteException {
        System.out.println("Servidor iniciado!");
    }
    
    public double somar(double a, double b) throws RemoteException {
        System.out.printf("Soma: %.2f + %.2f = %.2f%n", a, b, a + b);
        return a + b;
    }
    
    public double subtrair(double a, double b) throws RemoteException {
        System.out.printf("Subtração: %.2f - %.2f = %.2f%n", a, b, a - b);
        return a - b;
    }
    
    public double multiplicar(double a, double b) throws RemoteException {
        System.out.printf("Multiplicação: %.2f * %.2f = %.2f%n", a, b, a * b);
        return a * b;
    }
    
    public double dividir(double a, double b) throws RemoteException, ArithmeticException {
        if (b == 0) throw new ArithmeticException("Divisão por zero!");
        System.out.printf("Divisão: %.2f / %.2f = %.2f%n", a, b, a / b);
        return a / b;
    }
} 