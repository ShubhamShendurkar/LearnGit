/*
    print  Mirror Pyramid

                                             *
                                            **
                                           ***
                                          ****
                                         *****
 */
package JavaPattern;

import java.util.Scanner;

public class MirrorHalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int i = 1;i<=row;i++)
        {
            for (int j=row-i;j>=1;j--)
            {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
