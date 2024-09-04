package com.logica.lista4;
import java.util.Scanner;

public class Exc5 {
    public static void main(String[] args) {
        Exc6 method = new Exc6();
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                
                5) Escreva um programa que sirva como uma lista de compras de
                mercado. Você irá criar um menu que pergunte se o usuário quer inserir
                um item ou ver a lista.
                
                6) Aproveite a questão anterior e adicionar a opção do usuário remover
                um item.
                """);
        String[] lista_de_compras = new String[10];
        int option;
        String item;
        String itemRemover="";
        String[] novaLista = new WrapperArray(lista_de_compras);
        String remove = new Wrapper(itemRemover).toString();
        Scanner entrada = new Scanner(System.in);

        do{
            System.out.println("""
                    Menu Lista de compras:
                    
                    Digite 1 para inserir um item.
                    Digite 2 ver a lista.
                    Digite 0 para sair.
                    """);
            option = entrada.nextInt();
            switch(option){
                case 1 -> {
                    for (int i = 0; i < lista_de_compras.length; i++) {
                        if (lista_de_compras[i] == null){
                            System.out.println("Descreva o item para adicionar a lista:");
                            lista_de_compras[i] = item = entrada.next();
                            break;
                        }
                    }
                }
                case 2 -> {
                    for (int i = 0; true;) {
                        while(lista_de_compras[i] != null){
                            System.out.println(lista_de_compras[i]);
                            i++;
                        }break;
                    }
                }
                case 3 ->{
                        method.metodo(novaLista,remove);
                }
                case 0 -> System.out.println("Fechando lista....");
            }
        }while(option != 0);
    }
}
