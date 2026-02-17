public class reverselist 
{

  private node head;

  private static class node
  {
    private int data;
    private node next;
    
    public node(int data)
    {
      this.data = data;
      this.next = null;
    }

  }

  public node reverse()
  {
    if(head==null)
    {
      return head;
    }
    node cur = head;
    node prev= null;
    node next = null;
    while(cur!=null)
    {
      next=cur.next;
      cur.next=prev;
      prev=cur;
      cur=next;
    }
    return prev;

  }

  public void insertatend(int data)
  {
    node n = new node(data);
    if(head==null)
    {
      head=n;
      return;
    }
    node cur = head;
    while(cur.next!=null)
    {
      cur=cur.next;
    }
    cur.next=n;


  }

  
  public void display(node head)
  {
    node cur = head;
    while(cur!=null)
    {
      System.out.print(cur.data+" -> ");
      cur=cur.next;
    }
    System.out.println("null");

  }


  public static void main(String[] args) 
  {
    reverselist df = new reverselist();
    df.insertatend(10);
    df.insertatend(20);
    df.insertatend(30);
    df.insertatend(40);
    df.display(df.head);
    
    node revhead = df.reverse();
    df.display(revhead);
  }
  
}
