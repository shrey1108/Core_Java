public class NonStaticMethod
{
    public void msg()//without local variable
    {
        System.out.println("Welcome to non-static method msg()");
    }
     public static void msg1()//without local variable
    {
        System.out.println("Welcome to non-static method msg1()");
    }
    public static void main(String[] args)
    {
        NonStaticMethod nsme=new NonStaticMethod();
        // msg();//cannot call method because not static 
        nsme.msg(); // object can only access

        msg1();//can direct call due to static method
        NonStaticMethod.msg1();//can call with class name
        nsme.msg1();//can call with object
    }
}