package com.company;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//Type conversion => when one type of data(for ex - int) assigned to another type of data an automatic type conversion
// will take place known as type conversion.
//        float x = input.nextFloat();
//        System.out.println(x);
//now if we give int to x (for ex- 5 )it will give us back 5.0 why? Because of Type conversion thing taking place.
//type conversion only occur when designation type greater than source type.

        //Typecasting => In type casting we from ourself convert one type of data to another type.

//        int i = (int)(405.4543f);
//        System.out.println(i);

//        Automatic Type Promotion in  expression
//        int a = 258;
//        byte b = (byte)(a);
//        System.out.println(b); output is 2 (258 % 256 = 2)

//        byte a = 50;
//        byte b = 50;
//        byte c = 100;
//        int d  = (a*b)/c;
//        System.out.println(d); output is 25
// now take a look here a & b is byte type. so byte * byte should be give us byte type only but value of byte is
// not more than 256 and 50*50 is 2000 so how byte can store it that much value so solving this kind issue java develop
// inbuilt  automatic type promotion in expression which while evaluating expressions(+,-,*,/) if value exceed the range
// of operand the expression value will be promoted .
        //conditions for type promotion check notebook:)
    }
}



