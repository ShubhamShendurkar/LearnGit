public class PalindromeString {

    public static void main(String[] args) {
        String original ="MALAYALAMO";
        String palindrome ="";
        for(int i = original.length()-1;i>=0;i--)
        {
            palindrome= palindrome + original.charAt(i);
        }
        System.out.println(palindrome);
        if(original.equals(palindrome))
        {
            System.out.println("It is palindrome!");
        }
        else
        {
            System.out.println("It is  not palindrome!");
        }
    }
}
