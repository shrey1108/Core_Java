class Student 
{
    public Student()
    {
        System.out.println("Default Constructor");
    }
    public Student(String[] args)
    {
        System.out.println("MSG : "+msg);
        this();//calling the default constructor 
    }
    public void display()
    {
        this();
    }
}
 public class ThisReferenceVariableForConstructor
 {
    public static void main(String[] args)
    {
        Student st=new Student("Shrey");
        st.display();
    }

}