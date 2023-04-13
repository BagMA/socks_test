//package com.exmple;
//
//import com.exmple.dao.Accounting;
//import com.exmple.entity.Socks;
//
//import java.util.List;
//
//public class Main {
//    public static void main(String[] args) {
//        Accounting accounting = new Accounting();
//
//        accounting.arrivalOfSocks(5, "red", 50);
//        accounting.arrivalOfSocks(4, "black", 80);
//        accounting.arrivalOfSocks(7, "green", 20);
//        accounting.arrivalOfSocks(4, "red", 70);
//        accounting.arrivalOfSocks(6, "black", 30);
//
//        System.out.println(accounting.getSocksList());
//
////        List<Socks> socks = accounting.departureOfSocks("black", Operation.EQUAL, 30);
////        for (Socks s: socks) {
////            System.out.println(s);
////        }
////
////        System.out.println(accounting.getSocksList());
//
//        List<Socks> socks = accounting.departureOfSocks("black");
//        for (Socks s: socks) {
//            System.out.println(s);
//        }
//
//        System.out.println(accounting.getSocksList());
//    }
//}
