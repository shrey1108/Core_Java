final class Student
{
    //Singleton design pattern
    private static Student obj;
    private Student()
    {
     System.out.println("Default Constructor");
    }
    public static Student getObject()
    {
        if(obj==null)
                 return new Student();
        else 
                 return obj;
    }
}
public class ReturnObject
{
    public static void main(String[] args)
    {
        Student st=Student.getObject();
    }
}
