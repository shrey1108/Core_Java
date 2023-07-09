import java.util.*;
public class TreeSetExample
{
    public static void main(String[] args)
    {
     TreeSet<Integer> t=new TreeSet();
     t.add(10);
     t.add(5);
     t.add(3);
     t.add(4);
    
    System.out.println("Tree set data :");
    System.out.println(t);

    t.add(100);//duplicate data ,it will avoid to enter
    t.add(200);

    System.out.println(t);

    //Print tree in inorder
        System.out.println("Tree in Accending order:");
        System.out.println(t);
        
        //Reverse Tree
        Iterator<Integer> it=t.descendingIterator();
        while(it.hasNext())
        {
            System.out.print(it.next()+" ");
        }

        //find the smallest element
        int min=t.first();
        System.out.print("Minimum value in tree :"+min);

        //find the maximum value
        int max=t.last();
        System.out.print("maximum value in tree :"+max);

    }
}