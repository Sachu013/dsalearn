import java.util.*;

//Code to search in a row and column wise sorted matrix

public class matrixsearch 
{

  public static void search(int[][] arr, int n, int val)
  {
    int i=0;
    int j=n-1;
    while(i<n && j>=0)
    {
      if(arr[i][j]==val)
      {
        System.out.println(val+" found at "+i+ " & "+ j);
        return;
      }
      if(arr[i][j]>val)
      {
        j--;
      }
      else
      {
        i++;
      }
    }
    System.out.println("not found");
  }

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int[][] arr = new int[4][4];
    for(int i=0;i<4;i++)
    {
      for(int j=0;j<4;j++)
      {
        arr[i][j]=sc.nextInt();
      }
    }

    int val = sc.nextInt();
    
    search(arr,4,val);

    sc.close();

  }
  
}
