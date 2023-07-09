import java.util.*;
public class LinkedListt
{
    public static void main(String[] args)
    {
        LinkedList<String> linkedList1=new LinkedList<>();
        linkedList1.add("Moon");
        linkedList1.add("Shaan");
        linkedList1.add("Shrey");
        linkedList1.add("Khushi");

        //printing data
        System.out.println("Linked list data:");
        System.out.println(linkedList1);

        //add element based on index value provided
        linkedList1.add(0,"Afzia");
        System.out.println(linkedList1);

        //add at first position
        linkedList1.addFirst("Hello");
        System.out.println(linkedList1);

        //add at last
        linkedList1.addLast("Gaurav");
        System.out.println(linkedList1);
     
        ListIterator<String> itr=linkedList1.listIterator();
        System.out.println("Printing data in inverse order");
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        Iterator<String> itr1=linkedList1.descendingIterator();
        System.out.println("Printing data in reverse order");
        while(itr1.hasNext())
        {
            System.out.println(itr1.next());
        }

        //System.out.println("Printing reverse order");
        // while(itr.hasNext())
        // {
        //     StringBuffer sb=new StringBuffer();
        //     sb.append(String.valueOf(itr.next()));
        //     sb.reverse();
        //     itr.set(sb.toString());
        // }
        System.out.println("Printing in reverse order");
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

        //remove one element
        linkedList1.remove();
        System.out.println(linkedList1);
        //remove second element
        linkedList1.remove();
        System.out.println(linkedList1);

        linkedList1.remove("Gaurav");
        System.out.println(linkedList1);

        //to get first element
        System.out.println(linkedList1.get(1));
        System.out.println("Print first element :"+linkedList1.getFirst());
        System.out.println("Print last element :"+linkedList1.getLast());


    }

}