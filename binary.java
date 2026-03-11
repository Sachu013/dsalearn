import java.util.Scanner;

public class binary 
{

  public static int search(int[] arr, int n, int k)
  {
    int low = 0;
    int high = n-1;
    while(low<=high)
    {
      int mid = (high+low)/2;
      if(arr[mid]==k)
      {
        return mid;
      }
      if(k>arr[mid])
      {
        low=mid+1;
      }
      else{
        high=mid-1;
      }
    }
    return -1;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int[] arr = new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    int k = sc.nextInt();
    System.out.println(search(arr,n,k));
    sc.close();
  }
  
}
