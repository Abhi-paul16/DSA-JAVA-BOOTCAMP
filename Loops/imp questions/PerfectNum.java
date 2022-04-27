package com.company;

import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 28;
        int sum = 0;
        for(int i = 1; i<num; i++){
            if(num%i == 0){
                sum += i;
            }
        }
       if(sum == num)
           System.out.println("Perfect Number");
       else
           System.out.println("Imperfect Num");
    }
}
