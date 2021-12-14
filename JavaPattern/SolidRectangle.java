/* print the Solid Rectangle
                                ***********
                                ***********
                                ***********
                                ***********
 */
package JavaPattern;

import java.util.Scanner;

public class SolidRectangle {

    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows of * rectangle");
        int rows = sc.nextInt();
        System.out.println("Enter the columns of * rectangle");
        int cols= sc.nextInt();
        for(int i = 1;i<=rows;i++)
        {
//            for(int k=rows-i;k>=1;k--)  for printing rhombus
//            {
//                System.out.print(" ");
//            }
            for(int j = 1;j<=cols;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
