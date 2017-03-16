package package2;

/**
 * Created by asheeshkumar on 2/17/17.
 */

import package1.*;
public class Access
{
    public static void main(String[] args)
    {
        Operations obj =new Operations();
        int sub = obj.subtract(10, 5);
        System.out.println(sub);
        int mul = obj.multiply(10, 5);
        System.out.println(mul);
        double div = obj.divide(10,5);
        System.out.println(div);
        int fact = obj.factorial(5);
        System.out.println(fact);
        int rev = obj.reverse(234);
        System.out.println(rev);
    }
}
