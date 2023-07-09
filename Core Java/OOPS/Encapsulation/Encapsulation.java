class user 
{
    private String name,contact,email;
    private int userId;

    public void setUserId(int userId)
    {
        if(userId>0)
        {
            this.userId=userId;
        }
        else
        {
            System.out.println("User id should be greater than 0");
        }
    }
    public int getUserId()
    {
        return userId;
    }
}
public class Encapsulation
{
    public static void main(String[] args)
    {
        user u=new user();
        u.setUserId(1001);
        int userId=u.getUserId();
        System.out.println("user Id :"+userId);
    }
}