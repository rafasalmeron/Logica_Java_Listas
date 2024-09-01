package com.logica.lista1;
import java.util.Scanner;

public class Exc4 {
    public static void main(String[] args) {
        System.out.println("""
                
                Exercício 4
                
                4) Construa um algoritmo que leia um número inteiro
                na tela e responda o número antecessor e o sucessor.
                
                """);
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        num = sc.nextInt();

        System.out.println("O antecessor de "+num+" é: "+(num-1));
        System.out.println("O sucessor de "+num+" é: "+(num+1));
    }
}
