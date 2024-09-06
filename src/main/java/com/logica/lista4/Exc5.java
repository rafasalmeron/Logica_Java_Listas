package com.logica.lista4;
import java.util.*;
import java.util.HashMap;

public class Exc5 {
    public static void main(String[] args) {
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
//        List<String> lista_de_compras = new ArrayList<>(777);
//        List<Double> preco_Item = new ArrayList<>(222);
        Map<String, Double> compras = new HashMap<>();

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

                    // Identifiquei que ao atribuir o valor com ponto o código quebrava,
                    // para evitar isso fiz essa verificação para ficar claro o problema no codigo
                    // e evitar o erro e a quebra do sistema.
                    boolean verification;
                    String priceStr;
                    do {
                        System.out.println("Qual o valor do item?");
                        priceStr = sc.nextLine();
                        verification = false;
                        if (priceStr.contains(".")) {
                            System.out.println("Por favor, utilizar vígula ao invés de ponto ao dizer o valor para separar os decimais");
                            verification = true;
                        }
                    } while (verification);


                    double price = Double.parseDouble(priceStr.replace(",", "."));

                    compras.put(item, price);
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
//                        for (int i = 0; i < lista_de_compras.size(); i++) {
////                            Collections.sort(preco_Item);
////                            System.out.printf("%d. %s",i+1, lista_de_compras.get(i));
////                            System.out.printf(": R$ %s\n", preco_Item.get(i));
//                            System.out.printf("%d. %s",i+1, lista_de_compras.get(i));
//                            System.out.printf(": R$ %s\n", preco_Item.get(i));
//                    }
//                    Set<String> chaves = compras.keySet();
////                    for (String chave : chaves) {
////                        double valor = compras.get(chave);
////                        System.out.printf("%s : R$ %.2f\n", chave, valor);
////                    }
//                    compras.forEach((k, v) -> System.out.printf("%s : R$ %.2f\n", k, v));
                    List<Map.Entry<String, Double>> list = new ArrayList<>(compras.entrySet());
                    list.sort(Map.Entry.comparingByValue());
                    for (Map.Entry<String, Double> stringDoubleEntry : list) {
                        System.out.printf("%s R$ %.2f\n", stringDoubleEntry.getKey(), stringDoubleEntry.getValue());
                    }
                }
                case 3 -> {
                    System.out.println("Qual item deseja remover?");
                    String item = sc.nextLine();
                    compras.remove(item);
//                    WrapperArray newList = new WrapperArray(lista_de_compras);
//                    Wrapper itemRemove = new Wrapper("");
//                    method.metodo(newList.refArray, itemRemove.ref);
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
// referência: https://www.dio.me/articles/explorando-o-map-em-java-como-utilizar-esta-funcao-poderosa-para-manipular-colecoes-de-dados
//https://www.delftstack.com/pt/howto/java/how-to-sort-a-map-by-value-in-java/#ordenar-um-mapkey-value-utilizando-sort-m%c3%a9todo-em-java