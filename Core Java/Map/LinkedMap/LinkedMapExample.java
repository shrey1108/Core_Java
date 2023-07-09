import java.util.*;
public class LinkedMapExample
{
    public static void main(String[] args)
    {
        LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>();
        lhm.put(1,"Apple");
        lhm.put(2,"Apple");
        lhm.put(3,"Apple");
        lhm.put(4,"Apple");
        lhm.put(5,"Apple");
        lhm.put(1,"Banana");

        System.out.println(lhm);

        System.out.println("Only key :"+lhm.keySet());
        System.out.println("Only value :"+lhm.values());

         String replacedValue=lhm.replace(2,"oranges");
         System.out.println("After Replacement of mango to orange : "+lhm.entrySet());
         System.out.println("Replaced value : "+replacedValue);

    }
}