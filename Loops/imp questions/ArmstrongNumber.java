package com.company;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
//        Armstrong Number In Java
//        ex of Armstrong num = 153  = 1*1*1 + 5*5*5 + 3*3*3
       int num = 153;
       int ar = 0;
       while (num!=0){
           int ld = num%10;
           double  cube= Math.pow(ld , 3);
           ar += cube;
//           System.out.println(cube);
//           System.out.println(ar);
           num /=10;
       }
if (ar == num){
    System.out.println("armstrong");
}


    }
}
