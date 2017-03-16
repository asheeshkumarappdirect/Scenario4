/**
 * Created by asheeshkumar on 2/17/17.
 */
public class Throw
{
    public static void main(String[] args)
    {
        try {
            throw new Exception("Something went wrong!!");
        } catch (Exception exp) {
            System.out.println("Error: " + exp.getMessage());
        }
    }
}
