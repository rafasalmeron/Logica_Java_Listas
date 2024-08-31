package com.logica.lista1;

//3) Escreva uma calculadora que receba um valor em reais e
//converta para dólar. Considere o valor do dólar a R$5,25.

import java.util.Scanner;

public class Exc3 {
    public static void main(String[] args) {
        double real;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o valor em reais: ");
        real = sc.nextInt();
        System.out.printf("Real: "+real+ " => %.2f Dolar: ",real/5.25);
    }
}
