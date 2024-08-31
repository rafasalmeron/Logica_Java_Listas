package com.logica.lista1;

//4) Construa um algoritmo que leia um número inteiro na tela e
//responda o número antecessor e o sucessor.

import java.util.Scanner;

public class Exc4 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        num = sc.nextInt();

        System.out.println("O antecessor de "+num+" é: "+(num-1));
        System.out.println("O sucessor de "+num+" é: "+(num+1));
    }
}
