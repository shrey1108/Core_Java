class Rectangle
{
    public double area(double side1,double side2)
    {
     return side1*side2;
    }
}
class square extends Rectangle
{
    public double area(double side1,double side2)
    {
        return side1*side2;
    }
}
public class MethodOverriden
{
    public static void main(String... args)
    {
     square s=new square();
     double a=s.area(4,4);
     System.out.println(a);
    }
}