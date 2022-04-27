package com.company;

import java.util.Scanner;

public class Avg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,count = 1;
        int sum =0;
        n= in.nextInt();
        while(count<=n){
            System.out.println("Enter the" + count +" number" );
            int num = in.nextInt();
            sum +=num;
            count++;
        }
        float avg = sum/(count-1);
        System.out.println("Average of numbers is " + avg);
        System.out.println();
    }
}
