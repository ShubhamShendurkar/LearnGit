import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number you want to print fibonacci series:");
        int number = in.nextInt();
        int a =0,b=1,c;
        System.out.println(a);
        System.out.println(b);
        for(int i = 2;i<=number;i++)
        {
            c = a+b;
            a=b;
            b=c;
            System.out.println(c);
        }

    }
}
