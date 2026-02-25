import java.util.*;

public class binarynumbers 
{

  public static String[] num(int n)
  {
    String[] result = new String[n];
    Queue <String> q = new LinkedList<>();
    q.offer("1");
    for(int i =0;i<n;i++)
    {
      result[i]= q.poll();
      String s1 = result[i]+"0";
      String s2 = result[i]+"1";
      q.offer(s1);
      q.offer(s2);
    }
    return result;

  }
  

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String[] s = num(n);
    for(String a: s)
    {
      System.out.println(a);
    }

    sc.close();
  }
  
}
