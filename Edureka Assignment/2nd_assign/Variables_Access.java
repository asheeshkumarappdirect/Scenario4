/**
 * Write a program explaining state of objects by accessing class and local variables
 * Created by asheeshkumar on 2/15/17.
 */
public class Variables_Access
{
    int age=25;
    String name="Asheesh";
    public static void main(String[] args)
    {
        int age=20;
        String name="Ashu";
        Variables_Access obj = new Variables_Access();
        System.out.println("Class Members");
        System.out.println(obj.age);
        System.out.println(obj.name);
        System.out.println("-------------");
        System.out.println("Main Members");
        System.out.println(age);
        System.out.println(name);
    }
}
