interface Drawable
{
    int side =0;//static constant data member
    abstract void draw();
    void show();
}
class Rectangle implements Drawable
{
    public void draw()
    {
        System.out.println("Draw Rectangle");
    }
    public void show()
    {
        System.out.println("Show rectangle");
    }
}
public class interface
{
    public static void main(String[] args)
    {
        Drawable d=new Rectangle();
        d.draw();
        d.show();
        System.out.println("Side :"+d.side);
    }
}