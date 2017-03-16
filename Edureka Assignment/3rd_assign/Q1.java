/**
 *  Write a program to define a queue interface and have insert and delete methods in the interface. Implement these methods in a class.
 * Created by asheeshkumar on 2/17/17.
 */
import java.util.*;

interface queue
{
    void insert(int x);
    void delete();
}

public class Q1 implements queue
{
    static Queue q1 = new LinkedList();

    public static void main(String[] args)
    {
        Q1 obj = new Q1();
        obj.insert(10);
        System.out.println(q1);
        obj.insert(20);
        System.out.println(q1);
        obj.insert(30);
        System.out.println(q1);
        obj.delete();
        System.out.println(q1);
    }

    public void insert(int x)
    {
        q1.add(x);
    }

    public void delete()
    {
        q1.remove();
    }
}
