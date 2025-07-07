package server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class CalculadoraServer {
    
    public static void main(String[] args) {
        try {
            CalculadoraImpl calculadora = new CalculadoraImpl();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("CalculadoraService", calculadora);
            System.out.println("Servidor rodando na porta 1099");
            while (true) Thread.sleep(1000);
        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
} 