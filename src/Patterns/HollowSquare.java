package Patterns;

import java.util.Scanner;

/**
 * @author sachin.baghel
 * @date 9/6/2026 10:17 PM
 */

//Print Hollow Square
public class HollowSquare
    {
        public static void printHallowSquare(int n)
            {
                for (int rowNumber = 0; rowNumber < n; rowNumber++)
                    {
                        for (int col = 0; col < n; col++)
                            {
                                if (rowNumber == 0 || rowNumber == n - 1 || col == 0 || col == n - 1)
                                    {
                                        System.out.print("*");
                                    }
                                else
                                    {
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
                printHallowSquare(numberOfRows);
                input.close();
            }
    }
