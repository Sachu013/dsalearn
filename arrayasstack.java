public class arrayasstack
{
  private int[] arr;
  private int top;

  public arrayasstack(int capacity)
  {
    arr= new int[capacity];
    top=-1;
  }

  public arrayasstack()
  {
    this(10);
  }

  public boolean isfull()
  {
    if(top>=arr.length)
      return true;
    else
      return false;
  }

  public boolean isempty()
  {
    if(top<0)
      return true;
    else
      return false;
  }

  public void push(int d)
  {
    if(isfull())
    {
      System.out.println("Stack already full");
    }
    else{
      arr[++top]=d;
    }
  }

  public int pop()
  {
    if(isempty())
    {
      System.out.println("Stack empty");
      return -1;
    }
    else
    {
      int result=arr[top--];
      return result;      

    }
  }

  public int peek()
  {
    if(isempty())
    {
      System.out.println("array is empty");
      return -1;
    }
    else
    {
      return arr[top];
    }

  }
  
}
