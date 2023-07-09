public class FirstThreads extends Thread
{
    public void run()
    {
        System.out.println("Thread is running");
    }
    public static void main(String[] args)
    {
        FirstThreads fth=new FirstThreads();
        fth.setName("Java");
        System.out.println("Start Thread "+fth.getName());
        fth.start();
        
    }
}