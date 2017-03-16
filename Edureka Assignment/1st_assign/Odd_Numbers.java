/**
 * Program to display the odd numbers between x & y
 * Created by asheeshkumar on 2/14/17.
 */

import java.util.Scanner;

public class Odd_Numbers
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two values:");
        int x =  sc.nextInt();
        int y = sc.nextInt();
        for(int i=x+1;i<=y;i++)
        {
            if(i%2!=0)
                System.out.print(i + " ");
        }
    }
}
