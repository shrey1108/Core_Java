import java.util.*;
public class ReverseStringBuffer
{
    public static void Reverse(String s1)
    {
        String[] s2=s1.split(" ");
        for(String w:s2){
        StringBuffer buffers=new StringBuffer();
         buffers.append(" ");
         buffers.append(w);
         buffers.reverse();
        System.out.print(buffers);
        }
    }
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String s1=input.nextLine();
        Reverse(s1);
        
    }
}