/**
 * Write a program catching arithmetic exception
 * Created by asheeshkumar on 2/17/17.
 */
public class ArithmeticException
{
    public static void main(String[] args)
    {
        try
        {
            int a = 50/0;
            System.out.println(a);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
