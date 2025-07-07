package client;

import shared.Calculadora;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class CalculadoraClient {
    
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry(args.length > 0 ? args[0] : "localhost", 1099);
            Calculadora calc = (Calculadora) registry.lookup("CalculadoraService");
            Scanner sc = new Scanner(System.in);
            
            System.out.println("                    CALCULADORA RMI");
            System.out.println("==================================================");
            
            while (true) {
                System.out.println("Selecione uma opção:");
                System.out.println("1 - Soma");
                System.out.println("2 - Subtração");
                System.out.println("3 - Multiplicação");
                System.out.println("4 - Divisão");
                System.out.println("5 - Sair");
                System.out.println("--------------------------------------------------");
                System.out.print("Opção: ");
                String op = sc.nextLine();
                System.out.println("--------------------------------------------------");
                
                if (op.equals("5") || op.equalsIgnoreCase("sair")) {
                    System.out.println("Obrigado por usar a Calculadora RMI!");
                    System.out.println("==================================================");
                    break;
                }
                
                System.out.print("Digite o primeiro número: ");
                double a = Double.parseDouble(sc.nextLine());
                System.out.print("Digite o segundo número: ");
                double b = Double.parseDouble(sc.nextLine());
                
                double r = 0;
                String operacao = "";
                switch (op) {
                    case "1": r = calc.somar(a, b); operacao = "Soma"; break;
                    case "2": r = calc.subtrair(a, b); operacao = "Subtração"; break;
                    case "3": r = calc.multiplicar(a, b); operacao = "Multiplicação"; break;
                    case "4": r = calc.dividir(a, b); operacao = "Divisão"; break;
                }
                
                System.out.println("--------------------------------------------------");
                System.out.printf("%s: %.2f %s %.2f = %.2f%n", operacao, a, getSimbolo(operacao), b, r);
                System.out.println("==================================================");
            }
        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
    
    private static String getSimbolo(String operacao) {
        switch (operacao) {
            case "Soma": return "+";
            case "Subtração": return "-";
            case "Multiplicação": return "×";
            case "Divisão": return "÷";
            default: return "?";
        }
    }
} 