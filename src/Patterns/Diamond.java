package Patterns;

import java.util.Scanner;

/**
 * @author sachin.baghel
 * @date 9/6/2026 10:05 PM
 */

//Print Diamond
public class Diamond
    {
        public static void printPyramid(int n) {
            for(int rowNumber=0; rowNumber<n; rowNumber++) {
                for(int space=0; space<(n-rowNumber-1); space++){
                    System.out.print(" ");
                }
                for(int star=0; star<(2*rowNumber+1); star++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        public static void printInvertedPyramid(int n) {
            for(int rowNumber=n-1; rowNumber>=0; rowNumber--) {
                for(int space=0; space<(n-rowNumber); space++){
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
                System.out.print("Enter number of rows: ");
                int numberOfRows = input.nextInt();
                printPyramid(numberOfRows);
                printInvertedPyramid(numberOfRows-1);
            }
    }
