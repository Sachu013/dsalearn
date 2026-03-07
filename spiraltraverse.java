import java.util.*;

public class spiraltraverse 
{

  public static void main(String[] args) 
  {

    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int c = sc.nextInt();
    int[][] arr = new int[r][c];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        arr[i][j]=sc.nextInt();
      }
    }

    int i,k=0,l=0;
    while(k<r && l<c)
    {
      for(i=l;i<c;i++)
      {
        System.out.print(arr[k][i]+" ");
      }
      k++;
      for(i = k;i<r;i++)
      {
        System.out.print(arr[i][c-1]+" ");
      }
      c--;
      if(k<r)
      {
        for(i = c-1;i>=l;i--)
        {
          System.out.print(arr[r-1][i]+" ");
        }
        r--;
      }
      if(l<c)
      {
        for(i = r-1;i>=k;i--)
        {
          System.out.print(arr[i][l]+" ");
        }
        l++;
      }
    }
    
  }
  
}
