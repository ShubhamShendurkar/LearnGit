public class Palindrome {
    public static void main(String[] args) {
        int number = 122,rem,sum = 0 ;
        int temp = number;
        while (number>0)
        {
            rem = number%10;
            sum = (sum*10)+rem;
            number = number/10;
        }
        if(temp==sum)
            System.out.println("palindrome");
        else
            System.out.println("not palindrome");
    }
}
