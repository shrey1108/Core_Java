class Animal
{
    public void eat()
    {
        System.out.println("Eating");
    }
}
class Dog extends Animal{
    public void bark()
    {
        System.out.println("Barking");
    }
}
class Cat extends Animal
{
    public void mew()
    {
        System.out.println("Mewing");
    }
}
public class Hierarchical
{
    public static void main(String[] args)
    {
        Dog d=new Dog();
        d.eat();
        d.bark();

        Cat c= new Cat();
        c.mew();
        c.eat();
    }
}