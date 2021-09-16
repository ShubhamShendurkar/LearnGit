class Queue
{
   private static int front,rear,capacity;
   private static int queue[];
   Queue(int c )
    {
        front = rear =0;
        capacity = c;
        queue = new int[capacity];

    }
    static void Enqueue(int data)
    {
        if(rear==capacity)
        {
            System.out.println("Queue is full");
        }
        else
        {
            queue[rear]=data;
            rear++;
        }
    }

}
public class QueueImplementation {
    public static void main(String[] args)
    {

    }
}
