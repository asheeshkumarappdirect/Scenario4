/**
 * Write a program to explore constructor with parameters
 * Created by asheeshkumar on 2/15/17.
 */
public class Parameterized_Ctor
{
    Parameterized_Ctor(int i, int j)
    {
        System.out.println("I am in parameterized Constructor");
        System.out.println("Values are: " + i + " and " + j);
    }
    public static void main(String[] args)
    {
        Parameterized_Ctor obj= new Parameterized_Ctor(10,20);
    }
}
