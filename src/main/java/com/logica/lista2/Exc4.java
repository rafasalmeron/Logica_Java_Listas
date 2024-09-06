package com.logica.lista2;
import java.util.Scanner;

public class Exc4 {
    public static void main(String[] args) {
        System.out.println("""
                
                Exercício 4
                
                4) Um cliente que promove eventos e solicitou um programa que seja capaz de
                identificar se uma pessoa é maior de idade. Pessoas com menos de 16 anos não
                podem entrar nos eventos. Entre 16 e 18 anos somente acompanhado pelos
                responsáveis. Maiores de 18 podem entrar normalmente.
                
                """);
        int idade;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        if (idade < 16) {
            System.out.println("Proibido a entrada para menores de 16 anos.");
        } else if (idade < 18) {
            System.out.println("Idade entre 16 e 17 anos, somente acompanhado dos pais.");
        }else{
            System.out.println("Entrada permitida.");
        }
    }
}
