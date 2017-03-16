/**
 * Created by asheeshkumar on 2/15/17.
 */

import java.util.Scanner;

public class Multi_Array
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter number of rows:");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns:");
        int col = sc.nextInt();

        int[][] arr = new int[rows][col];

        System.out.println("********************");
        System.out.print("Enter the elements: ");
        for(int i=0; i<arr.length; i++)
        {
            for(int j=0; j<arr.length; j++)
                arr[i][j] = sc.nextInt();
        }

        System.out.print("Elements of array are:");
        for(int i=0; i<arr.length; i++)
        {
            System.out.println();
            for(int j=0; j<arr.length; j++)
                System.out.print(arr[i][j] + " ");
        }
    }
}
