/**
 * Write a program to understand abstract classes
 * Created by asheeshkumar on 2/15/17.
 */

abstract class Base2
{
    abstract void Display();
}

public class Abstract_Class extends Base2
{
    void Display()
    {
        System.out.println("Abstract");
    }

    public static void  main(String[] args)
    {
        Abstract_Class obj = new Abstract_Class();
        obj.Display();
    }
}
