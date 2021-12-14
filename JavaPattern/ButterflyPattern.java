package JavaPattern;

import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
       for( int i = 1;i<=num;i++)
        {
            for(int j = 1;j<=i;j++)
            {
                System.out.print("*");
            }
            for(int k=i*2;k<=num*2-1;k++)
            {
                System.out.print(" ");
            }
            for(int j = 1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 1;i<=num-1;i++)
        {
            for(int j=num-1;j>=i;j--)
            {
                System.out.print("*");
            }
            for(int k = 1;k<=i*2;k++)
            {
                System.out.print(" ");
            }
            for(int j=num-1;j>=i;j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
