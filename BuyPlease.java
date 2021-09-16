//Chef went to a shop and buys a pens and b pencils. Each pen costs x units and each pencil costs y units.
//        Now find what is the total amount Chef will spend to buy a pens and b pencils.


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class BuyPlease {

    public static void main(String[] args) throws IOException {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));

        int num[] = new int[1000];
        String[] strNums;
       // long startTime, endTime;


        /*________ TEST STARTS ________*/
        //startTime = System.nanoTime();
        strNums = bi.readLine().split("\\s");
        for(int i=0; i<strNums.length; i++) {
            num[i] = Integer.parseInt(strNums[i]);

        }System.out.println(num[0]*num[2]+num[1]*num[3]);
      //  endTime = System.nanoTime();
        /*________ TEST ENDS ________*/

       // System.out.println("Total Time Taken: " + (endTime - startTime));
    }
}
