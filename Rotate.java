// Java Program to Rotate Elements of the List

import java.util.*;
class Rotate{
    public static void main(String[] args)
    {
        // creating array list
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

        for (int i = 0; i < d; i++)
        {
            // storing the first element in the list
            int temp = my_list.get(0);
            System.out.println("store= "+temp);
            // traverse the list and move elements to left
            for (int j = 0; j < my_list.size()-1; j++)
            {
                my_list.set(j, my_list.get(j +1));
                System.out.println("shift " +my_list);
            }
            my_list.set(my_list.size()-1, temp);
            System.out.println("store back "+my_list);
        }

        // Printing list after rotation
        System.out.println(
                "List After Rotation : "
                        + Arrays.toString(my_list.toArray()));
    }
}
