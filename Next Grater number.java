// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    public static void main(String[] args) {
        
        // wanted to find the next grater element 
      int[] arr = {4, 5, 2, 10, 8};
      
      for(int i=0;i<arr.length;i++)
      {
          int maxnext=-1;
          for(int j=i+1;j<arr.length;j++)
          {
              
              if(arr[i]<arr[j])
              {
                  maxnext=arr[j];
                  break;
              }
          }
          
          System.out.println(maxnext);
      }

    }
}
