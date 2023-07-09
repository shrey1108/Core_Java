import java.util.*;
public class LinkedHashsetExample
{
    public static void main(String[] args)
    {
        LinkedHashSet<Integer> Lhs=new LinkedHashSet<>();
        Lhs.add(100);
        Lhs.add(200);
        Lhs.add(50);
        Lhs.add(10);

        System.out.println("LinkedHashset :"+Lhs);
        Lhs.add(100);
        Lhs.add(20);

        System.out.println("LinkedHashset :"+Lhs);
        
        //to get the element or iterate element one by one
        Iterator<Integer> itr=Lhs.iterator();
        System.out.println("Printing LinkedHash set data :");
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        //remove any element
        Lhs.remove(200);
        System.out.println("LinkedHashSet :"+Lhs);
        //checking element got removed or content
        System.out.println("Remove 300 : "+Lhs.remove(300));
    }
}