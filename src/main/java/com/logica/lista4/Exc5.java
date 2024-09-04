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

        do{
            System.out.println("""
                    Menu Lista de compras:
                    
                    Digite 1 para inserir um item.
                    Digite 2 ver a lista.
                    Digite 3 para remover um item.
                    Digite 0 para sair.
                    """);
            option = sc.nextInt();
            sc.nextLine();

            switch(option){
                case 1 -> {
                    System.out.println("Descreva o item para adicionar à lista: ");
                    String item = sc.nextLine();
                    boolean added = false;
                    for (int i = 0; i < lista_de_compras.length; i++) {
                        if (lista_de_compras[i] == null){
                            lista_de_compras[i] = item;
                            added = true;
                            break;
                        }
                    }
                    if (!added){
                        System.out.println("A lista está cheia!");
                    }
                }
                case 2 -> {
                    System.out.println("Lista de compras: ");
                    for (String s : lista_de_compras) {
                        int i = 0;
                        i++;
                        if (s != null){
                            System.out.printf("%d. %s",i, s);
                        }
                    }
                }
                case 3 ->{
                    WrapperArray newList = new WrapperArray(lista_de_compras);
                    Wrapper itemRemove = new Wrapper("");
                    method.metodo(newList.refArray, itemRemove.ref);
                }
                case 0 -> System.out.println("Fechando lista....");
                default -> System.out.println("Opção invalida!");
            }
        }while(option != 0);
    }
}
