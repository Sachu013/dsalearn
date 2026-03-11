import java.util.Scanner;

public class bubble 
{
  
  public static void bubblesort(int[] arr, int n)
  {
    for(int i=0;i<n-1;i++)
    {
      boolean check = false;
      for(int j=0;j<n-1-i;j++)
      {
        if(arr[j]>arr[j+1])
        {
          int temp = arr[j];
          arr[j] = arr[j+1];
          arr[j+1] = temp;
          check = true;
        }
      }
      if(!check)
      {
        break;
      }
    }

  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
       
    bubblesort(arr,n);

     for(int i=0;i<n;i++)
    {
      System.out.print(arr[i]+" ");
    }
    sc.close();
  }

  
}

  

