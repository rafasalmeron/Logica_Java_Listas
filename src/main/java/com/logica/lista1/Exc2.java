package com.logica.lista1;
import java.util.Scanner;

public class Exc2 {
    public static void main(String[] args) {
        System.out.println("""
                
                Exercício 2
                
                2) Escreva um programa que pergunte o nome e o
                sobrenome do usuário e escreva na tela: "Olá, -usuário-".
                
                """);
        String nome, sobrenome;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        nome = sc.nextLine();
        System.out.println("Digite seu sobrenome:");
        sobrenome = sc.nextLine();
        System.out.println("Olá, " + nome + sobrenome +"!");
    }
}
