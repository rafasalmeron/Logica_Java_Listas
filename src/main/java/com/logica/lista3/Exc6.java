package com.logica.lista3;

//6) Escreva um programa que seja capaz de desenhar uma pirâmide de
//asteriscos. O usuário deverá informar quantos andares ele deseja que a
//pirâmide tenha.

import java.util.Scanner;

public class Exc6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o número de andares da pirâmide: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
