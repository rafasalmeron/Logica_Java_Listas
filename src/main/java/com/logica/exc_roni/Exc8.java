package com.logica.exc_roni;

import java.util.Scanner;

/*8) Calcule a área e o preço de um terreno
    area = largura x comprimento
    preco = área x preco do metro quadrado */
public class Exc8 {
    public static void main(String[] args) {
        double largura, comprimento, m2;

        System.out.println(
                """
                            a   \s
                        +-------+
                        |       |
                        |       |b
                        |       |
                        +-------+
                        """);
        Scanner sc = new Scanner(System.in);
        System.out.println("a = largura. b = comprimento\n");
        System.out.println("Digite o valor do comprimento: ");
        comprimento = sc.nextDouble();
        System.out.println("Digite o valor da largura: ");
        largura = sc.nextDouble();

        m2 = largura * comprimento;
        System.out.println("RESULTADO \n"+
                "Metros Quadrados: "+m2);
    }
}
