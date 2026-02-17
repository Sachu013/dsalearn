public class nthfromlast 
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

  public void nthlast(int n)
  {
    node cur = head;
    int count=1;
    while(count<n && cur!=null)
    {
      cur=cur.next;
      count++;
    }
    if(cur==null || n<=0)
    {
      System.out.println("out of bounds");
      return;
    }
    node main=head;
    while(cur.next!=null)
    {
      cur=cur.next;
      main=main.next;
    }
    System.out.println(main.data);


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
    nthfromlast df = new nthfromlast();
    df.insertatend(10);
    df.insertatend(20);
    df.insertatend(30);
    df.insertatend(40);
    df.display(df.head);
    
    df.nthlast(3);
    df.nthlast(1);
    df.nthlast(5);
  }
  
}
