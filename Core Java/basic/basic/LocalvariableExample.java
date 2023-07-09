public class LocalvariableExample
{
    public void msg(String name,int num2) //Local variable
    {
        int num1=100;
        System.out.println("Num1:"+num1);
        System.out.println("Name "+name);
        System.out.println("num2 "+num2);
    }
    public static void main(String[] args)
    {
        LocalvariableExample lve=new LocalvariableExample();
        lve.msg("Nishan",600);
        // num1=200; //not accessible becuase of local variable
    }
}