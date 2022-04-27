package com.company;

import java.util.Scanner;

public class reversestring {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String name = "Abhishek" , reverse = "";
        char ch;
        for(int i =0; i<name.length(); i++){
            ch = name.charAt(i);

            reverse = ch+reverse;
        }
        System.out.println(reverse);
    }
}
