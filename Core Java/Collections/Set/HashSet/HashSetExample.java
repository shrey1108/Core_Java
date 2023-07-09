import java.util.*;
public class HashSetExample
{
    public static void main(String[] args)
    {
        HashSet<Integer> hs=new HashSet<>();
        hs.add(100);
        hs.add(10);
        hs.add(1);
        hs.add(200);
        hs.add(17);

        System.out.println(hs);

    }
}