package Patterns;

import java.util.Scanner;

/**
 * @author sachin.baghel
 * @date 9/6/2026 9:54 PM
 */

//Print Inverted Pyramid (Centered)
public class InvertedPyramidCentered
    {
        public static void printPatterns(int n) {
            for(int rowNumber=n-1; rowNumber>=0; rowNumber--){
                for (int space=0; space<(n - rowNumber -1); space++)
                    {
                        System.out.print(" ");
                    }
                for(int star=0; star<(2*rowNumber+1); star++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        static void main(String[] args)
            {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter a number of rows: ");
                int numberOfRows = input.nextInt();
                printPatterns(numberOfRows);
            }
    }
