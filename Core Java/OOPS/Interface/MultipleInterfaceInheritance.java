interface Printable
{
    void print();
}
interface Drawable
{
    void draw();
}
class Rectangle implements Printable
{
    public void print()
    {
        System.out.println("Print Rectangle");
    }
     public void draw()
    {
        System.out.println("draw Rectangle");
    }
}
public class MultipleInterfaceInheritance
{
    public static void main(String[] args)
    {
        /*
        Printable p=new Rectangle();
        p.print();
        p.draw();
        */
         
        Rectangle r=new Rectangle();
        r.print();
        r.draw();
    }
}