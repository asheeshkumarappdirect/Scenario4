/**
 * Write a program which explains constructor overloading
 * Created by asheeshkumar on 2/15/17.
 */
public class Ctor_Overloading
{
    int x,y;
    Ctor_Overloading()
    {
        System.out.println("x and y are 0");
    }

    Ctor_Overloading(int a)
    {
        System.out.println("x and y are 1");
    }

    Ctor_Overloading(int a, int b)
    {
        System.out.println("x and y are 2");
    }

    public static void main(String[] args)
    {
        Ctor_Overloading obj = new Ctor_Overloading();
        Ctor_Overloading obj1 = new Ctor_Overloading(2);
        Ctor_Overloading obj2 = new Ctor_Overloading(2,3);
    }
}
