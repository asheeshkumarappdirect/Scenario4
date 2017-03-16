/**
 * Write a program which explains class inheritance
 * Created by asheeshkumar on 2/15/17.
 */

class Base
{
    int a=10, b=20;
    Base()
    {
        System.out.println("I am in Base Class");

    }
}

public class Inheritance extends Base
{
    Inheritance()
    {
        System.out.println("Now, I am in Child Class");
    }
    public static void main(String[] args)
    {
        Inheritance obj = new Inheritance();
        System.out.println("Base Class Variables:");
        System.out.println(obj.a);
        System.out.println(obj.b);
    }
}
