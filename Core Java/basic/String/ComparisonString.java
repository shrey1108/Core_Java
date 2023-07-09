public class ComparisonString
{
    public static void main(String[] args)
    {
        String s1="Java";
        String s2="java";
        String s3=new String("Java");

        System.out.println("s1==s3 :"+(s1==s3));
        System.out.println("s1==s2 :"+(s1==s2));
        
        System.out.println("s1.equals(s3) :"+(s1.equals(s3)));
        System.out.println("s1.equalsIgnoreCase(s2) :"+(s1.equalsIgnoreCase(s2)));

        System.out.println("s1.compareTo(s2) :"+(s1.compareTo(s2)));

        String a="A";
        String b="B";
        String c="A";
        
        System.out.println("a.compareTo(b) : "+a.compareTo(b));
        System.out.println("a.compareTo(c) : "+a.compareTo(c));
        System.out.println("b.compareTo(a) : "+b.compareTo(a));
    }
}