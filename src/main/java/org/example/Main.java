package org.example;


public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        double n1 = 10.0;
        double n2 = 5.0;

        System.out.println("--- Iniciando Calculadora ---");
        System.out.println("Somar (10 + 5): " + calc.somar(n1, n2));
        System.out.println("Subtrair (10 - 5): " + calc.subtrair(n1, n2));
        System.out.println("Multiplicar (10 * 5): " + calc.multiplicar(n1, n2));
        System.out.println("Dividir (10 / 5): " + calc.dividir(n1, n2));

        System.out.println("--- Teste de Erro ---");
        try {
            calc.dividir(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Erro capturado com sucesso: " + e.getMessage());
        }
    }
}