interface Printable
{
    void fun1();
    void fun2();
    void fun3();
}
class interface2 implements Printable
{
    public void fun1()
    {
        System.out.println("Fun1");
    }
    public void fun2()
    {
        System.out.println("Fun2");
    }
    public void fun3()
    {
        System.out.println("Fun3");
    }
    public static void main(String[] args)
    {
        Printable p=new interface2();
        p.fun1();
        p.fun2();
        p.fun3();
    }
}