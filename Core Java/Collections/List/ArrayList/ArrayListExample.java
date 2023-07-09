import java.util.*;
public class ArrayListExample
{
    public static void main(String[] args)
    {

        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(40);
        list.add(10);

        System.out.println(list);
        //insert an element after 20
        list.add(3,50);
        System.out.println(list);

        //combine one list to another list this is known as umion
         List<Integer> list2=new ArrayList<>();
        list2.add(100);
        list2.add(200);

        list2.addAll(list);//combine last
        System.out.println("After combine list2: ");
        System.out.println(list2);

        //find the intersection between Two list and list2
        list2.retainAll(list);
        System.out.println("After retailAll list2:");
        System.out.println(list2);

        //To get last Element
        int lastElement=list2.get(list2.size()-1);
        System.out.println("lastElemenr is the :");
        System.out.println(lastElement);

        //To get the first element
        int firstElement=list2.get(0);
        System.out.println("First element is the:");
        System.out.println(firstElement);

        //To get element
        int ele=list2.get(3);
        System.out.println("3rd element is the:");
        System.out.println(ele);

        //Remove last element
        list2.remove(list2.size()-1);
        System.out.println(list2);

        //clear All
        list2.clear();
        System.out.println(list2);

    }
}