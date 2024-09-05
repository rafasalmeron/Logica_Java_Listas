package com.logica.lista2;
import java.util.Scanner;

public class Exc8 {

    public static class Score {
        int goals = 0;
        int fails = 0;
        String mensagemSW;
        Scanner sc = new Scanner(System.in);
        String option;
    }

    public static void question1(Score scr) {
            System.out.println("""
                Qual é o maior planeta do sistema solar?
                a) Terra
                b) Marte
                c) Júpter
                d) Saturno
                """);
            scr.option = scr.sc.nextLine();
            scr.mensagemSW = switch (scr.option) {
                case "a","b","d" -> {
                    scr.fails++;
                    yield "Resposta errada!";
                }
                case "c" -> {
                    scr.goals++;
                    yield "Resposta correta!";
                }
                default -> {scr.fails++;
                    yield "opção invalida!";
                }
            };
        System.out.println(scr.mensagemSW);
    }

    public static void question2(Score scr) {

        System.out.println("""
                Quem pintou a Mona Lisa?
                a) Vincent van Gogh
                b) Pablo Picasso
                c) Leonardo da Vinci
                d) Claude Monet
                """);
        scr.option = scr.sc.nextLine();
        scr.mensagemSW = switch (scr.option) {
            case "a","b","d" -> {
                scr.fails++;
                yield "Resposta errada!";
            }
            case "c" -> {
                scr.goals++;
                yield "Resposta correta!";
            }
            default -> {scr.fails++;
                yield "opção invalida!";
            }
        };
        System.out.println(scr.mensagemSW);
    }

    public static void question3(Score scr) {

        System.out.println("""
                Em que país se encontra a Torre Eiffel?
                a) Itália
                b) França
                c) Alemanha
                d) Espanha
                """);

        scr.option = scr.sc.nextLine();
         scr.mensagemSW = switch (scr.option) {
            case "a","c","d" -> {
                scr.fails++;
                yield "Resposta errada!";
            }
            case "b" -> {
                scr.goals++;
                yield "Resposta correta!";
            }
            default -> {scr.fails++;
                yield "opção invalida!";
            }
        };
        System.out.println(scr.mensagemSW);
    }

    public static void question4(Score scr) {

        System.out.println("""
                Qual é a capital do Japão?
                a) Pequim
                b) Seul
                c) Tóquio
                d) Bangkok
                """);

        scr.option = scr.sc.nextLine();
        scr.mensagemSW = switch (scr.option) {
            case "a","b","d" -> {
                scr.fails++;
                yield "Resposta errada!";
            }
            case "c" -> {
                scr.goals++;
                yield "Resposta correta!";
            }
            default -> {scr.fails++;
                yield "opção invalida!";
            }
        };
        System.out.println(scr.mensagemSW);
    }

    public static void question5(Score scr) {

        System.out.println("""
                Quem foi o primeiro homem a pisar na Lua?
                a) Yuri Gagarin
                b) Buzz Aldrin
                c) Neil Armstrong
                d) Michael Collins
                """);
        scr.option = scr.sc.nextLine();
        scr.mensagemSW = switch (scr.option) {
            case "a","b","d" -> {
                scr.fails++;
                yield "Resposta errada!";
            }
            case "c" -> {
                scr.goals++;
                yield "Resposta correta!";
            }
            default -> {scr.fails++;
                yield "opção invalida!";
            }
        };
        System.out.println(scr.mensagemSW);
    }

    public static void main() {
        System.out.println("""
                
                Exercício 8
                
                8) Crie um joguinho de perguntas e respostas múltipla escolha.
                O programa deverá fazer 5 perguntas (Uma por vez).
                Se ele errar 3 vezes ele perde o jogo.
                Se o usuário chegar até o final,
                o programa deve exibir o número de acertos.
                
                """);

        int answer=0;
        Score scr = new Score();

            while (scr.fails < 3 && answer < 5){
                switch (answer) {
                    case 0 -> question1(scr);
                    case 1 -> question2(scr);
                    case 2 -> question3(scr);
                    case 3 -> question4(scr);
                    case 4 -> question5(scr);
                }
                answer++;
            }
        System.out.println("RESULTADO");
        System.out.println("Perguntas: " + (answer+1));
        System.out.println("Acertos: " + scr.goals);
        System.out.println("Erros: " + scr.fails);
    }
}
