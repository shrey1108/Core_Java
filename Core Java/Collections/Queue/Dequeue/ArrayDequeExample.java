import java.util.*;
public class ArrayDequeExample
{
    public static void main(String[] args)
    {
        Deque<Integer> dq=new ArrayDeque<>();
        dq.add(100);
        dq.add(200);
        dq.add(300);
        
        System.out.println(dq);
        dq.offer(10);//add fromlast
        System.out.println(dq);
        dq.offerFirst(5);//add from first
        System.out.println(dq);

        dq.poll();
        System.out.println(dq);

        dq.pollFirst();
        System.out.println(dq);
        
        dq.pollLast();
        System.out.println(dq);

    } 
}