package com.company;

import java.util.Scanner;

public class questions {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
//        int a = input.nextInt();
//        int b = input.nextInt();
//        int c = input.nextInt();
        // q - find largest of three numbers?
      /*  if(a>b && a>c){
            System.out.println( a  + " is the largest number");
        }else if( b>a && b>c){
            System.out.println(b + " is the largest number");
        }else{
            System.out.println(c + " is the largest number");
        }

       Kunal way
        int max = a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max =c;
        }
        System.out.println(max);
       */

        // Ques - Casecheck
     /*   char ch = input.next().trim().charAt(0);
        if(ch >='a' && ch <='z'){
            System.out.println("lowerCase");
        }else{
            System.out.println("upperCase");
        }
*/
        //q - fint the nth fibonacci number
/*
            int n = input.nextInt();
            int a = 0;
            int b = 1;
            int count = 2;
            while (count <= n) {
                   int temp = b;
                   b = b +a ;
                   a =temp;
                   count++;
            }
        for ( int count=1; count<=n; count++){
            System.out.println(a);
            int nextnum = a+b;
            a= b;
            b=nextnum;
        }
        System.out.println(b);
  */
        // question - Number Occurence
//        int n = 4335643;
//        int count = 0;
//        while (n>0){
//            int rem = n%10;
//            if(rem == 3){
//                count++;
//            }
//            n = n/10;
//        }
//        System.out.println(count);

 // Reverse of a number
//        int n = 45689;
//        int reverse = 0;
//        while (n>0){
//            int rem = n%10;
//            n /=10;
//             reverse = reverse *10+ rem;
//
//        }
//        System.out.println(reverse);

        // calculator Program

        int ans = 0;
        while(true){
            System.out.println("Enter the Operator");
            char ch = input.next().trim().charAt(0);


            if(ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%'){
                System.out.println("Enter Two numbers");
                int num1 = input.nextInt();
                int num2 = input.nextInt();
                if(ch=='+'){
                    ans = num1 + num2;
                }
                if(ch=='-'){
                    ans = num1 - num2;
                }
                if(ch=='*'){
                    ans = num1 * num2;
                }
                if(ch=='/'){
                    if(num2>num1){
                        ans = num1 / num2;
                    }
                }
                if(ch=='%'){
                    ans = num1 % num2;
                }

            }else if(ch == 'x' || ch =='X'){
                break;
            }else{
                System.out.println("Entered Wrong Input");
            }
            System.out.println(ans);
        }

    }

}
