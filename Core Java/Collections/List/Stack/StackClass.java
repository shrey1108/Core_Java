import java.util.*;
public class StackClass
{
    public static void main(String[] args)
    {
        Stack<Integer> stack=new Stack();
        stack.push(100);
        stack.push(300);
        stack.push(300);
        stack.push(200);
        stack.push(100);

        System.out.println(stack);
         
        //push/add in top
        stack.push(1000);
        System.out.println(stack);

        //remove from above
        stack.pop();
        System.out.println(stack);

        // to remove and store in variable
        int removedele=stack.pop();//remove from top
        System.out.println("Removed Element :"+removedele);
        System.out.println(stack);

        System.out.println("Search element in stack :"+(stack.search(100))); 

        System.out.println("Retreive data from top :"+(stack.peek()));
    }
}