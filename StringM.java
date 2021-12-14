public class StringM {
    public static void main(String[] args) {
        String s = "Java Programming";
        System.out.println(s);
        char c = 'g';
        int count = 0;
        for (int i = 0; i < s.length(); i++)
        {
            if(s.charAt(i)==c)
            {
                count++;

            }

        }
        System.out.println("character "+c+" present in string "+count+" times");
    }
}
