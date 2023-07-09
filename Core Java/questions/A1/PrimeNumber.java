import java.util.*;
public class PrimeNumber
{
    public static void isPrimeNumber(int num){

        int count=0;
        int a=num;
        int b=2;
        while(b<a){
            if(a%b==0){
                count++;
            }
            b++;
        }
        if(count>0) System.out.println("Number "+a+" is Not prime number");
        else System.out.println("Number "+a+" is a prime number");
    }
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Your Number");
        int a=input.nextInt();
        isPrimeNumber(a);
    }
}