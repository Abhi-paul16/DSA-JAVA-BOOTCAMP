package com.company;

import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//Factorial Program In Java
  /*    int n = 4;
        int fact =1;
        for(n=1; n<=4; n++){
            fact = fact*n;
           }
        System.out.println(fact);
*/

//        Calculate Average Of N Numbers
  /*      int n,count = 1;
        float sum = 0;
        System.out.println("Enter the value of n ");
        n = in.nextInt();

        while(count<=n){
            System.out.println("Enter the" + count + "number");
            int num = in.nextInt();
            sum +=num;
            count++;
            System.out.println(sum);
        }
        System.out.println(sum/n);

   */

//        Calculate Discount Of Product
 /*       System.out.println("Enter the Price");
        int Price = in.nextInt();
        System.out.println("Enter the Discount Percentage");
        float Discount = in.nextFloat();
        System.out.println(Discount/100);
        float EffectivePrice =Price - Price *( Discount/100);
        System.out.println("Effective Price "+ EffectivePrice);

  */
//        Calculate Distance Between Two Points
 /*       System.out.println("Enter vlaue of X1");
        int x1= in.nextInt();;
        System.out.println("Enter vlaue of X2");
        int x2 = in.nextInt();
        System.out.println("Enter vlaue of y1");
        int y1 = in.nextInt();
        System.out.println("Enter vlaue of y2");
        int y2 = in.nextInt();
        int x = (x2-x1)*(x2-x1);
        int y = (y2-y1)*(y2-y1);

        System.out.println(x);
        System.out.println(y);
       double Distance = Math.sqrt(x+y);
        System.out.println(Distance );

  */

//        Calculate Commission Percentage
/*        System.out.println("Enter the value");
        float value = in.nextFloat();
        System.out.println("Enter comission on this value");
        float Commission = in.nextFloat();
        float C_Percentage = (Commission/value)*100;
        System.out.println("Commission Percentage is " + C_Percentage);

 */
//        Power In Java

//        Calculate Depreciation of Value
   /*      int cost = in.nextInt();
         int Svalue = in.nextInt();
         int life = in.nextInt();
         int Dep = (cost-Svalue)/life;
        System.out.println(Dep);

    */
//        Calculate Batting Average
        /*
        int n,count =1;
        int runsum = 0;
        n= in.nextInt();
        while (count <=n){
            System.out.println("Enter the run in " + count + "Match");
            int run = in.nextInt();

            runsum += run;
            count++;

        }

        float BattingAvg = runsum/(count-1);
        System.out.println(BattingAvg);

         */
//        Calculate CGPA Java Program

/*        System.out.println("Enter your Percentage ");
         float percentage = in.nextFloat();
         double Cgpa =  (percentage/9.5); // we give double to the cgpa because we can not give the larger value to the right hand side.
        System.out.println(Cgpa);

 */



        //Calculate Electricity Bill
/*        System.out.println("Enter the unit Consumed/Month");
        int unit = in.nextInt();
        int Bill = unit*7;
        System.out.println( Bill +  " is your Bill");
*/

    }
}
