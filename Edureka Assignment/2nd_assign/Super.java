/**
 * Write a program to understand super class
 * Created by asheeshkumar on 2/15/17.
 */

class Parent
{
    void Display()
    {
        System.out.println("I have reached base class using super keyword");
    }
}

public class Super extends Parent
{
    void Display()
    {
        super.Display();
    }
    public static void main(String[] args)
    {
        Super obj = new Super();
        obj.Display();
    }
}
