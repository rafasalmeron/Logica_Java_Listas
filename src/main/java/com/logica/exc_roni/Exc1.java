package com.logica.exc_roni;

import java.util.Scanner;

//1) Leia dois valores pelo teclado e imprima a soma.
public class Exc1 {
    public static void main(String[] args) {
        int n1, n2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        n1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = sc.nextInt();

        System.out.println(n1+n2);
    }
}
