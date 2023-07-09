public class ExceptionHandling
{
    public static void main(String[] args)
    {
        int a=3;
        int b=1;
        int res=a/b;//Arithimatic Exception ->Runtime exception
        System.out.println("Answer is :"+res);

        String name="Hello";
        int len=name.length();
        System.out.println("Len :"+len);   
    }
}
