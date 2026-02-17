public class deletefirst 
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

  public void deletefront()
  {
    if(head==null)
    {
      System.out.println("null");
      return;
    }
    node temp=head;
    head = head.next;
    temp.next=null;
    System.out.println(temp.data);


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
    deletefirst df = new deletefirst();
    df.insertatend(10);
    df.insertatend(20);
    df.insertatend(30);
    df.insertatend(40);
    df.display();
    df.deletefront();
    df.display();
    
  }
  
}
