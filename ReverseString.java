import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the String to reverse:");
        String str = in.next();
        String rev ="";
        for (int i = str.length()-1;i>=0;i--)
        {
            rev = rev + str.charAt(i);
        }
        System.out.println(str);
        System.out.println(rev);
    }
}
