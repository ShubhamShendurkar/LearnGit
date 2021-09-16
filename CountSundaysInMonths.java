import java.util.*;

public class CountSundaysInMonths {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String current_day = in.next();
        int numberofdays = in.nextInt();
        String[] days = new String[]{"mon", "tue", "wed", "thu", "fri", "sat", "sun"};
        List<String> days_list = new ArrayList<>(Arrays.asList(days));
        //int index = Collections.binarySearch(days_list, current_day);
        int index=days_list.indexOf(current_day);
        int i = index + 1;
        int count = 0;
        while (numberofdays > 0) {
            if (i == days_list.size()) {
                i = 0;
            }
            if (days_list.get(i) == "sun") {
                count++;
            }
            i++;
            numberofdays--;
        }
        System.out.println(count);
    }
}
