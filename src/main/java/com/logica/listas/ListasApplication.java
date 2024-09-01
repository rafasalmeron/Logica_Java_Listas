package com.logica.listas;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ListasApplication {

    public static void allIn(String[] args) {
        //LISTA 1
        com.logica.lista1.Exc1.main(args);
        com.logica.lista1.Exc2.main(args);
        com.logica.lista1.Exc3.main(args);
        com.logica.lista1.Exc4.main(args);
        com.logica.lista1.Exc5.main(args);
        com.logica.lista1.Exc6.main(args);
        com.logica.lista1.Exc7.main(args);
        com.logica.lista1.Exc8.main(args);
        //LISTA 2
        com.logica.lista2.Exc1.main(args);
        com.logica.lista2.Exc2.main(args);
        com.logica.lista2.Exc3.main(args);
        com.logica.lista2.Exc4.main(args);
        com.logica.lista2.Exc5.main(args);
        com.logica.lista2.Exc6.main(args);
        com.logica.lista2.Exc7.main(args);
        com.logica.lista2.Exc8.main(args);
    }

    public static void choice(String[] args) {
        int esc;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("""
                
                Modulo de escolha específica.
                
                Escolha primeiro qual das listas quer acessar:
                
                Digite 1 para LISTA 1.
                Digite 2 para LISTA 2.
                Digite 0 para SAIR.
                
                """);
            esc = sc.nextInt();
            if (esc == 1) {
                System.out.println("""
                        LISTA 1
                        Digite de 1 a 8 para escolher qual exercício quer acessar:
                        
                        """);
                esc = sc.nextInt();
                switch (esc) {
                    case 1 -> com.logica.lista1.Exc1.main(args);
                    case 2 -> com.logica.lista1.Exc2.main(args);
                    case 3 -> com.logica.lista1.Exc3.main(args);
                    case 4 -> com.logica.lista1.Exc4.main(args);
                    case 5 -> com.logica.lista1.Exc5.main(args);
                    case 6 -> com.logica.lista1.Exc6.main(args);
                    case 7 -> com.logica.lista1.Exc7.main(args);
                    case 8 -> com.logica.lista1.Exc8.main(args);
                    default -> System.out.println("Opção inválida!");
                }
            } else if (esc == 2) {
                System.out.println("""
                        LISTA 2
                        Digite de 1 a 8 para escolher qual exercício quer acessar:
                        
                        """);
                esc = sc.nextInt();
                switch (esc) {
                    case 1 -> com.logica.lista2.Exc1.main(args);
                    case 2 -> com.logica.lista2.Exc2.main(args);
                    case 3 -> com.logica.lista2.Exc3.main(args);
                    case 4 -> com.logica.lista2.Exc4.main(args);
                    case 5 -> com.logica.lista2.Exc5.main(args);
                    case 6 -> com.logica.lista2.Exc6.main(args);
                    case 7 -> com.logica.lista2.Exc7.main(args);
                    case 8 -> com.logica.lista2.Exc8.main(args);
                    default -> System.out.println("Opção inválida!");
                }
            } else {
                System.out.println("Opção inválida!");
            }
        } while(esc != 0);
    }

    public static void main(String[] args) {
        SpringApplication.run(ListasApplication.class, args);

        int esc;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("""
                    
                    Inicio do Programa:
                    
                    Digite 1 para Rodar TODOS os exercícios.
                    Digite 2 para Escolher UM dos exercícios.
                    Digite 0 para Sair.
                    
                    """);
            esc = sc.nextInt();
            switch (esc) {
                case 1 -> allIn(args);
                case 2 -> choice(args);
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }
        } while (esc != 0);

        System.out.println("...FIM...");
    }
}
