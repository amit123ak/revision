// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    
    public static void marksrow(int [][] matrix,int i, int m)
    {
        for(int j=0;j<m;j++)
        {
            if(matrix[i][j]!=0)
            {
                matrix[i][j]=-1;
            }
        }
    }
    
     
    public static void markscol(int  matrix[][],int j, int n)
    {
        for(int i=0;i<n;i++)
        {
            if(matrix[i][j]!=0)
            {
                matrix[i][j]=-1;
            }
        }
    }
    public static int [][] setresult(int matrix[][])
    {
        int n= matrix.length;
        int m= matrix[0].length;
        
     for(int i=0;i<n;i++)
     {
     for(int j=0;j<m;j++)
     {
         if(matrix[i][j]==-1)
         
         {
             matrix[i][j]=0;
         }
     }
         
     }
     return matrix;
    }
    public static void setallzero(int matrix [][])
    {
        
        int n= matrix.length;
        int m= matrix[0].length;
        for(int i=0;i<n;i++)
        {
         for(int j=0;j<m;j++)
         {
             
             if(matrix[i][j]==0)
             {
                 marksrow(matrix,i,m);
                 markscol(matrix,j,n);
                 
             }
         }
        }
    }
    public static void main(String[] args) {
      int matrix[][]={{1,2,3},{4,0,6},{7,8,0}};
      
      setallzero(matrix);
      
      int newmat[][]= setresult(matrix);
      
      int n= newmat.length;
      int m = newmat[0].length;
      for(int i=0;i<n;i++)
      {
      for(int j=0;j<m;j++)
      {
          System.out.print(newmat[i][j]+" ");
      }
      System.out.println(" ");
      }
        
    }
}
