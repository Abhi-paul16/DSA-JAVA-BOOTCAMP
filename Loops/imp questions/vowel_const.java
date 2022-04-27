package com.company;

import java.util.Scanner;

public class vowel_const {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = 'a';

        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            System.out.println(ch + " is vowel");
        else
            System.out.println(ch + " is consonant");



    }
}
