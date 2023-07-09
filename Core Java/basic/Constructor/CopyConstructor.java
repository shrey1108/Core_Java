class Student
{
  String name;
  int roll;
  public Student(String n,int r)
  {
   name=n;
   roll=r;
  }
  public Student(Student st)
  {
    name=st.name;
    roll=st.roll;
  }
}
public class CopyConstructor
{
    public static void main(String[] args)
    {
        Student obj1=new Student("Tamanna",101);
        Student obj2=new Student(obj1);
        Student obj3=new Student(); //error will occur becuase we dont have this type of constructor without argument
        obj3.name=obj3.name;
        obj3.roll=obj2.roll;

        // Student obj4=new Student(); //error will occur becuase we dont have this type of constructor without argument
        // obj4=obj2.clone();

        System.out.println("obj1 = obj1.name :"+obj1.name);
        System.out.println("obj1 = obj1.roll :"+obj1.roll);

        System.out.println("obj1 = obj2.name :"+obj2.name);
        System.out.println("obj1 = obj2.name :"+obj2.roll);
    }
}