package com.logica.lista1;

//7) Escreva um programa que receba quatro notas de um
//aluno e calcule a média aritmética dessas notas.
//

import java.util.Scanner;

public class Exc7 {
    public static void main(String[] args) {
        double nota1, nota2, nota3, nota4, media;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite as 4 notas: ");
        nota1 = entrada.nextDouble();
        nota2 = entrada.nextDouble();
        nota3 = entrada.nextDouble();
        nota4 = entrada.nextDouble();
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("A média das notas é: " + media);
    }
}
