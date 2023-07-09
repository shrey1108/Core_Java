class Student 
{
    String name;
    int roll;
    Student(String name,int roll)
    {
        this.name=name;
        this.roll=roll;
    }
    public void display()
    {
        System.out.println("name : "+name);
        System.out.println("roll : "+roll);
    }
    public void callBack()
    {
        this.display();
    }
}
public class ThisReferenceVariable
{
    public static void main(String[] args)
    {
        Student st=new Student("Shrey",101);
        st.callBack();
        
    }
}// this refernce is used to call in same class and instance variable