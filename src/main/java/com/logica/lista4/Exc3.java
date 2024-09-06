package com.logica.lista4;
public class Exc3 {
    public static void main(String[] args) {
        System.out.println("""
                
                3) Ainda utilizando o exercício do mercado, calcule o ticket médio de
                vendas do dia
                
                """);
        double[] vendas = {150.00, 120.15, 55.90, 33.60, 77.50};
        double total = 0;

        for (double venda : vendas){
            total += venda;
        }
        total = total / vendas.length;
        System.out.printf("Ticket médio: %.2f\n", total);
    }
}
