public class Fibonacciseries
{
    public static void main(String[] args)
    {
        int num1=0,num2=1;
        System.out.println(num1+",");
        System.out.println(num2+",");
        while(num2<200){
            num2=num1+num2;
            System.out.println(num2+",");
            num1=num2-num1;
        }
    }
}