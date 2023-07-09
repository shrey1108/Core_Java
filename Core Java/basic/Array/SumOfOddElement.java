import java.util.*;
public class SumOfOddElement
{
    public static void main(String[] args)
    {
        
        int [] arr= new int[5];
        Scanner input = new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("Enter Number");
            arr[i]=input.nextInt();
        }
        int sum=0;
        for(int j=0;j<5;j++){

            if(j%2!=0) sum=sum+arr[j];
        }
        System.out.println(sum);
    }
}