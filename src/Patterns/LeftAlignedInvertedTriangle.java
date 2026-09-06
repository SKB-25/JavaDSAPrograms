package Patterns;

import java.util.Scanner;

/**
 * @author sachin.baghel
 * @date 9/6/2026 6:48 PM
 */
// Print Left Aligned Inverted Triangle
public class LeftAlignedInvertedTriangle
    {
        public static void printPatterns(int n){
            for(int i=n-1; i>=0; i--){
                int numberOfStars = i+1;
                for(int k=0; k<numberOfStars; k++){
                    System.out.print("* ");
                }
//                int numberOfSpaces = n-i-1;
//                for(int j=0; j<numberOfSpaces; j++){
//                    System.out.print(" ");
//                }
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
