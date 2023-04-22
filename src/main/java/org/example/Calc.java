package org.example;


import java.util.Stack;

public class Calc {

    private String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public double calculate( String str) {

        Stack<Double> def = new Stack<>();
        double a;
        double b;

        str = reverse(str);
        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case '0' -> def.push(0D);
                case '1' -> def.push(1D);
                case '2' -> def.push(2D);
                case '3' -> def.push(3D);
                case '4' -> def.push(4D);
                case '5' -> def.push(5D);
                case '6' -> def.push(6D);
                case '7' -> def.push(7D);
                case '8' -> def.push(8D);
                case '9' -> def.push(9D);
                case '+' -> {
                    a = def.pop();
                    b = def.pop();
                    def.push(a + b);
                }
                case '-' -> {
                    a = def.pop();
                    b = def.pop();
                    def.push(a - b);
                }
                case '*' -> {
                    a = def.pop();
                    b = def.pop();
                    def.push(a * b);
                }
                case '/' -> {
                    a = def.pop();
                    b = def.pop();
                    def.push(a / b);
                }
            }
            }
        return def.pop();
        }
    }

