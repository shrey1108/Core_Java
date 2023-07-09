//wrap to add two integer number using bitwise operator

public class AdditionWithoutArithimaticOperator
{
    public int getResult(int num1,int num2)
    {
        while(num2!=0)
        {
            int carry=(num1&num2);
            num1=(num1^num2);
            num2=carry<<1;
        }
        return num1;
    }
    public static void main(String[] args)
    {
        AdditionWithoutArithimaticOperator apwao= new AdditionWithoutArithimaticOperator();
        int res=apwao.getResult(4,5);
        System.out.println("The Addition of Two integer number(4,5) is: "+res);
    }
}