/**
 * Write a program which explains method overriding
 * Created by asheeshkumar on 2/15/17.
 */

class Base1
{
    void Display()
    {
        System.out.println("Base Class Function");
    }
}
class Overriding extends Base1
{
    void Display()
    {
        System.out.println("Child Class Function");
    }
    public static void main(String[] args)
    {
        Overriding obj = new Overriding();
        obj.Display();
    }
}
