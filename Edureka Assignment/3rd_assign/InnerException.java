/**
 * Write a program explaining inner try catch block
 * Created by asheeshkumar on 2/17/17.
 */
public class InnerException
{
    public static void main(String[] args)
    {
        try
        {
            try
            {
                int a=50/0;
            }
            catch (Exception e)
            {
                System.out.println(e);
            }
        }
        catch (Exception e)
        {
            System.out.println("Handled with care");
        }

        System.out.println("Out..");
    }
}
