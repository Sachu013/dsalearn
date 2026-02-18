public class doublelinklist 
{
  private node head;
  private node tail;
  private int length;

  private static class node
  {
    private int data;
    private node next;
    private node previous;  

    public node(int data)
    {
      this.data=data;
    }
  }

  public doublelinklist()
  {
    this.head=null;
    this.tail=null;
    this.length=0;
  }

  public int length()
  {
    return length;
  }

  public void insertatbeg(int d)
  {
    node n = new node(d);
    if(head==null)
    {
      head=n;
      tail=n;
    }
    else
    {
      n.next=head;
      head.previous=n;
      head=n;
    }
    length++;

  }

  public void insertatend(int d)
  {
    node n = new node(d);
    if(head==null)
    {
      head=n;
      tail=n;
    }
    else
    {
      tail.next=n;
      n.previous=tail;
      tail=n;
    }
    length++;
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

  public void revdisplay()
  {
    node cur = tail;
    while(cur!=null)
    {
      System.out.print(cur.data+" -> ");
      cur=cur.previous;
    }
    System.out.println("null");
  }

  public static void main(String[] args)
  {
    doublelinklist a= new doublelinklist();
    a.insertatbeg(10);
    a.insertatbeg(20);
    a.insertatbeg(30);
    a.insertatbeg(40);

    doublelinklist b= new doublelinklist();
    b.insertatend(15);
    b.insertatend(25);
    b.insertatend(35);
    b.insertatend(45);

    a.display();
    a.revdisplay();
    b.display();
    b.revdisplay();
    

  }

}
