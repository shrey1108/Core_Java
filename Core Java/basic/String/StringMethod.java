public class StringMethod
{
    public static void main(String[] args)
    {
        String s1="Hello";
        char firstchar=s1.charAt(0);
        System.out.println("First Character of Hello is '"+firstchar+"'");
        
        char lastchar=s1.charAt(s1.length()-1);
        System.out.println("last Character of Hello is '"+lastchar+"'");
    }
}