public class StaticVariableExample
{
    static int num;
    public void fun1()
    {
        num=100;
        System.out.println("Number:"+num);
    }
    public static void main(String[] args)
    {
      System.out.println("Number is main() :"+num);
      StaticVariableExample sve=new StaticVariableExample();
      sve.fun1();    
    }
}