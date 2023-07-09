public class JavaControlStatement
{
    public static void main(String[] args)
    {
        int num=5;
        if(num%2==0); //because condition is closed imediatily and sop is independent.
        System.out.println("Even");

        if(num%2==0) System.out.println("Even");
        if(num%2!=0) System.out.println("odd");

        
        if(num%2==0) System.out.println("Even");
        else System.out.println("odd");
    }
}