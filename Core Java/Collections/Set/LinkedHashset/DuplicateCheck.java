import java.util.*;
public class DuplicateCheck
{
    public static void main(String[] args)
    {
        LinkedHashSet<String> Lhs=new LinkedHashSet();
        Lhs.add("this is good boy");
        Lhs.add("this is good girl");

        System.out.println(Lhs);
        LinkedHashSet<String> Lh2=new LinkedHashSet<>();
        for(String sent:Lhs)
        {
            String[] words=sent.split(" ");
            for(String word:words)
            {
                Lh2.add(word);
            }
        }
        System.out.println(Lh2);
    }
}