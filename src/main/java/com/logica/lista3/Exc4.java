package com.logica.lista3;
import java.util.Scanner;

public class Exc4 {
    public static void main() {
        System.out.println("""
                
                4) Jogo da adivinhação. Peça para alguém escolher um número. Depois peça
                para outra pessoa tentar adivinhar. O programa deverá retornar dicas como:
                    "Muito baixo, muito alto ou quase lá" ou "tá quente, tá frio".
                
                """);
        int numero, contagem=0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Jogador 1, escolha um número: ");
        numero = scanner.nextInt();

        for (int i = 0; i < 50; i++) {
            System.out.println();
            System.out.println();
        }

        int tentativa;
        do {
            System.out.print("Jogador 2, tente adivinhar o número: ");
            tentativa = scanner.nextInt();
            if (tentativa == numero && contagem == 0) {
                contagem++;
                System.out.println("De primeira!!! Incrivél!");
            }else {
                if (tentativa < numero - 10) {
                    System.out.println("Muito baixo");
                    contagem++;
                } else if (tentativa > numero + 10) {
                    System.out.println("Muito alto");
                    contagem++;
                } else if (tentativa < numero - 5) {
                    System.out.println("Quase lá");
                    contagem++;
                } else if (tentativa > numero + 5) {
                    System.out.println("Tá frio ainda");
                    contagem++;
                } else if (tentativa < numero) {
                    System.out.println("Tá muito quente");
                    contagem++;
                } else if (tentativa > numero) {
                    System.out.println("Tá muito quente!");
                    contagem++;
                } else {
                    System.out.println("Parabéns você acertou!");
                    contagem++;
                    System.out.printf("Precisou de %d tentativas", contagem);
                }
            }
        } while (tentativa != numero);

        scanner.close();
    }
}
