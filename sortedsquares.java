import java.util.*;
public class sortedsquares 
{

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    int[] res = new int[n];

    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }

    int i=0,j=n-1;
    
    for(int k=n-1;k>=0;k--)
    {
      if(Math.abs(arr[i])>Math.abs(arr[j]))
      {
        res[k]=arr[i]*arr[i];
        i++;
      }
      else
      {
        res[k]=arr[j]*arr[j];
        j--;
      }
    }

    for(int a=0;a<n;a++)
    {
      System.out.print(res[a]+" ");
    }
    


    sc.close();
  }
  
}
