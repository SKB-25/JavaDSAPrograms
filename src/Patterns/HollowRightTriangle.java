package Patterns;

import java.util.Scanner;

/**
 * @author sachin.baghel
 * @date 9/7/2026 10:50 PM
 */

// Hollow Right Triangle
public class HollowRightTriangle
    {

        public static void printPattern(int n){
            for(int row=0; row<n; row++){
                for(int col=0; col<row+1; col++){
                    if(col == 0 || col == row || row == n-1){
                        System.out.print("*");
                    }
                    else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }

        static void main(String[] args)
            {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter number of rows: ");
                int numberOfRows = input.nextInt();
                printPattern(numberOfRows);
            }
    }
