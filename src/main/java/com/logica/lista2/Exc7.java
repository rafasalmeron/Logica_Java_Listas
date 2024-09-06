package com.logica.lista2;
import java.util.Scanner;

public class Exc7 {
    public static void main(String[] args) {
        System.out.println("""
                
                Exercício 2
                
                7) Escreva um programa Identificador de Divisibilidade,
                isto é, que identifique se um determinado número
                informado pelo usuário é divisível por X
                (Que também deve ser informado pelo usuário)
                
                """);
        int dividendo, divisor;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o dividendo: ");
        dividendo = sc.nextInt();
        System.out.println("Digite o divisor: ");
        divisor = sc.nextInt();

        if (dividendo % divisor == 0) {
            System.out.println(dividendo+" É divisível por "+divisor);
        }else {
            System.out.println(dividendo+" NÃO é divisível por "+divisor);
        }
    }
}
