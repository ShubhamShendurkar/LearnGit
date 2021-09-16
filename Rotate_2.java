import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Rotate_2 {
    public static void  main(String [] args)
    {
        //int [] n = new int[]{10,20,30,40,50,60,70};
        List<Integer> my_list = new ArrayList<>();
        Scanner io = new Scanner(System.in);

        int d = io.nextInt();

        my_list.add(10);
        my_list.add(20);
        my_list.add(30);
        my_list.add(40);
        my_list.add(50);
        my_list.add(60);
        my_list.add(70);
        System.out.println(
                "List Before Rotation : "
                        + Arrays.toString(my_list.toArray()));
        List<Integer> list = new ArrayList<>(my_list.size());

        for(int i =0;i<my_list.size();i++)
        {
            int k = (i+my_list.size()+d)%my_list.size(); // for left rotation plus d and for right rotation minus d
           list.add(my_list.get(k));

        }

        System.out.println(
                "List After Rotation : "
                        + Arrays.toString(list.toArray()));
    }
}
