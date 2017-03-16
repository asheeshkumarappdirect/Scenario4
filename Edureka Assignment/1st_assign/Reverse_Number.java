/**
 * Program to reverse a number
 * Created by asheeshkumar on 2/14/17.
 */

import java.util.Scanner;

public class Reverse_Number
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        int temp=num,sum=0,x;
        while(temp>0)
        {
            x=temp%10;
            sum=(sum*10)+x;
            temp/=10;
        }
        System.out.println("Reversed number: " + sum);
    }
}
