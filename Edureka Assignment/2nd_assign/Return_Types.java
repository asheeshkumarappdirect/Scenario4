/**
 * Write a program which explores functions with different return types in java
 * Created by asheeshkumar on 2/15/17.
 */
public class Return_Types
{
    static int Sum(int a, int b)
    {
        int c = a + b;
        return c;
    }

    static double Sum(double a, double b)
    {
        double c= a + b;
        return c;
    }

    public static void main(String[] args)
    {
        int x = Sum(10, 30);
        System.out.println(x);
        double y = Sum(10.0, 30.0);
        System.out.println(y);
    }
}
