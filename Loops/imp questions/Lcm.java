package com.company;

import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);

        int numone = 100;
        int numtwo = 200;
        int Lcm = 1;
      int i = 2;
        while (i<=numone || i<=numtwo){
            if(numone%i == 0 && numtwo%i == 0){
                //numone = numone/i;
                numtwo = numtwo/i;
                System.out.println(i);
                Lcm *=i;

            }else {
                i++;
            }
        }
        System.out.println(Lcm);
    }
}
