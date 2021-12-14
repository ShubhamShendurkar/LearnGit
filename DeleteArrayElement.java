public class DeleteArrayElement {
    static int insertinarray(int array[],int arraysize,int new_elemnt,int position)
    {
        if(position>=arraysize)
            return position;
        array[position]=new_elemnt;
        return (position+1);

    }
    public static void main(String[] args) {
        int [] array = new int[10];
        array[0] = 1;
        array[1]=2;
        array[2]=3;
        array[3]=4;
        array[4]=5;
        array[5]=6;
        int arraysize = array.length;
        int new_elemnt  = 55;
        int position = 6;
        for(int i = 0;i<arraysize;i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        insertinarray(array,arraysize,new_elemnt,position);
        for(int i =0;i<arraysize;i++) {
            System.out.print(array[i] + " ");
        }

    }
}
