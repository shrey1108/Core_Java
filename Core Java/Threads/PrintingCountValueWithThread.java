public class PrintingCountValueWithThread implements Runnable
{
    public void run()
    {
        try
        {

        for(int i=0;i<20;i++)
        {
            System.out.println("Thread :"+(i+1));
            Thread.sleep(1000);
        }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void main(String[] args)
    {
        PrintingCountValueWithThread th1=new PrintingCountValueWithThread();
        Thread t1=new Thread(th1);
        Thread t2=new Thread(th1);
        t1.start();
        t2.start();
    }
}