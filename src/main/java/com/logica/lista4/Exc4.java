package com.logica.lista4;
public class Exc4 {
    public static void main() {
        System.out.println("""
                
                4) Escreva um código que irá percorrer uma lista de números inteiros
                lista[ ] = { 3, 5, 6, 7, 8, 10, 22, 55, 110 } e irá contar a quantidade de
                números pares presente nela.
                
                """);
        int[] lista = { 3, 5, 6, 7, 8, 10, 22, 55, 110 };
        int pares=0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] % 2  == 0  ) {
                pares++;
            }
        }
        System.out.printf("Lista tem %d numeros pares.\n",pares);
    }
}
