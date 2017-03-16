/**
 * Program to find the largest of 03 numbers
 * Created by asheeshkumar on 2/14/17.
 */

import java.util.Scanner;
public class Largest_of_three
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int x,y,z,large=0;
        System.out.println("Enter three numbers:");
        x= sc.nextInt();
        y=sc.nextInt();
        z=sc.nextInt();
        large= x>y ? (x>z?x:z) : (y>z?y:z);
        System.out.println("Largest number:" + large);
    }
}
