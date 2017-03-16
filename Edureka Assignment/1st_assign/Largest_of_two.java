/**
 * Program to find the largest of 2 numbers
 * Created by asheeshkumar on 2/14/17.
 */

import java.util.Scanner;
public class Largest_of_two
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int large=0;
        System.out.println("Enter two numbers:");
        int x= sc.nextInt();
        int y=sc.nextInt();
        large=(x>y)?x:y;
        System.out.println("Largest number: " + large);
    }
}
