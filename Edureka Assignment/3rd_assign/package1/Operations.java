package package1;

/**
 * Created by asheeshkumar on 2/17/17.
 */
public class Operations
{
    public int subtract(int x, int y)
    {
        int sub = x - y;
        return sub;
    }

    public int multiply(int x, int y)
    {
        int mul = x * y;
        return mul;
    }

    public double divide(int x, int y)
    {
        double div = x/y;
        return div;
    }

    public int factorial(int x)
    {
        int fact=1;
        for(int i=x; i>=1; i--)
        {
            fact *=i;
        }
        return fact;
    }

    public int reverse(int x)
    {
        int sum=0,a;
        while(x>0)
        {
            a=x%10;
            sum=(sum*10)+a;
            x/=10;
        }
        return sum;
    }
}
