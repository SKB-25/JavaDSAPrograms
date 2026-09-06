package Patterns;

import java.util.Scanner;

/**
 * @author sachin.baghel
 * @date 9/6/2026 9:29 PM
 */

//Print Pyramid (Centered)
public class CenteredPyramid
    {
        public static void printPatterns(int n) {
            for(int rowNumber=0; rowNumber<n; rowNumber++){
                for(int space=0; space<(n-rowNumber-1); space++){
                    System.out.print(" ");
                }
                for(int stars=0; stars<(2*rowNumber+1); stars++){
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
                printPatterns(numberOfRows);
            }
    }
