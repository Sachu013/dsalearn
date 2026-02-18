public class insertinsorted 
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

  public void insert(int d)
  {
    node n = new node(d);
    if(head==null || d<head.data)
    {
      n.next=head;
      head=n;
      return;
    }
    node cur = head;
    node prev = null;
    while(cur!=null && cur.data<=d)
    {
      prev=cur;
      cur=cur.next;
    }
    n.next=cur;
    prev.next= n;
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
    insertinsorted df = new insertinsorted();
    df.insertatend(10);
    df.insertatend(20);
    df.insertatend(30);
    df.insertatend(40);
    df.display(df.head);
    
    df.insert(3);
    df.insert(1);
    df.insert(5);
    df.insert(10);
    df.insert(50);
    df.insert(15);
    df.insert(65);
    df.insert(35);
    df.display(df.head);
  }
  
}
