import java.util.Scanner;
import java.util.stream.IntStream;

public class FizzBuzz {

    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the Number where upto check FizzBuzz:");
        int number= in.nextInt();
        if(number>0)
        {
                for(int i=1;i<=number;i++) {
                    String output = "";
                    if (i % 3 == 0) {
                        output +="Fizz";
                    }
                    if (i % 5 == 0) {
                        output +="Buzz";
                    }
                    if(output == "")
                    {
                        output = String.valueOf(i);
                    }
                    System.out.println(output);
                }

        }
       // fizzBuzzBeforeJava8(100);
        //fizzBuzzInJava8(100);
    }

    private static void fizzBuzzBeforeJava8(int num)
    {
        for (int i = 1; i <= num; i++)
        {
            if (((i % 5) == 0) && ((i % 7) == 0)) // Is it a multiple of 5 & 7?
                System.out.println("fizzbuzz");
            else if ((i % 5) == 0) // Is it a multiple of 5?
                System.out.println("fizz");
            else if ((i % 7) == 0) // Is it a multiple of 7?
                System.out.println("buzz");
            else
                System.out.println(i); // Not a multiple of 5 or 7
        }
    }

    private static void fizzBuzzInJava8(int num) {
        IntStream.rangeClosed(1, 100)
                .mapToObj(i -> i % 5 == 0 ? (i % 7 == 0 ? "FizzBuzz" : "Fizz") : (i % 7 == 0 ? "Buzz" : i))
                .forEach(System.out::println);
    }

}
