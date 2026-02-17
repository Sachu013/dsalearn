public class insertfirst 
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

  public void insertfront(int d)
  {
    node n = new node(d);
    n.next=head;
    head=n;
    

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
    insertfirst i = new insertfirst();
    i.insertfront(10);
    i.insertfront(20);
    i.insertfront(40);
    i.insertfront(25);
    i.display();

    
  }
  
}
