public class InstanceVariableExample
{
    String college;//instance varriable
    int num1;
    public void fun1()
    {
        college="LPU";
        System.out.println("College :"+college);
    }
    public void fun2()
    {
        System.out.println("College :"+college);
    }
    public static void main(String[] args)
    {
        // System.out.println("College :"+college);
        InstanceVariableExample ive=new InstanceVariableExample();
        ive.fun1();
        ive.fun2();
    }
}