package com.logica.lista4;

//1) Voce é gerente de um supermercado e sabe que os valores das
//vendas do dia são gravados em um vetor. Digite um código que faça o
//fechamento (soma) de vendas do dia de maneira automatizada.

public class Exc1 {
    public static void main(String[] args) {
        double vendas[] = {150.00, 120.15, 55.90, 33.60, 77.50};
        double total = 0;
//        for (int i = 0; i < vendas.length; i++) {
//            total += vendas;
//        }
        for (double venda : vendas){
            total += venda;
        }
        System.out.println("\nTotal de vendas do dia: " + total);
    }
}
