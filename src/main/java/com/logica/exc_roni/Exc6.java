package com.logica;
     /*6) Escreva um programa que leia a temperatura em Celsius e retorne o valor em Fahrenheit
		F = C x 1,8 + 32
		Para que você consiga converter de grau Celsius para Fahrenheit, basta multiplicar
		a temperatura em graus Celsius por 1,8 e somar 32.
		Exemplo:
		37º C para Fahrenheit:
		F = 37 x 1,8 + 32;
		F = 98,6;
		37 graus Celsius equivalem a 98,6 graus Fahrenheit.*/

import java.util.Scanner;

public class Exc6 {
    public static void main(String[] args) {
        double F, C;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor em Celsius: ");
        C = sc.nextDouble();
        F=(C*1.8)+32;
        System.out.println("Conversão de Celsius para Fahrenheit");
        System.out.printf("%.1f°F = %.1f°C.",C,F);
    }
}
