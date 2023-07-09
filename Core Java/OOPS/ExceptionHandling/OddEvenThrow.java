class InvaildNumber extends Exception
{
    public InvaildNumber(int num)
    {
        super(num);
    }
}
public class OddEvenThrow
{
    public void NumberCheck(int num) throws InvaildNumber
    {
        if(num%2==0)
        {
            throw new InvaildNumber("number is Even ");
        }
        else
        {
            System.out.println("number is Odd ");
        }  
    }
    
}