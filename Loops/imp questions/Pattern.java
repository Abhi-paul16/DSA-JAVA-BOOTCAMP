package com.company;

import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i , j ,row = 6;
      //Right Triangle Pattern
//        for(i=1; i<row; i++ ){
//            for (j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }

// Downward Triangle
//        for(i=1; i<row; i++ ){
//            for(j=1; j<row-i; j++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }

        // Left Triangle Pattern

//        for(i=1; i<row; i++){
//            for (j=1; j<row-i; j++){
//                System.out.print(" ");
//            }
//            for (j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println("");
//        }

        // Pyramid Pattern Program

//        for(i=1; i<row; i++){
//            for (j=1; j<row-i; j++){
//                System.out.print(" ");
//            }
//            for (j=1; j<=i; j++){
//                System.out.print("*");
//                System.out.print(" ");
//            }
//            System.out.println("");
//
//        }

        // Reverse Pyramid

//   for(i=0; i<row; i++){
//       for (j=0; j<=i; j++){
//           System.out.print(" ");
//       }
//       for(j=0; j<row-i; j++){
//
//           System.out.print("*");
//           System.out.print(" ");
//       }
//       System.out.println(" ");
//   }

        // Diamond Pattern Program
//        for(i=1; i<row; i++){
//            for (j=1; j<row-i; j++){
//                System.out.print(" ");
//            }
//            for (j=1; j<=i; j++){
//                System.out.print("*");
//                System.out.print(" ");
//            }
//            System.out.println("");
//
//        }
//        for (i=1; i<row-1; i++){
//           for(j=1; j<=i; j++){
//               System.out.print(" ");
//           }
//            for (j=6-i; j>1; j--){
//                System.out.print("*");
//                System.out.print(" ");
//            }
//            System.out.println(" ");
//        }

        //8. Right Down Mirror Star Pattern
//        for(i=1; i<row; i++){
//            for(j=1; j<i; j++){
//                System.out.print(" ");
//            }
//            for(j=1; j<=row-i; j++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }

        //Right Pascal's Triangle
    /*
        for(i=1; i<=row; i++){
            for(j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(i=2; i<=row; i++){
            for(j=i; j<=row; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

     */
        //Left Pascal's Triangle

//        for(i=1; i<row; i++){
//            for(j=1; j<=row-i; j++){
//                System.out.print(" ");
//            }
//            for(j=1; j<=i; j++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }
//        for(i=1; i<row-1; i++){
//            for(j=0; j<=i; j++){
//                System.out.print(" ");
//            }
//            for (j=i; j<row-1; j++){
//                System.out.print("*");
//            }
//            System.out.println(" ");
//        }


        //Sandglass
     /*   for(i=1; i<row; i++){
            for(j=2; j<=i; j++){
                System.out.print(" ");
            }
            for(j=i; j<row; j++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println("");
        }
        for(i=1; i<row; i++){
            for(j=i+1; j<row; j++){
                System.out.print(" ");
            }
            for(j=1; j<=i; j++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println("");
        }

      */


    }
}
