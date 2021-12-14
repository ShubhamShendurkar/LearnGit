package JavaPattern;

import java.util.Scanner;

public class MenuDrivendoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number 1 if you want to add marks:");
        int number = sc.nextInt();
        do {
            System.out.println("Enter the marks of student");
            int marks = sc.nextInt();
            if(marks<=100 && marks>=90)
            {
                System.out.println("This is Good");
            }
            else if(marks<=89 && marks>=60)
            {
                System.out.println("This is well score");
            }
            else if (marks<=59 && marks>=35)
            {
                System.out.println("This well as good marks");
            }
            else
            {
                System.out.println("we regret that you failed but marks don’t matter but your effort does.");
            }
            System.out.println("you want to add marks then type 1 or for exit type 0");
            number = sc.nextInt();
        } while(number==1);

    }
}
