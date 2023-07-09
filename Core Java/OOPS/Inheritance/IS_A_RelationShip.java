class Teacher
{
    public String getTutorial()
    {
        return "Black Book of Java";
    }
}
class Student extends Teacher
{
 public Student()
 {
    String book = new Teacher().getTutorial();
    System.out.println(book);
 }
}
public class IS_A_RelationShip
{
    public static void main(String[] args)
    {
        Student st=new Student();
    }
}