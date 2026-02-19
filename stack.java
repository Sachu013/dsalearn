public class stack 
{
  private node top;
  private int length;

  private static class node
  {
    private int data;
    private node next;

    public node(int data)
    {
      this.data=data;
      this.next=null;
    }
  }

  public stack()
  {
    top=null;
    length=0;
  }

  public int length()
  {
    return length;
  }

  public boolean isempty()
  {
    if(length==0) return true;
    else return false;
  }

  public void push(int d)
  {
    node n = new node(d);
    n.next=top;
    top=n;
    length++;
  }

  public void display()
  {
    node cur = top;
    {
      while(cur!=null)
      {
        System.out.print(cur.data+" -> ");
        cur=cur.next;
      }
      System.out.println("null");
    }
  }

  public static void main(String[] args) 
  {
    stack s = new stack();
    s.push(10);
    s.push(20);
    s.push(30);
    s.push(78);
    s.push(145);
    s.push(104);
    s.push(1560);
    
    s.display();
  }

  
}
