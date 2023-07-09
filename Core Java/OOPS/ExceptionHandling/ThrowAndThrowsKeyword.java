public class ThrowAndThrowsKeyword
{
    public void ageValidate(int age)throws NullPointerException
    {
        if(age<18)
        {
            throw new NullPointerException("Invaild age");
        }
        else
        {
            
            System.out.println("Welcome for vote");
        }
    }
        public static void main(String[] args)
        {
            int age=Integer.parseInt(args[0]);
            ThrowAndThrowsKeyword th=new ThrowAndThrowsKeyword();
            th.ageValidate(age);
        }
    }
