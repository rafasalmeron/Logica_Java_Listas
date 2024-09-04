package com.logica.lista4;
import java.util.Scanner;

public class Exc6 {
    public void metodo(String[] l, String o){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual item deseja remover?");

        for (int i = 0; i < l.length; i++) {
            if (l[i] == null) {
                break;
            }
            System.out.printf("%d. %s",i,l[i]);
        }
        o = sc.nextLine();
        String finalO1 = o;
        String[] newList = java.util.Arrays.stream(l)
                .filter(item -> item != null && item.equals(finalO1))
                .toArray(String[]::new);
        for (String item : newList) {
            System.out.println(item);
        }
    }
}
