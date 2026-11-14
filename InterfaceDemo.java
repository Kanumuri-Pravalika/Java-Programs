interface Animal
{
    void makeSound();
}
class Cat implements Animal
{
    public void makeSound()
    {
        System.out.println("Meow Meow");
    }
}
class Dog implements Animal
{
    public void makeSound()
    {
        System.out.println("Bow Bow");
    }
}
public class InterfaceDemo
{
    public static void main(String[] args)
    {
        Cat obj1=new Cat();
        obj1.makeSound();
        Dog obj2=new Dog();
        obj2.makeSound();
    }
}
