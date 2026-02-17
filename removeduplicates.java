public class removeduplicates
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

  public node remove()
  {
    if(head==null || head.next==null)
    {
      return head;
    }
    node cur = head;
    while(cur.next!=null)
    {
       if(cur.data==cur.next.data)
       {
        cur.next=cur.next.next;
        continue;
       }
       cur=cur.next;
    }
    return head;

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
    removeduplicates df = new removeduplicates();
    df.insertatend(10);
    df.insertatend(10);
    df.insertatend(20);
    df.insertatend(30);
    df.insertatend(30);
    df.insertatend(30);
    df.insertatend(40);
    df.display(df.head);
    
    node rev = df.remove();
    df.display(rev);
  }
  
}
