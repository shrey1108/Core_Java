import java.util.*;
public class ScannerExample
{
   public static void main(String[] args)
   {
     Scanner input = new Scanner(System.in);
     
     System.out.println("Enter a number :");
     int num= input.nextInt();

     System.out.println("Enter a Float number :");
     float f= input.nextFloat();

     System.out.println("Enter your name :"); //to take string after but not irst
     input.nextLine();  //write this before
     String name= input.nextLine();

     System.out.println("Enter a Double number :");
     double d= input.nextDouble();

    //  System.out.println("Enter a alpha :");
    //  char a= input.nextChar();

     System.out.println("Name :"+name);
     System.out.println("Numberis :"+num);
     System.out.println("Float :"+f);
     System.out.println("Double :"+d);
    //  System.out.println("char :"+a);
     

   }
}