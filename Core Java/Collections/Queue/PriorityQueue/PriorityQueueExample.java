import java.util.*;
public class PriorityQueueExample
{
    public static void main(String[] args)
    {
        PriorityQueue<String> pq=new PriorityQueue<>();
        pq.add("Apple");
        pq.add("Banana");
        pq.add("Oranges");
        pq.add("Mango");
        
        System.out.println("PriorityQueue List :"+pq);
        System.out.println();
        System.out.print("Litchi");//add in list
        
        System.out.println();
        String s=pq.poll();
        System.out.println("Removed element is : "+s);

        System.out.println("After Remove priority element is : "+pq);
          
        System.out.println();
        System.out.println("Print first element : "+pq.peek());
    }
}