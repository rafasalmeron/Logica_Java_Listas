package com.logica;

import java.util.Scanner;

/*7) Criar um algoritmo que leia dois números inteiros e imprima a seguinte saída:
  Dividendo, Divisor, Quociente e Resto.*/
public class Exc7 {
    public static void main(String[] args) {
        int numero, numero2;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o Dividendo: ");
        numero = entrada.nextInt();
        System.out.println("Digite o Divisor: ");
        numero2 = entrada.nextInt();

        System.out.println("O dividendo é: "+numero);
        System.out.println("O divisor é: "+numero2);
        System.out.println("O quociente é: "+(numero/numero2));
        System.out.println("O resto é: "+(numero%numero2));
    }
}
