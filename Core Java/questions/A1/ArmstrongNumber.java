import java.util.*;
public class ArmstrongNumber
{
    public static void ArmstrongNumber1(int num)
    {
        int len=1;
        int sum=0;
        int temp=num;
        int temp1=num;
        while(temp>10){
            temp=temp/10;
            len++;
        }
        while(temp1>0){
            int pow=len;
            int tsum=1;
            int temp2=temp1%10;
            while(pow>0){
            tsum=tsum*temp2;
            pow--;
            }
             sum=sum+tsum;
             temp1=temp1/10;
        }
        if(sum==num) System.out.println("It is Armstrong Number");
        else System.out.println("It is Not Armstrong Number");
        
    } 
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your Number");
        int a=input.nextInt();
        ArmstrongNumber1(a);

    }
}