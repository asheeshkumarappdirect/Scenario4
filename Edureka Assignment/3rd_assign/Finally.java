/**
 * Write a program explaining use of finally
 * Created by asheeshkumar on 2/17/17.
 */
public class Finally
{
    public static void main(String[] args)
    {
        try
        {
            int a=50/0;
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
        finally {
            System.out.println("Finally Executed");
        }
    }
}
