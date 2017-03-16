/**
 * Write a program to understand constructor inheritance
 * Created by asheeshkumar on 2/15/17.
 */
class Top
{
    Top()
    {
        System.out.println("Base Class Constructor");
    }
}
public class Ctor_Inheritance extends Top
{
    Ctor_Inheritance()
    {
        System.out.println("Child Class Constructor");
    }
    public static void main(String[] args)
    {
        Ctor_Inheritance obj = new Ctor_Inheritance();
    }
}
