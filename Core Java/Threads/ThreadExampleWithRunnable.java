public class ThreadExampleWithRunnable
{
    public void run()
    {
        System.out.println("Running Thread");
    }
    public static void main(String[] args)
    {
        ThreadExampleWithRunnable obj1=new ThreadExampleWithRunnable();
        Thread th1=new Thread(obj1);
        th1.start();
    }
}