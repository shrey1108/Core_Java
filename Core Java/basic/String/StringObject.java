public class StringObject
{
    public static void main(String[] args)
    {
        String s1="Java";
        String s2=new String("Hello");
        String s3="Java"; //will point same location as s1
        String s4=new String("Java");//will point same location as s2
        String s5=new String("hello");//will not point same location as s2

        System.out.println("s1 : "+s1+ "  : "+s1.hashCode());
        System.out.println("s2 : "+s2+ " : "+s2.hashCode());
        System.out.println("s3 : "+s3+ "  : "+s3.hashCode());//pointing towards same memory s1 due to same/duplicate value
        System.out.println("s4 : "+s4+ " : "+s4.hashCode());//pointing towards same memory s2 due to same/duplicate value
        System.out.println("s5 : "+s5+ " : "+s5.hashCode());//not pointing towards same memory s2 due to same/duplicate value
        
        s3="Java124";
        System.out.println("s3 : "+s3+ " : "+s3.hashCode());
        s3="pava";
        System.out.println("s3 : "+s3+ "  : "+s3.hashCode());

        System.out.println("Concat : "+s2.concat(s1).hashCode());

        System.out.println(" Java : "+5+6+2);
        System.out.println(5+6+2+" : Java "+6+2);

    }
}