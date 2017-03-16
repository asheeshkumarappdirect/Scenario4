/**
 * Created by asheeshkumar on 2/17/17.
 */

class Threads extends Thread
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("5 * "+i+" = "+(5*i));
        }
    }
}
 class MultiThreading
{
    public static void main(String[] args)
    {
        Threads obj = new Threads();
        obj.start();
        for(int i=2;i<=40;i++)
        {
            System.out.println("Even number - "+i);
            i++;
        }
    }
}