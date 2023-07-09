class Student 
{
    public Student()
    {
     Student st=this.getStudentObj(this);//passing argument by this keyword
     System.out.println("Default Constructor ");
    }
    public Student getStudentObj(Student st)
    {
        System.out.println("Invoked getStudentObj(new Student())");
        return st;
    }
}
public class ThisWithArgument
{
    public static void main(String[] args)
    {
    Student st=new Student();

    }   
}