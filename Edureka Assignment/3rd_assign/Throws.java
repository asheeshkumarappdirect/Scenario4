/**
 * Created by asheeshkumar on 2/17/17.
 */
  public class Throws extends Thread
    {
        public static void main(String[] args) throws InterruptedException {
            for(int i=0;i<5;i++)
            {
                System.out.print(i+" ");
                Thread.sleep(1000);
            }
        }
    }
