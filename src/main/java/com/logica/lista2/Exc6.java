package com.logica.lista2;
import java.util.Scanner;

public class Exc6 {
    public static void main() {
        System.out.println("""
                
                Exercício 2
                
                6) Crie um programa que receba as notas de um aluno e
                informe se ele foi aprovado ou reprovado.
                Se o aluno ficar com média acima de 6 nas 2 primeiras provas ele passou.
                Senão o programa deverá perguntar a nota de recuperação
                que irá substituir a menor nota.
                A pergunta de recuperação deverá aparecer
                somente para os alunos que precisarem.
                
                """);
        double nota1, nota2, media, notaRec;

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as 4 notas: ");

        System.out.println("Nota 1");
        nota1 = sc.nextDouble();
        System.out.println("Nota 2");
        nota2 = sc.nextDouble();
        media = (nota1 + nota2) / 2;

        if (media >= 6) {
            System.out.println("Aprovado!");
        } else if (media < 6 ) {
            System.out.println("Qual foi a nota de recuperação?");
            notaRec = sc.nextDouble();
            if(nota1 < nota2){
                nota1 = notaRec;
            }else{
                nota2 = notaRec;
            }
            media = (nota1 + nota2) / 2;
            if (media >= 6){
                System.out.println("Aprovado!");
            }else if(media < 6){
                System.out.println("Reprovado!");
            }
        }
    }
}
