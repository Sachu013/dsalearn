import java.util.*;

public class nextgreaterelement 
{

  public static int[] greater (int[] arr)
  {
    int[] result = new int[arr.length];

    Stack<Integer> st = new Stack<>();

    for(int i=arr.length-1;i>=0;i--)
    {
      if(!st.isEmpty())
      {
        while(!st.isEmpty() && st.peek()<arr[i])
        {
          st.pop();
        }
      }
      if(st.isEmpty())
      {
        result[i]=-1;
      }
      else
      {
        result[i]=st.peek();
      }
      st.push(arr[i]);
    }
    return result;
  }
  public static void display(int[] arr)
  {
    for(int i=0;i<arr.length;i++)
    {
      System.out.print(arr[i]+ " ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];
    for(int i =0;i<n;i++)
    {
      arr[i]=sc.nextInt();
    }
    display(arr);
    int[] res = greater(arr);
    display(res);

    sc.close();
  }
  
}
