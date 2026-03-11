import java.util.Scanner;

public class linear 
{

  public static int search(int[] arr, int n, int k)
  {
    for(int i=0;i<n;i++)
    {
      if(arr[i]==k)
      {
        return i;
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
