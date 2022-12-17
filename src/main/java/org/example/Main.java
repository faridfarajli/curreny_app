package org.example;

import java.text.DecimalFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static int a,b;
    static double d;
    public static void main(String[] args) {

        convert();
    }

    public static void convert(){
        DecimalFormat df = new  DecimalFormat("##.##");

        System.out.println("Valyuta tətbiqinə xoş geldiniz");
        System.out.println("Hansıdan:");
        System.out.println("\n1 AZN" + "\n2 TRY" + "\n3 USD" );
        Scanner sc = new Scanner(System.in);
        try {
        a = sc.nextInt();
        }catch (InputMismatchException e){
        System.err.println("Sadcə rəqəm istifadə edin");
        convert();
    }
        System.out.println("Hansına:");
        System.out.println("\n1 AZN" + "\n2 TRY" + "\n3 USD");
        try {
         b = sc.nextInt();
        }catch (InputMismatchException e){
            System.err.println("Sadcə rəqəm istifadə edin");
            convert();
        }
        System.out.println("Dəyər:");
        try {
            d = sc.nextInt();
        }catch (InputMismatchException e){
            System.err.println("Sadcə rəqəm istifadə edin");
            convert();
        }



        if (a == 1 && b == 1) {
            System.out.println("Yazdığınız dəyər nəticə ilə bərabərdir");
        } else if (a == 2 && b == 2) {
            System.out.println(d + "Yazdığınız dəyər nəticə ilə bərabərdir");
        } else if (a == 3 && b == 3) {
            System.out.println(d + "Yazdığınız dəyər nəticə ilə bərabərdir");
        } else if (a == 1 && b == 2) {
            System.out.println(df.format(d)+" Azərbaycan Manatı " + df.format(d / 10.9734 )+ " Türkiyə Lirasına bərabərdir");

        } else if (a == 1 && b == 3) {
            System.out.println(df.format(d)+" Azərbaycan Manatı " + df.format(d / 1.70 )+ " Amerika  Dollarına bərabərdir");


        } else if (a == 2 && b == 1) {
            System.out.println(df.format(d)+ " Türkiyə Lirası "+ df.format(d*10.9734)  + " Azərbaycan Manatına bərabərdir");

        } else if (a == 3 && b == 1) {
            System.out.println(df.format(d)+" Amerika  Dolları "+df.format(d*1.70 )  + " Azərbaycan Manatına bərabərdir");

        }else if (a == 2 && b == 3) {
            System.out.println(df.format(d)+" Amerika  Dolları " +df.format(d*18.623 ) + " Türkiyə Lirasına bərabərdir");

        }else if (a == 3 && b == 2) {
            System.out.println(df.format(d)+ " Türkiyə Lirası "+df.format(d/ 18.623)  +" Amerika  Dollarına bərabərdir");


        }else {
            System.out.println("Yazdığınız format səhvdir");
            convert();
        }
    }
}