import java.util.*;
public class VectorClass
{
    public static void main(String[] args)
    {
        Vector<Integer> v=new Vector<>();
        v.add(10);
        v.add(20);
        v.add(30);
        v.add(40);

        ListIterator<Integer> list=v.listIterator();
        System.out.println("Print Vector list:");
        while(list.hasNext())
        {
            System.out.println(list.next());
        }

        System.out.println("Print vector in reverse :");
        while(list.hasPrevious()){
            System.out.println(list.previous());
        }

        v.addElement(100);
        list=v.listIterator();
        
        System.out.println("print vector list in reverse order");
        
        while(list.hasPrevious())
        {
            System.out.println(list.previous());
        }
        System.out.println(list.hasNext());//True 
        System.out.println(list.hasPrevious());//False
        System.out.println(v);
    }
}