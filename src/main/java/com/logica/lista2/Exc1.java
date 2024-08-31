package com.logica.lista2;

// 1) Escreva um programa que recebe um número
// digitado pelo usuário e responda
// se o número inserido é par ou ímpar ou 0.

import java.util.Scanner;

public class Exc1 {
    public static void main(String[] args) {
        long num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor: ");
        num = sc.nextLong();
        if (num % 2 == 0) {
            System.out.println("O número "+num+" é par.");
        }else {System.out.println("O número "+num+" é ímpar.");}
    }
}
