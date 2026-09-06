package Patterns;

import java.util.Scanner;

/**
 * @author sachin.baghel
 * @date 9/4/2026 7:54 PM
 */
public class LeftAlignedRightTriangle
    {

        public static void printLeftAlignedRightTriangle(int size)
            {
                for (int i = 1; i <= size; i++)
                    {
                        for (int j = 1; j <= i; j++)
                            {
                                System.out.print("*");
                            }
                        System.out.println();
                    }
            }

        public static void main(String[] args)
            {
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter the size of the triangle: ");
                int size=sc.nextInt();
                printLeftAlignedRightTriangle(size);
            }
    }
