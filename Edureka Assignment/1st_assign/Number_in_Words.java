/**
 * Program to display a number in words
 * Created by asheeshkumar on 2/14/17.
 */

import java.util.Scanner;
public class Number_in_Words
{
    public static void main(String[] args)
    {
        String digits[]={"Zero", "One", "Two","Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
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
        temp=sum;
        while(temp>0)
        {
            x=temp%10;
            System.out.print(digits[x] + " ");
            temp/=10;
        }
    }
}
