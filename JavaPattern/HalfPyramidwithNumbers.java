package JavaPattern;

import java.util.Scanner;

public class HalfPyramidwithNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for(int i = 1;i<=number;i++)
        {
            for(int m=number-i;m>=1;m--)
            {
                System.out.print(" ");
            }
            for (int k=1;k<=i;k++)
            {
                System.out.print(k+" ");
            }

            System.out.println();
        }
    }
}
