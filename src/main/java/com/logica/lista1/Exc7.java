package com.logica.lista1;
import java.util.Scanner;

public class Exc7 {
    public static void main(String[] args) {
        System.out.println("""
                
                Exercício 7
                
                7) Escreva um programa que receba quatro notas de um
                aluno e calcule a média aritmética dessas notas.
                
                """);
        double nota1, nota2, nota3, nota4, media;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite as 4 notas: ");
        System.out.println("Digite a primeira nota: ");
        nota1 = entrada.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = entrada.nextDouble();
        System.out.println("Digite a terceira nota: ");
        nota3 = entrada.nextDouble();
        System.out.println("Digite a quarta nota: ");
        nota4 = entrada.nextDouble();
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A média das notas é: " + media);
    }
}
