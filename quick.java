import java.util.Scanner;

public class quick 
{
  public static int partition(int[] arr, int left,  int right)
  {
    int pivot = arr[right];
    int i=0;
    int j=0;
    while(i<=right)
    {
      if(arr[i]<=pivot)
      {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        j++;
      }
      i++;
    }
  return j-1;

  }

  public static void quicksort(int[] arr,int left, int right)
  {
    if(left<right)
    {
      int pi = partition(arr,left,right);
      quicksort(arr, left, pi-1);
      quicksort(arr, pi+1, right);
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
       
    quicksort(arr,0,n-1);

     for(int i=0;i<n;i++)
    {
      System.out.print(arr[i]+" ");
    }
    sc.close();
  }
  
}
