package org.example;



import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Calc def = new Calc();
        Scanner read = new Scanner(System.in);
        System.out.println("Введите выражение: ");
        String str = read.nextLine();
        System.out.println(def.calculate(str));

    }
}