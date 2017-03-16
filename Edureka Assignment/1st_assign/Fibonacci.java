/**
 * Created by asheeshkumar on 2/14/17.
 */
import java.util.Scanner;
public class Fibonacci
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the final number:");
        int num = sc.nextInt();
        int a=0,b=1,c=0;
        System.out.print(a + " " + b + " ");

        for(int i=2;i<num;i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.print(c + " ");
        }
    }
}
