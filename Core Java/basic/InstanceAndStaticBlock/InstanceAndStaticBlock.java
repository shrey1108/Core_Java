class student
{
    {
        System.out.println("Instance Block");
    }
    static
    {
        System.out.println("Static Block");
    }
}
public class InstanceAndStaticBlock
{
    static{
        System.out.println("main static Block");
    }
    public static void main(String[] atr)
    {
        student st=new student();
    }
}