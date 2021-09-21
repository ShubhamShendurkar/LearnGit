import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int number= sc.nextInt();
//        int count = 0;
//        for(int i=2;i<=number;i++)
//        {
//            if(number%i==0)
//            {
//                count++;
//            }
//        }
//        if(count==2)
//        {
//            System.out.println("number is prime");
//        }
//        else
//        {
//            System.out.println("number is non prime");
//        }



        //Seive Eratosthene Time Complexity =  O(n*log(log(n)))
        boolean[] prime = new boolean[number+1];
        for(int i = 0;i<=number;i++)
        {
            prime[i]=true;
        }
        for(int i =2;i*i<=number;i++)
        {
            if(prime[i])
            {
                for(int j =i*i;j<=number;j+=i)
                {
                    prime[j]=false;
                }
            }

        }
        for(int i =2;i<=number;i++)
        {
            if(prime[i])
            {
                System.out.println(i+" ");
            }
        }

    }
}
