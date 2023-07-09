import java.util.*;
public class HashMapExample
{
    public static void main(String[] args)
    {
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(1,"Apple");
        hm.put(2,"Banana");
        hm.put(3,"Mango");
        hm.put(4,"Oranges");

        System.out.println(hm);

        for(Map.Entry m:hm.entrySet())
        {
            int key=m.getkey();
            String value=(String)m.getValue();

            System.out.println(key+" : "+value);
        }
    }
}