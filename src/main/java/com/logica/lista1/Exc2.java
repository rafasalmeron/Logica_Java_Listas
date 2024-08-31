package com.logica.lista1;

//2) Escreva um programa que pergunte o nome e o
//sobrenome do usuário e escreva na tela: "Olá, -usuário-".

import java.util.Scanner;

public class Exc2 {
    public static void main(String[] args) {
        String nome;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        nome = sc.nextLine();
        System.out.println("Olá, " + nome + "!");
    }
}
