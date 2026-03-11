import java.util.Scanner;

public class mergesortedarray 
{
  public static int[] merge(int[] arr1, int[] arr2,int n , int m)
  {
    int[] res = new int[n+m];
    int i=0,j=0,k=0;
    while(i<n && j<m)
    {
      if(arr1[i]<arr2[j])
      {
        res[k++]=arr1[i++];
      }
      else
      {
        res[k++]= arr2[j++];
      }
    }
    while(i<n)
    {
      res[k++]=arr1[i++];
    }
    while(j<m)
    {
      res[k++]=arr2[j++];
    }
    return res;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n= sc.nextInt();
    int[] arr1 = new int[n];
    int m= sc.nextInt();
    int[] arr2 = new int[m];
    for(int i=0;i<n;i++)
    {
      arr1[i]=sc.nextInt();
    }
    for(int i=0;i<m;i++)
    {
      arr2[i]=sc.nextInt();
    }
       
    int[] res = merge(arr1,arr2,n,m);

     for(int i=0;i<n+m;i++)
    {
      System.out.print(res[i]+" ");
    }
    sc.close();
  }
}
