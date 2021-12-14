package JavaPattern;

import java.util.Scanner;

public class Menudriven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number and choose option");
        System.out.println("1.Enter the marks of student");
        System.out.println("0.Exit the Program");
        int number = sc.nextInt();
        switch (number)
        {
            case 0: break;
            case 1:
                System.out.println("Enter the marks of student:");
                int marks = sc.nextInt();
                if(marks<=100&&marks>=90)
                {
                    System.out.println("This is good");
                }
                else if(marks>=60 && marks<=89)
                {
                    System.out.println("This  is also good");
                }
                else if(marks>=35 && marks<=59)
                {
                    System.out.println(" this is well");
                }
                else
                {
                    System.out.println("Because marks don’t matter but our effort does.");
                }
        }
    }
}
