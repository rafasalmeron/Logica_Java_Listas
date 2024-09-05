package com.logica.lista4;
import java.util.ArrayList;
import java.util.List;
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
                
                7) Aproveite o código que estamos utilizando e implemente um preço
                para cada item (Dica. Utilizem outra lista e use os mesmos índices para
                o item e para o preço).
                
                8) Aproveite os códigos anteriores e implemente a função de impressão
                por ordem de preço (crescente)
                """);
        String[] lista_de_compras = new String[777];
        List<Double> preco_Item = new ArrayList<>(200);

        int indiceLista = 0, option;

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

                    lista_de_compras[indiceLista] = item;
                    indiceLista++;

                    System.out.println("Qual o valor do item?");
                    String price = sc.nextLine();
                    preco_Item.add(Double.parseDouble(price));
//                    boolean added = false;
//                    for (int i = 0; i < lista_de_compras.length; i++) {
//                        if (lista_de_compras[i] == null){
//                            lista_de_compras[i] = item;
//                            added = true;
//                            break;
//                        }
//                    }
//                    if (!added){
//                        System.out.println("A lista está cheia!");
//                    }
                }
                case 2 -> {
                    System.out.println("Lista de compras: ");
                    if (indiceLista > 0) {
                        for (int i = 0; i < indiceLista; i++) {
                            System.out.printf("%d. %s",i+1, lista_de_compras[i]);
                            System.out.printf(": R$ %.2f\n", preco_Item.get(i));
                        }
                    }
                }
                case 3 -> {
                    WrapperArray newList = new WrapperArray(lista_de_compras);
                    Wrapper itemRemove = new Wrapper("");
                    method.metodo(newList.refArray, itemRemove.ref);
                }
//                case 4 -> {
//                    System.out.println("""
//
//                7) Aproveite o código que estamos utilizando e implemente um preço
//                para cada item (Dica. Utilizem outra lista e use os mesmos índices para
//                o item e para o preço).
//
//                """);
//
//                }
                case 0 -> System.out.println("Fechando lista....");
                default -> System.out.println("Opção invalida!");
            }
        }while(option != 0);
    }
}
