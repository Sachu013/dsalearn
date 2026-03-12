import java.util.Scanner;

public class merge 
{

  public static void mer(int[] arr, int left, int mid, int right)
  {
    int n1 = mid-left+1;
    int n2 = right - mid;
    int[] l = new int[n1];
    int[] r = new int[n2];
    for(int i=0;i<n1;i++)
    {
      l[i]=arr[i+left];
    }
    for(int i=0;i<n2;i++)
    {
      r[i]=arr[mid+1+i];
    }
    int i=0,j=0,k=left;
    while(i<n1 && j<n2)
    {
      if(l[i]<r[j])
      {
        arr[k++]=l[i++];
      }
      else{
        arr[k++]=r[j++];
      }
    }
    while(i<n1)
    {
      arr[k++]=l[i++];
    }
    while(j<n2)
    {
      arr[k++]=r[j++];
    }
  }

  public static void mergesort(int[] arr,int left, int right)
  {
    if(left<right)
    {
      int mid = left + (right-left)/2;
      mergesort(arr, left, mid);
      mergesort(arr, mid+1, right);
      mer(arr, left, mid, right);
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
       
    mergesort(arr,0,n-1);

     for(int i=0;i<n;i++)
    {
      System.out.print(arr[i]+" ");
    }
    sc.close();
  }
  
}
