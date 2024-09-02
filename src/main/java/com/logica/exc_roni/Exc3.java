package com.logica.exc_roni;

import java.util.Scanner;

//3) Construa um algoritmo que leia o nome de um aluno,
//disciplina, quatro notas e exiba na tela a média.
public class Exc3 {
    public static void main(String[] args) {
        String nome;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do aluno: ");
        nome = sc.nextLine();
        System.out.println("Olá, " + nome +"!");
    }
}
