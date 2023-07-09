public class TryAndCatch
{
    public static void main(String[] args)
    {
        try
        {
         String name=null;
         int len=name.length();
        }
        catch(NullPointerException e)
        {
            // System.out.println(e.getMessage());
            System.out.println("Content is empty");
            e.printStackTrace();//it will print completem info
            System.out.println(e.toString());//it will show exception's name and message
            System.out.println(e.getMessage());//it will show only message
            System.out.println("Content is empty");
        }
    }
}