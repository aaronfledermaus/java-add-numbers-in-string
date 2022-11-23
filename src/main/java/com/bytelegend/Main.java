package com.bytelegend;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }

    public static String add(String a, String b) {
        int numA = 0;
        int numB = 0;
        if (a != null) {
            numA = Integer.parseInt(a);
        }
        if (b != null) {
            numB = Integer.parseInt(b);
        }
        return String.valueof(numA + numB)
    }
}
