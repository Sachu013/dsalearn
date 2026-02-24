import java.util.*;

public class reversestring 
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    char[] arr = s.toCharArray();
    Stack<Character> st = new Stack<>();
    for(int i=0;i<arr.length;i++)
    {
      st.push(arr[i]);
    }
    for(int i=0;i<arr.length;i++)
    {
      arr[i]=st.pop();
    }

    String a =  new String(arr);
    System.out.println(a);

  }

  
}
