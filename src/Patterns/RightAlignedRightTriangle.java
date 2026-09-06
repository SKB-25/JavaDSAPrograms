package Patterns;

import java.util.Scanner;

/**
 * @author sachin.baghel
 * @date 9/6/2026 6:29 PM
 */

//Print Right Aligned Right Triangle Sample Output (n=5)
public class RightAlignedRightTriangle
    {
        public static void printPattern(int n){
            for(int i=0; i<n; i++){
                int numberOfSpaces = n-i-1;
                for(int j=0; j<numberOfSpaces; j++){
                    System.out.print(" ");
                }
                int numberOfStars = i+1;
                for(int k=0; k<numberOfStars; k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        static void main(String[] args)
            {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter number of rows: ");
                int numberOfRows = input.nextInt();
                printPattern(numberOfRows);
            }
    }
