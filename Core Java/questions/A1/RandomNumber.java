import java.util.*;
public class RandomNumber
{
    public static void main(String[] args)
    {
     Random r=new Random();
     int otp=r.nextInt(1000);
     System.out.println(otp);   
    }
}