// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class Main {
    public static void main(String[] args) {
        //valid parnathis
        StringBuilder sb =new StringBuilder();
      
      String str="aaaaaaaammitbbcc";
       
       for(int i=0;i<str.length();i++)
       {
           int count=1;
           while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1))
           {
               
               count++;
               i++;
               
           }

               
            sb.append(str.charAt(i)).append(count); 
            
           
        
           
           
           
       }
        System.out.println(sb);
       
       
  
        
      
    
    }
}
