// final class Animal
 class Animal
{
    // public void eat()
    public final void eat()
    {
        System.out.println("Animal is eating..");
    }
}
class Dog extends Animal
{
    public void bark()
{
System.out.println("Barking");
}
 /*public void eating()
 {
    
 }*/
}
public class FinalKeyword
{
    public static void main(String[] args)
    {
        Dog d=new Dog();
        d.eat();
        d.bark();
    }
}