/**
 * Created by asheeshkumar on 2/15/17.
 */
public class Keywords
{
    static int count=0;
    int age;
    String name;
    void Get_Info(int age, String name)
    {
        this.age=age;
        this.name=name;
    }

    void Show_Info()
    {
        System.out.println(age);
        System.out.println(name);
    }
    public static void main(String[] args)
    {
        final double pi=3.14;
        Keywords obj = new Keywords();
        obj.Get_Info(25,"Asheesh");
        obj.Show_Info();
        double area = pi*3*3;
        System.out.println("Area of circle with radius 3 is: " + area);
    }
}
