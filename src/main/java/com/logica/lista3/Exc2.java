package com.logica.lista3;
import java.util.Scanner;

public class Exc2 {
    public static void main() {
        System.out.println("""
                
                2) Desenvolva um programa que receba um número do usuário e escreva a
                tabuada dele.
                
                """);
        int number;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        number = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", number, i, (number*i));
        }
    }
}
