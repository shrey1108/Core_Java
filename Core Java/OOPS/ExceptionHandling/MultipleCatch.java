public class MultipleCatch
{
    public static void main(String[] args)
    {
        try{
            String str=null;
            int len=str.length();

            int a=5;
            int b=0;
            int res=a/b;//Arithimatic Exception

            System.out.println("Hello Try Block");
        }
        catch(NullPointerException np)
        {
            System.out.println("Catch block of null pointer invoked");
            System.out.println(np);
        }
        catch(ArithmeticException ae)
        { 
            System.out.println("Catch block of Arithmetic invoked");
            System.out.println(ae);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}