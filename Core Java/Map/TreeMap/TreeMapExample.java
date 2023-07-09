import java.util.*;
public class TreeMapExample
{
    public static void main(String[] args)
    {
        TreeMap<String,String> tm=new TreeMap<>();
        tm.put("US001","Moon");
        tm.put("US002","Shrey");
        tm.put("US003","Nazish");
        tm.put("US004","shaan");

        System.out.println(lm);

        System.out.println("Participated Student's Name :");

        for(Map.Entry usn:tm.entry)
        {
            System.out.println(usn.getKey());
        }
        System.out.println("Participate Student's USN no and Name :");
        for(Map.Entry usn:tm.entrySet())
        {
            System.out.println(usn.getValue());
        }
        System.out.println("Participate Student's USN no and Name :");
        for(Map.Entry usn:tm.entrySet())
        {
            System.out.println(usn.getKey()+" : "+usn.getValue());
        }

        //code here print last key value and print first key value
        System.out.println("First key and value :"+tm.firstEntry());
        System.out.println("Last Key and value :"+tm.lastEntry());

        //Last key and first key
        System.out.println("First key :"+tm.firstKey());
        System.out.println("Last key :"+tm.lastKey());
        
        //Replace the name where USN003
        String values=tm.replace("USN003","Samriddhi");
        System.out.println("Replaced participate :"+value);
        System.out.println("List below is fina; "+tm);

    }
}