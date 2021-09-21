
import java.util.Scanner;

public class Calculator {
    public static void main(String[] arg)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c = sc.nextInt();
        if(c==1)
        {
            System.out.println("Addition"+(a+b));
        }

        else if(c==2)
        {
            System.out.println("Subtraction"+ (a-b));

        }
        else if(c==3)
        {
            System.out.println("Multiplication"+(a*b));
        }
        else if(c==4)
        {
            System.out.println("Division"+(a/b));
        }
        else if (c==5)
        {
            System.out.println("Modulo"+(a%b));
        }
        else
            System.out.println("number are invalid");


    }
}
