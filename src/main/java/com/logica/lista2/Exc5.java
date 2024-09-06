package com.logica.lista2;
import java.util.Objects;
import java.util.Scanner;

public class Exc5 {
    public static void Logon(String log, String pass) {
        String loginVerification, passwordVerification;
        Scanner sc = new Scanner(System.in);
        int block = 3;

        do{
            System.out.println("Digite Login e Senha");

            System.out.print("Login: ");
            loginVerification = sc.nextLine();

            System.out.print("Senha: ");
            passwordVerification = sc.nextLine();

            if (Objects.equals(log, loginVerification) && Objects.equals(pass, passwordVerification)) {
                System.out.println("Logado com Sucesso!");
                break;
            }else if(!Objects.equals(log, loginVerification) && !Objects.equals(pass, passwordVerification)) {
                System.out.println("Erro! Login e Senha Incorretos.");
                block--;
            }else if(!Objects.equals(log, loginVerification)) {
                System.out.println("Erro! Login Incorreto.");
                block--;
            }else {
                System.out.println("Erro! Password Incorreto.");
                block--;
            }
            if(block == 1) {
                System.out.println("Você possui mais uma tentativa.");
            }
            if(block == 0) {
                System.out.println("Acesso Bloqueado!");
            }
        }while(block > 0);
    }
    public static void main(String[] args) {
        System.out.println("""
                
                Exercício 5
                
                5) Crie um algoritmo que receba login e senha e verifique as credenciais.
                Caso algum deles estiver errado o programa deve retornar ao usuário quais das opções
                está errada, se é o login ou a senha.
                
                """);
        String login, password;
        Scanner sc = new Scanner(System.in);

        System.out.println("Crie seu Login:");
        login = sc.nextLine();

        System.out.println("Crie sua Senha:");
        password = sc.nextLine();

        Logon(login, password);
        System.out.println("Sistema Online");

    }
}
