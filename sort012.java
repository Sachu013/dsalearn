//dutch national flag problem

import java.util.Scanner;

public class sort012 
{

  public static void swap(int[] arr, int i, int j)
  {
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
  }

  public static void sort(int[]arr) 
  {
    int i=0,j=0,k=arr.length-1;
    while(i<=k)
    {
      if(arr[i]==0)
      {
        swap(arr,i,j);
        i++;j++;
      }
      else if(arr[i]==1)
      {
        i++;
      }
      else if(arr[i]==2)
      {
        swap(arr,i,k);
        k--;
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
       
    sort(arr);

     for(int i=0;i<n;i++)
    {
      System.out.print(arr[i]+" ");
    }
    sc.close();
  }

  
}
