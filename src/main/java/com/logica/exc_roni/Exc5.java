package com.logica;
 /*5) Uma empresa paga R$10.00 por hora normal trabalhada e R$ 15.00 por hora extra.
	Escreva um algoritmo que leia o total de horas normais trabalhadas e o total de
	horas extras trabalhadas por um empregado em um ano e calcule o salário anual deste trabalhador.

	Exemplo :   Entrada :   Digite o número de horas trabalhadas no ano : 1760
	                        Digite o número de horas extras trabalhadas no ano : 400
                Saída :     Seu salário anual é de : R$ 23600 */

import java.util.Scanner;

public class Exc5 {
    public static void main(String[] args) {
        int hr_ext, hr_norm;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas horas trabalhadas? (Anual)");
        hr_norm = sc.nextInt();
        System.out.println("Quantas horas EXTRAS trabalhadas? (Anual)");
        hr_ext = sc.nextInt();
        System.out.println("Seu salário é " +((hr_norm*10) + (hr_ext*15))+" por ano.");
    }
}
