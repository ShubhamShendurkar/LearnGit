public class SumOfArrayElement {
    public static void main(String[] args) {

        int []  arr = new int[]{2,5,7,8,6,3};
        int sum = 0;
        for(int i=0;i< arr.length;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("array sum is "+sum);
    }
}
