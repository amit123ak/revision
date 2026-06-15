// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void main(String[] args) {
        
        Stack<Integer> stack=new Stack<>();
        
        // wanted to find the next grater element 
       int[] arr = {4, 5, 2, 10, 8};
      int result[] =new int[arr.length];
      
        for(int i=arr.length-1;i>=0;i--)
        {
            while(!stack.isEmpty() && arr[stack.peek()]<=arr[i])
            {
                stack.pop();
            }
            result[i]= stack.isEmpty()? -1: arr[stack.peek()];
                    stack.push(i);

        }
        
        System.out.println(Arrays.toString(result));

    }
}
