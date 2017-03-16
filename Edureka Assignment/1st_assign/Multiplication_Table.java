/**
 * Program to display the multiplication table of a number
 * Created by asheeshkumar on 2/14/17.
 */

import java.util.Scanner;

public class Multiplication_Table
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println(num + "*" + i + "=" + num*i);
        }
    }
}
