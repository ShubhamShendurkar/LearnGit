import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class MultipleOccurences {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the name:");
        String str = br.readLine();
        System.out.println("Enter the character to search:");
        char search = (char)br.read();

        Map<Character, Integer> hash = new HashMap<Character, Integer>();

        for (int i = 0; i < str.length(); i++) {
            if (hash.containsKey(str.charAt(i)))
                hash.put(str.charAt(i), hash.get(str.charAt(i)) + 1);

            else
                hash.put(str.charAt(i), 1);
        }
        int result = hash.get(search);
        System.out.println("search character is "+result);
    }
}
