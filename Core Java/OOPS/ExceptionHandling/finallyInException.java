public class finallyInException
{
    public static void main(String[] args)
    {
        try
        {
        int a=3;
        int b=1;
        int res=a/b;//Arithimatic Exception ->Runtime exception
        System.out.println("Answer is :"+res);//this line will not execute if got exception
        }
        catch(Exception e)
        {
            // System.out.println(e);
            System.out.println(e.getMessage());
        }
        finally
        {
            System.out.println("Hello finally block");
            //atleast finally block will be executed it doesnot depends on try and catch
        }
    }
}
