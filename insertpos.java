public class insertpos 
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

  public insertpos()
  {
    this.head=null;
    this.tail=null;
    this.length=0;
  }

  public int length()
  {
    return length;
  }

  public void insertatpos(int d, int pos)
  {
    node n = new node(d);
    if(pos>length()+1 || pos<=0)
    {
      System.out.println("position out of bounds");
      return;
    }
    if(pos==1 && head==null)
    {
      head=n;
      tail=head;
    }
    else if(pos==1 && head!=null)
    { 
      n.next=head;
      head.previous=n;
      head=n;
    }
    else
    {
      node cur = head;
      node prev=null;
      int count=1;
      while(cur!=null && count<pos)
      {
        count++;
        prev=cur;
        cur=cur.next;
      }
      if(cur==null)
      {
        prev.next=n;
        n.previous=prev;
        tail=n;
      }
      else
      {
        prev.next=n;
        cur.previous=n;
        n.previous=prev;
        n.next=cur;
      }
    }
    length++;
    
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
    insertpos a= new insertpos();
    a.insertatbeg(10);
    a.insertatbeg(20);
    a.insertatbeg(30);
    a.insertatbeg(40);

    doublelinklist b= new doublelinklist();
    b.insertatend(15);
    b.insertatend(25);
    b.insertatend(35);
    b.insertatend(45);

    a.insertatpos(25, 3);
    a.insertatpos(1, 1);
    a.insertatpos(2, 0);
    a.insertatpos(3, 7);
    a.insertatpos(4, 7);
    
    
   

    a.display();
    a.revdisplay();
    b.display();
    b.revdisplay();
    

  }

}
