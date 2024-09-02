package com.logica.exc_roni;
import java.util.Scanner;

//2)Construir um algoritmo que leia um número e exiba na tela o seu
//sucessor e antecessor.
public class Exc2 {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        num = sc.nextInt();

        System.out.println("O antecessor de "+num+" é: "+(num-1));
        System.out.println("O sucessor de "+num+" é: "+(num+1));
    }
}
