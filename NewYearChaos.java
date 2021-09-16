//It is New Year's Day and people are in line for the Wonderland rollercoaster ride. Each person wears a sticker indicating their initial position in the queue
//        from 1 to n. Any person can bribe the person directly in front of them to swap positions,
//        but they still wear their original sticker. One person can bribe at most two others.
//
//        Determine the minimum number of bribes that took place to get to a given queue order.
//        Print the number of bribes, or, if anyone has bribed more than two people, print Too chaotic.
//Sample Input
//
//        STDIN       Function
//        -----       --------
//        2           t = 2
//        5           n = 5
//        2 1 5 3 4   q = [2, 1, 5, 3, 4]
//        5           n = 5
//        2 5 1 3 4   q = [2, 5, 1, 3, 4]
//        Sample Output
//
//        3
//        Too chaotic


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NewYearChaos {
    public static void minimumbribe(List<Integer> q)
    {
        int swapCount = 0;
        for(int i = q.size()-1;i>0;i--)
        {
            if (q.get(i)!=i+1)
            {
                if(((i-1)>=0) && q.get(i-1) == (i+1))
                {
                    swapCount++;
                    Collections.swap(q,i,i-1);
                }
                else if(((i-2)>=0) && q.get(i-2)==(i+1))
                {
                    swapCount+=2;
                    Collections.swap(q,i-2,i-1);
                    Collections.swap(q,i-1,i);

                }
                else
                {
                    System.out.println("Too chaotic");
                    return;
                }
            }
        }
        System.out.println(swapCount);


    }
        public static void main(String[] args)
        {
            List<Integer> q = new ArrayList<>();
            q.add(2);
            q.add(1);
            q.add(5);
            q.add(3);
            q.add(4);

            minimumbribe(q);
        }
}
