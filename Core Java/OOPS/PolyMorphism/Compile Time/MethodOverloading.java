public class MethodOverloading
{
    public int add(int num1,int num2)
    {
        return num1+num2;
    }
    public long add(int num1,long num2)
    {
        return (long)(num1+num2);
    }
    public long add(long num1,long num2)
    {
        return num1+num2;
    }
    public static void main(String[] args)
    {
        MethodOverloading mo=new MethodOverloading();
        System.out.println(mo.add(10,20));
    }
}