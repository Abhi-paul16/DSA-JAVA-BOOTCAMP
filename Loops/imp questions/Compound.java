package com.company;

import java.util.Scanner;

public class Compound {
    //    Compound Interest Java Program
    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int P = in.nextInt();
        float r = in.nextInt();
        int n = in.nextInt();
        float R = r/100;
        System.out.println(R);
        double z = Math.pow(1 +R, n);
        System.out.println(z);
        double A = (P) * z;
        System.out.println(A);
    }
}