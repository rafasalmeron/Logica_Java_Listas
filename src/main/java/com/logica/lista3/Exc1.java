package com.logica.lista3;

//1) Escreva um programa que sirva como um cronômetro. O usuário deve
//digitar um numero em segundos e o programa deve contabilizar os segundos
//digitados. O programa deve receber somente números entre 1 e 59, do
//contrário ele retornar um erro e solicitar que o usuário digite um número válido.

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Exc1 {
    public static void main(String[] args) throws InterruptedException {
        int seg, cont;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Digite um numero entre 1 e 59: ");
            seg = sc.nextInt();
        }while (seg < 1 || seg > 59);
        cont = seg;
        for (int i = 1; i <= seg; i++) {
            System.out.println(cont);
            cont--;
            if (cont == 0) {
                System.out.println("Fim do programa.");
            }
            TimeUnit.SECONDS.sleep(1);
        }
    }
}
