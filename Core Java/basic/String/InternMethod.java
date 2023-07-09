public class InternMethod
{
    public static void main(String[] args)
    {
        String s=new String("Hello");
        String s1="Hello";
        String s2=s.intern();//fetch data from scp

        System.out.println("s1==s2 : "+(s1==s2));
    }
}