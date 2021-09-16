public class BreakIntegertogetMaxProduct
{
    static  int power(int x,int a)
    {
        // method return x^a log(a)
        int res = 1;
        while (a>0)
        {
            if((a&1)>0)
            {
                res = res*x;

            }
            x=x*x;
            a>>=1;

        }
        return res;
    }
   static int breakInteger(int Number)
    {
        int maxProduct=-1;
        if(Number==2)
        {
            return 1;

        }
        if(Number==3)
        {
            return 2;
        }

        switch (Number % 3) {
            case 0 -> maxProduct = power(3, Number / 3);
            case 1 -> maxProduct = 2 * 2 * power(3, Number / 3-1);
            case 2 -> maxProduct = 2 * power(3, Number / 3);
        }
        return maxProduct;


    }
    public static void main(String [] args)
    {
        int maxProduct = breakInteger(10);
        System.out.println(maxProduct);

    }
}
