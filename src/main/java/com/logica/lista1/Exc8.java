package com.logica.lista1;

// 8) Suponha que voce trabalhe em um laboratório e seu
// colega mediu a temperatura de um objeto em Fahrenheit.
// Escreva um programa capaz de converter em Celsius.

import java.util.Scanner;

public class Exc8 {
    public static void main(String[] args) {
        double F, C;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor do F: ");
        F = sc.nextDouble();
        C=(F-32)/1.8;
        System.out.println("Conversão de Fahrenheit para Celsius");
        System.out.printf("%.1f°F = %.1f°C.",F,C);
    }
}
