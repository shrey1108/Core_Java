abstract class Printable
{
    String university="LPU";
    public Printable()
    {
        System.out.println("Default Constructor in abstract class");
    }
    abstract void message();
    public void Cube(int num)
    {
        System.out.println("Cube of "+num+": "+(num*num*num));
    }
}
public class AbstractClass extends Printable
{
    public void message()
    {
        System.out.println("Invoiked Abstract Method message()");
    }
    public static void main(String[] args)
    {
        // Printable p=new Printable();
        // p.Cube(5);
        /*
        Printable p=new AbstractClass();
        p.Cube(5);
        System.out.println("University Name :"+p.university);
        p.message();
        */

       /*
       AbstractClass ace=new AbstractClass();
       ace.Cube(5);
       System.out.println("University Name :"+ace.university);
       ace.message();
       */

       
    }
}
