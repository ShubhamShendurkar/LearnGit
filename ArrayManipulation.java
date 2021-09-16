import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayManipulation {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>(m);

        List<Integer> output = new ArrayList<Integer>(Collections.nCopies(n+1,0));

        int a,b,k;
        for(int i =0 ;i<m;i++)
        {
            ArrayList<Integer> a1 = new ArrayList<Integer>();
            for(int j =0;j<=0;j++)
            {
                a1.add(j,a=sc.nextInt());
                a1.add(j+1,b= sc.nextInt());
                a1.add(j+2,k= sc.nextInt());
            }
            list.add(a1);
        }
        {
            for (int i = 0; i <list.size(); i++) {
                for (int j = 0; j <= 0; j++) {
                    a = list.get(i).get(j);
                    b = list.get(i).get(j + 1);
                    k = list.get(i).get(j + 2);

                    output.set(a, output.get(a) + k);
                    if (b + 1 <= n)
                    {
                        output.set(b + 1, output.get(b + 1) - k);
                    }

                }
            }
        }

        long max=Long.MIN_VALUE;
        int sum =0;
        for(int i =0;i< output.size();i++)
        {
            sum=sum+ output.get(i);
            if(sum>max)
            {
                max=sum;
            }
        }
        System.out.println(max);


    }
}
