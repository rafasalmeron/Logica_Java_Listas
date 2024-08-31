package com.logica.lista1;

//5) Construa um algoritmo que calcule o valor de um terreno
//baseado na sua área e valor por m2.
//
//        6) Construa um algoritmo que leia 1- a distância percorrida
//por um veículo em km 2- o total gasto em combustível em
//litros. No final deverá ser respondido o consumo médio deste
//veículo em km/l.
//
//7) Escreva um programa que receba quatro notas de um
//aluno e calcule a média aritmética dessas notas.
//
//        8) Suponha que voce trabalhe em um laboratório e seu
//colega mediu a temperatura de um objeto em Fahrenheit.
//Escreva um programa capaz de converter em Celsius.


import java.util.Scanner;

public class Exc5 {
    public static void main(String[] args) {
        double largura,
                comprimento,
                m2,
                pes2,
                pol2,
                jardas2,
                acres,
                hectar;

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

        m2=largura*comprimento;
        pes2=m2*10.764;
        pol2=m2*1550.0031000062;
        jardas2=m2*1.1959900463011;
        acres=m2*0.01;
        hectar=m2*0.0001;

        m2 = largura * comprimento;
        System.out.println("RESULTADO \n"+
                "Metros Quadrados: "+m2+"\n"+
                "Pés Quadrados: "+pes2+"\n"+
                "Polegadas Quadradas: "+pol2+"\n"+
                "Jardas: "+jardas2+"\n"+
                "Acres: "+acres+"\n"+
                "Hectar: "+hectar);
    }
}





