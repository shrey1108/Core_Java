public class ConstructorExample
{
    public ConstructorExample()
    {
        System.out.println("Default Contructor");
    }
    public ConstructorExample(String msg) //contructor overloading (2nd time defined with argument)
    {
        System.out.println("Parameterized constructor(msg): "+msg);
    }
    public ConstructorExample(int roll) //contructor overloading (2nd time defined with argument)
    {
        System.out.println("Parameterized constructor(roll): "+roll);
    }
     public ConstructorExample(String msg,int roll) //contructor overloading (2nd time defined with argument)
    {
        System.out.println("Parameterized constructor(msg,roll): "+msg+roll);
    }
    public static void main(String atr[])
    {
     ConstructorExample obj1=new ConstructorExample();//default will call
     ConstructorExample obj2=new ConstructorExample("hello");//parameteritized will call
     ConstructorExample obj3=new ConstructorExample(6);//parameteritized will call
     ConstructorExample obj4=new ConstructorExample("hello",6);//parameteritized will call
    }
}