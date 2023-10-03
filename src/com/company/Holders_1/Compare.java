package com.company.Holders_1;

public class Compare<T extends Comparable>{
    /*public void compareValues(String a, String b) {
        if(a.compareTo(b) > 0) {
            System.out.printf("Wartosc %s jest wieksza od %s\n", a, b);
        } else if(a.compareTo(b) < 0) {
            System.out.printf("Wartosc %s jest mniejsza od %s\n", a, b);
        } else {
            System.out.printf("Wartosc %s jest rowna %s\n", a, b);
        }
    }

    public void compareValues(int a, int b) {
        if(a > b) {
            System.out.printf("Wartosc %s jest wieksza od %s\n", a, b);
        } else if(a < b) {
            System.out.printf("Wartosc %s jest mniejsza od %s\n", a, b);
        } else {
            System.out.printf("Wartosc %s jest rowna %s\n", a, b);
        }
    }

    public void compareValues(float a, float b) {
        if(a > b) {
            System.out.printf("Wartosc %s jest wieksza od %s\n", a, b);
        } else if(a < b) {
            System.out.printf("Wartosc %s jest mniejsza od %s\n", a, b);
        } else {
            System.out.printf("Wartosc %s jest rowna %s\n", a, b);
        }
    }

    public void compareValues(double a, double b) {
        if(a > b) {
            System.out.printf("Wartosc %s jest wieksza od %s\n", a, b);
        } else if(a < b) {
            System.out.printf("Wartosc %s jest mniejsza od %s\n", a, b);
        } else {
            System.out.printf("Wartosc %s jest rowna %s\n", a, b);
        }
    }

    public void compareValues(byte a, byte b) {
        if(a > b) {
            System.out.printf("Wartosc %s jest wieksza od %s\n", a, b);
        } else if(a < b) {
            System.out.printf("Wartosc %s jest mniejsza od %s\n", a, b);
        } else {
            System.out.printf("Wartosc %s jest rowna %s\n", a, b);
        }
    }*/

    public void compareValues(T a, T b) {
        if(a.compareTo(b) > 0) {
            System.out.printf("Wartosc %s jest wieksza od %s\n", a, b);
        } else if(a.compareTo(b) < 0) {
            System.out.printf("Wartosc %s jest mniejsza od %s\n", a, b);
        } else {
            System.out.printf("Wartosc %s jest rowna %s\n", a, b);
        }
    }
}
