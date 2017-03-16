/**
 * Created by asheeshkumar on 2/17/17.
 */
public class ArrayOutOfBound
{
    public static void main(String[] args)
    {
        int[] arr = new int[5];

        try
        {
            for(int i=0; i<6; i++)
            {
                System.out.println(arr[i]);
            }
        }

        catch (Exception e)
        {
            System.out.println(e);
        }
    }
}
