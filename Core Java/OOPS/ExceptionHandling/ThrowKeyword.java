public class ThrowKeyword
{
  public void validateAge(int age)
  {
    try{
        if(age<18)
        {
            throw new NullPointerException("Invailded Age");
        }
        else{
            System.out.println("wellcome to voter list");
        }
    }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
  }
    public static void main(String[] args)
    {
        ThrowKeyword tke=new ThrowKeyword();
        tke.validateAge(15);
    }
 }
