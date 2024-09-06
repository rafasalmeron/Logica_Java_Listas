package com.logica.lista3;

//7) Aproveitando o exercício anterior, escreva um programa que consiga
//construir um retângulo. O usuário deve informar a largura e a altura em
//asteriscos

import java.util.Scanner;

public class Exc7 {
    public static void main(String[] args) {
        System.out.println("""
                
                7) Aproveitando o exercício anterior, escreva um programa que consiga
                construir um retângulo. O usuário deve informar a largura e a altura em
                asteriscos
                
                """);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a largura do retângulo: ");
        int largura = scanner.nextInt();
        System.out.print("Digite a altura do retângulo: ");
        int altura = scanner.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < largura; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
