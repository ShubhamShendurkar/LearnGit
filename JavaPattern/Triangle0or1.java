package JavaPattern;

import java.util.Scanner;

public class Triangle0or1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1;i<=num;i++)
        {
            for(int j =1;j<=i;j++)
            {
                int sum = i+j;
                if(sum%2==0)
                {
                    System.out.print(" "+1);
                }
                else
                {
                    System.out.print(" "+0);
                }
            }
            System.out.println();
        }

    }
}
