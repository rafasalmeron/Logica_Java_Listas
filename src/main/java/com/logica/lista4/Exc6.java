//package com.logica.lista4;
//import java.util.List;
//import java.util.Scanner;
//
//public class Exc6 {
//    public void metodo(List<String> l, String o){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Qual item deseja remover?");
//
//        for (int i = 0; i < l.size(); i++) {
//            if (l.get(i) == null) {
//                break;
//            }
//            System.out.printf("%d. %s\n",i,l.get(i));
//        }
//        o = sc.nextLine();
//        String finalO1 = o;
//        boolean removed = false;
//
//        for (int i = 0; i < l.size(); i++) {
//            if (l.get(i).equals(finalO1)) {
//                l.get(i) = null;
//                removed = true;
//                break;
//            }
//        }
//
//        if (removed) {
//            System.out.println("Item removido com sucesso!");
//        }else {
//            System.out.println("Item não encontrado!");
//        }
//
//        for (String item : l) {
//            if (item != null) {
//                System.out.println(item);
//            }
//        }
////        String[] newList = java.util.Arrays.stream(l)
////                .filter(item -> item != null && item.equals(finalO1))
////                .toArray(String[]::new);
////        for (String item : newList) {
////            System.out.println(item);
////        }
//    }
//}
