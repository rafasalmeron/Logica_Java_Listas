package com.logica.lista2;
import java.util.Scanner;

public class Exc3 {
    public static void Menu() {
        System.out.println("""
                Digite a opção caso se encaixe:
                1. Tenho mais de 65 anos.
                2. Possuo alguma deficiência.
                3. Sou gestante.
                4. Nenhuma das opções.
                """);
    }
    public static void main() {
        System.out.println("""
                
                Exercício 3
                
                3) Um banco contratou você para que escreva um programa
                que será utilizado pelo usuário em um tablet.
                O programa irá fazer 3 perguntas e encaminhar o cliente para 2 filas.
                A fila comum e a fila preferencial.
                Se o cliente atender a uma das condições a seguir ele deve ser encaminhado
                para a fila preferencial.
                As condições são: Ter mais de 65 anos, se deficiente ou gestante.
                
                """);
        Menu();
        int opcao;
        Scanner sc = new Scanner(System.in);
        opcao = sc.nextInt();
        String mensagem = switch (opcao) {
            case 1,2,3 -> "Vá para fila preferêncial.";
            default -> "Fila comum.";
        };
        System.out.println(mensagem);
    }
}
