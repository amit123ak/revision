// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void main(String[] args) {
        //valid parnathis
        String str="{[]}";
        
        Stack<Character> stack=new Stack<>();
        
        for(int i=0;i<str.length();i++)
        {
             char ch= str.charAt(i);
            if(ch=='{'|| ch=='['|| ch=='(')
            {
                stack.push(ch);
            }else if (stack.isEmpty())
                    {
                        System.out.println("invalid pranthis");
                        return;
                    }else{
                        
                       char top=   stack.pop();
                       
                       if((ch==']' && top!='[' )||(ch==')' && top!='(')|| (ch=='}' && top!='{' ))
                       {
                           System.out.println("not valid");
                           return;
                       }
                        
                    }
        }
        
        if( stack.isEmpty())
        {
            System.out.println("IS Valid");
        }else{
            
            System.out.println("not valid");
        }
        
     
    }
}
