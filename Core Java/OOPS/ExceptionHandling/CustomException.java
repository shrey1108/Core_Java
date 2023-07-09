class InvalidAgeException extends Exception
{
    public InvalidAgeException(String msg)
    {
        super(msg);
    }
}
public class CustomException
{
    public void ageValidate(int age)throws InvalidAgeException
    {
        if(age<18)
        {
            throw new InvalidAgeException("Invaild Method");
        }
        else
        {
            System.out.println("Welcome to Voter List");
        }
    }
    public static void main(String[] args)throws InvalidAgeException
    {
     CustomException ces=new CustomException();
     ces.ageValidate(15);
    }
}