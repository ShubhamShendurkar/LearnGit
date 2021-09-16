import java.util.Arrays;
import java.util.Scanner;

public class UniqueDigit {

    public static void main(String[] args)
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter the range betn you want unique digit have to print:");
        int number_1= in.nextInt();
        int number_2= in.nextInt();
        for(int i=number_1;i<=number_2;i++)
        {
            int temp= i;
            int visited[]= new int[number_2];
            Arrays.fill(visited,0);
            while(temp>0) {
                if (visited[temp % 10] == 1)
                    break;
                visited[temp%10]=1;
                temp=temp/10;

            }
            if(temp==0)
            {
                System.out.println(i);
            }
        }

    }
}
