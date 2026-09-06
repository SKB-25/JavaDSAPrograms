package Patterns;

import java.util.Scanner;

/**
 * @author sachin.baghel
 * @date 9/4/2026 7:27 PM
 */
public class SolidSquare
    {

        public static void printSolidSquare(int size)
            {
                for (int i = 0; i < size; i++)
                    {
                        for (int j = 0; j < size; j++)
                            {
                                System.out.print("*");
                            }
                        System.out.println();
                    }
            }

        public static void main(String[] args)
            {
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter the size of the square: ");
                int size=sc.nextInt();
                printSolidSquare(size);
            }
    }
