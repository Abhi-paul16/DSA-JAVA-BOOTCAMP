package com.company;

import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        if(year%4 ==0 && year%100 != 0 || year%400 ==0){
            System.out.println("Leap Year");
        }else{
            System.out.println("not a leap Year");
        }
    }
}
