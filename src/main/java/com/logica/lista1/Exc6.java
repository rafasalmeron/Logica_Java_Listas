package com.logica.lista1;

//6) Construa um algoritmo que leia
// 1- a distância percorrida por um veículo em km
// 2 - o total gasto em combustível em litros.
// No final deverá ser respondido o consumo médio deste
// veículo em km/l.
//

import java.util.Scanner;

public class Exc6 {
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
