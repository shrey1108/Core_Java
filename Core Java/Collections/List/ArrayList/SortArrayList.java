import java.util.*;
public class SortArrayList
{
    public static void main(String[] args)
    {
        Integer[] array={20,30,40,10,50,60};
        ArrayList<Integer> list1=new ArrayList<>(Arrays.asList(array));
        System.out.println(list1);

        Collections.sort(list1);//sort the ArrayList
        System.out.println(list1);

        //get the Element 
        Iterator<Integer> it=list1.iterator();
        while(it.hasNext())//ptint the element
        {
          System.out.println(it.next());
        }
        it.remove();//remove
        System.out.println(list1);

        //one by one it for each loop
        for(Integer ele:list1)
        {
            System.out.println(ele);
        }
        
        //in assending order one by one
        ListIterator<Integer> itr=list1.listIterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

         //in desending order printing
         ListIterator<Integer> itr1=list1.listIterator();
        while(itr1.hasPrevious())
        {
            System.out.println(itr1.previous());
        }
        
        //assending
        System.out.println("Print in assending order");
        Collections.sort(list1);//sort the ArrayList
        System.out.println(list1);

         //desending using reverse
        System.out.println("Print in desending order");
        Collections.reverse(list1);//sortdes.. the ArrayList
        System.out.println(list1);

        //add and replace the 1st index with 100
        list1.set(1,100);
        System.out.println("Printing data after modifty the 40 to 100");
        System.out.println(list1);
    }
}