package com.logica.lista2;
import java.util.Scanner;

public class Exc2 {
    public static void main(String[] args) {
        System.out.println("""
                
                Exercício 2
                
                2) Desenvolva um algoritmo que seja capaz de receber
                dois números digitados
                pelo usuário e diga qual deles é maior.
                
                """);
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        n1 = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        n2 = sc.nextInt();
        if (n1>n2){
            System.out.println("O número "+n1+" é maior que o número "+n2+".");
        }else if (n2>n1){
            System.out.println("O número "+n2+"é maior que o número "+n1+".");
        }else{
            System.out.println("Os números "+n1+" e "+n2+" são iguais.");
        }

    }
}
