package com.logica;

import java.util.Scanner;

/*9) Fazer um algoritmo para ler a distância percorrida em km e o total gasto de combustível,
        no final deverá ser exibido o consumo médio do carro. */
public class Exc9 {
    public static void main(String[] args) {

        int km, gas;

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a distancia percorrida em km?");
        km = sc.nextInt();
        System.out.println("Total gasto com combustivél em litros?");
        gas = sc.nextInt();

        System.out.println("Seu carro teve o consumo  médio de "+(km/gas)+" km/l.");
    }
}
