import java.lang.reflect.Array;

/**
 * Created by asheeshkumar on 2/25/17.
 */

public class GenericStack<T>
{
    private int max_size;
    private T[] Stack;
    private int top;

    public GenericStack(int size)
    {
        this.max_size = size;
        this.Stack = (T[]) new Object[size];
        this.top = -1;
    }

    public void push(T input)
    {
        if(this.isStackFull()){
            System.out.println(("Stack Overflow"));

        }
        System.out.println("Addition: "+ input);
        this.Stack[++top] = input;
    }

    public T pop() throws Exception
    {
        if(this.isStackEmpty()){
            throw new Exception("Stack Underflow");
        }
        T entry = this.Stack[top--];
        System.out.println("Removed element: "+ entry);
        return entry;
    }

    public boolean isStackEmpty()
    {
        return (top == -1);
    }

    public boolean isStackFull()
    {
        return (top == max_size - 1);
    }

    public static void main(String a[]) throws Exception
    {
        GenericStack<String> stringStack = new GenericStack<>(2);
        stringStack.push("AppDirect");
        GenericStack<Integer> integerStack = new GenericStack<>(2);
        integerStack.push(11);
        stringStack.push("Ltd");
        integerStack.pop();
        stringStack.pop();
        stringStack.pop();
    }
}
