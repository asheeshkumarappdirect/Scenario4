/**
 * Create a Single Dimensional array and iterate it using for loop
 * Created by asheeshkumar on 2/15/17.
 */

import java.util.Scanner;

public class Single_Array
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        int size =sc.nextInt();

        System.out.println("Enter the size of array:");

        int [] arr = new int[size];

        System.out.println("Enter the elements: ");

        for(int i=0; i<arr.length; i++)
            arr[i] = sc.nextInt();

        System.out.print("Elements of array are: ");
        for(int i=0;i<arr.length;i++)

            System.out.print(arr[i] + " ");
    }
}
