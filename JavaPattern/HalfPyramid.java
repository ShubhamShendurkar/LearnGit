/*Print Half Pyramid

                                        *
                                        **
                                        ***
                                        ****
                                        *****
                                        ******

                                       */

package JavaPattern;

import java.util.Scanner;

public class HalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        for(int i =1;i<=row;i++)
        {
            for(int j = row;j<=1;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
