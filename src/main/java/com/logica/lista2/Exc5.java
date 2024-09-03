package com.logica.lista2;
import java.util.Objects;
import java.util.Scanner;

public class Exc5 {
    public static void Logon(String log, String pass) {

        String loginVerification, passwordVerification;
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite Login e Senha");

        System.out.print("Login: ");
        loginVerification = sc.nextLine();

        System.out.print("Senha: ");
        passwordVerification = sc.nextLine();

        if (Objects.equals(log, loginVerification) && Objects.equals(pass, passwordVerification)) {
            System.out.println("Logado com Sucesso!");
        }else if(!Objects.equals(log, loginVerification) && !Objects.equals(pass, passwordVerification)) {
            System.out.println("Erro! Login e Senha Incorretos.");
        }else if(!Objects.equals(log, loginVerification)) {
            System.out.println("Erro! Login Incorreto.");
        }else {
            System.out.println("Erro! Password Incorreto.");
        }
    }
    public static void main(String[] args) {
        System.out.println("""
                
                Exercício 5
                
                5) Crie um algoritmo que receba login e senha e verifique as credenciais.
                Caso algum deles estiver errado o programa deve retornar ao usuário quais das opções
                está errada, se é o login ou a senha.
                
                """);
        String login, password;
        int option;

        Scanner sc = new Scanner(System.in);

        System.out.println("Crie seu Login:");
        login = sc.nextLine();
        System.out.println("Crie sua Senha:");
        password = sc.nextLine();
        do {
            System.out.println("Digite 1 para logar | Digite '0' para sair! ");
            option = sc.nextInt();
            if (option != 0) {
                Logon(login, password);
            }
        }
        while (option!=0);
    }
}
