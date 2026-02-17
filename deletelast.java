public class deletelast 
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

  public void deleteback()
  {
    if(head==null)
    {
      System.out.println("null");      
    }
    else if(head.next==null)
    {
      System.out.println(head.data);
      head=null;
    }
    else
    {
      node cur = head;
      node prev=null;
      while(cur.next!=null)
      {
        prev=cur;
        cur=cur.next;
      }
      prev.next=null;
      System.out.println(cur.data);
    }
    


  }

  public void display()
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
    deletelast df = new deletelast();
    df.insertatend(10);
    df.insertatend(20);
    df.insertatend(30);
    df.insertatend(40);
    df.display();
    df.deleteback();
    df.display();
    
  }
  
}
