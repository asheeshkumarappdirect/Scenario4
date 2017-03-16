/**
 * Create an object for a class and access its elements in a java program
 * Created by asheeshkumar on 2/15/17.
 */

import java.util.Scanner;

public class Class_Object
{
    Scanner sc = new Scanner(System.in);
    int age;
    String name;

    void Get_Info()
    {
        System.out.println("Enter age:");
        age = sc.nextInt();
        System.out.println("Enter name:");
        name = sc.next();
    }

    void Show_Info()
    {
        System.out.println("Details:");
        System.out.println(age);
        System.out.println(name);
    }

    public static void main(String[] args)
    {
        Class_Object obj = new Class_Object();

        obj.Get_Info();
        obj.Show_Info();
    }
}
