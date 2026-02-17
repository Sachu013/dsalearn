public class insertend 
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

  public void insertback(int d)
  {
    node n = new node(d);
    if(head == null)
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
    insertend i = new insertend();
    i.insertback(10);
    i.insertback(20);
    i.insertback(40);
    i.insertback(25);
    i.display();

    
  }
  
}
