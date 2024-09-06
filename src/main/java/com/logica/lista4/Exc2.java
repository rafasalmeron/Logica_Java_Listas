package com.logica.lista4;
public class Exc2 {
    public static void main(String[] args) {
        System.out.println("""
                
                2) Agora que voce sabe o fechamento do dia, monte um código que
                identifique a compra de menor valor e a compra de maior valor
                
                """);
        double[] vendas = {150.00, 120.15, 55.90, 33.60, 77.50};
        double menor = Integer.MAX_VALUE;

        for (double venda : vendas) {
            if (venda < menor) {
                menor = venda;
            }
        }
        System.out.println("Venda de menor valor: "+menor);
    }
}
