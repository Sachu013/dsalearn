import java.util.*;

public class validparanthesis 
{

  public static boolean check(char[] arr)
  {
    Stack<Character> st = new Stack<>();
    for(char c : arr)
    {
      if(c=='(' || c=='[' || c=='{')
      {
        st.push(c);
      }
      else
      {
        if(st.isEmpty())
        {
          return false;
        }
        else
        {
          char top = st.peek();
          if((c ==')' && top =='(') || (c==']' && top =='[') || (c=='}' && top =='{'))
          {
            st.pop();
          }
          else{
            return false;
          }
        }

      }
    }
    return st.isEmpty();
  }
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    char[] arr = s.toCharArray();
    if(check(arr))
    {
      System.out.println("valid paranthesis");
    }
    else
    {
      System.out.println("Invalid paranthesis");
    }




    sc.close();
  }
  
}
