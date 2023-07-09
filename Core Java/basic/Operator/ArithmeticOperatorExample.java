public class ArithmeticOperatorExample
{
    public static void main(String[] args)
    {
        long mbno=919743496260L;
        System.out.println("Mobile no. :"+mbno);

        int countrycode=(int)(mbno/10000000000L);
        long mobileno=(long)(mbno%10000000000L);
       
        System.out.println("Country code :+"+countrycode);
        System.out.println("mobile no :"+mobileno);
    }
}