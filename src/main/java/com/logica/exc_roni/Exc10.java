package com.logica;

import java.util.Scanner;

/*10) Criar um algoritmo para ler um tempo em segundos e fazer a impressão no
       console no seguinte formato: hora:minuto:segundos */
public class Exc10 {
    public static void main(String[] args) {
        int seg, min, hr;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite quantos segundos quer tranformar segundos: ");
        seg = sc.nextInt();

        hr = seg / 3600;
        min = (seg % 3600) / 60;
        seg = seg % 60;
        System.out.printf("%02d:%02d:%02d", hr, min, seg);
    }
}
