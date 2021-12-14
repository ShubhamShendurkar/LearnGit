public class PrintNumberinEVENODDFormat {
   public static void main(String[] args) {
        int number =23289;
        int rem;
        while(number>0)
        {
            rem = number%10;
            if(rem%2==0)
            {
                System.out.print("EVEN "+rem+" ");
            }
            else
            {
                System.out.print("ODD "+rem+" ");
            }
            number = number/10;
        }
    }
}
