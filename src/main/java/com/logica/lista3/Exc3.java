package com.logica.lista3;

//3) Escreva um código que receba dois números inteiros e escreva todos os
//números pares entre eles.

import java.util.Scanner;

public class Exc3 {
    public static void main(String[] args) {
        int num1, num2, menor, maior;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        num1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        num2 = sc.nextInt();
        if (num1 > num2) {
            maior = num1;
            menor = num2;
        } else {
            maior = num2;
            menor = num1;
        }

        for (int i = menor; i < maior; i++) {
            if (i % 2  == 0  ) {
                System.out.println(i);
            }
        }
        sc.close();
        for (int i = 0; i < 50; i++) {
            System.out.println();
            System.out.println();
        }
    }
}
