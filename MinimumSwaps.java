import java.util.ArrayList;
import java.util.Collections;
import java.util.List;




public class MinimumSwaps {
    public static void minimum2swaps(int[] arr)
    {
        int i =0,count =0 ,temp,n=arr.length;

        while(i<n){
            if(arr[i] != i+1){
                temp = arr[i];
                arr[i] = arr[temp-1];
                arr[temp-1]=temp;
                count++;
            }
            else{
                i++;
            }
        }
        System.out.println(count);

    }
    public static void main(String[] args)
    {

        int arr[] = new int[]{7,1,3,2,4,5,6};
        minimum2swaps(arr);
        for(int j =0;j<arr.length;j++)
        {
            System.out.print("\t"+arr[j]);
        }

    }
}
