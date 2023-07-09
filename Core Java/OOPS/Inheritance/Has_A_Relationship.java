class Teacher
{
    public String getTutorial()
    {
        return "Black Book of Java";
    }
}
class Student 
{
 Teacher teach=null;   
 public Student()
 {
    teach=new Teacher();
    String book = new Teacher().getTutorial();
    System.out.println("Java Book Name :" +book);
 }
}
public class Has_A_Relationship
{
    public static void main(String[] args)
    {
        Student st=new Student();
    }
}