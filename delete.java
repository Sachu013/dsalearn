public class delete 
{
  private node last;
  private int length;

  private static class node
  {
    private int data;
    private node next;

    public node(int data)
    {
      this.data=data;
      this.next= null;
    }

  }

  public delete()
  {
    last=null;
    length=0;
  }

  public int length()
  {
    return length;
  }

  public boolean isempty()
  {
    if(length==0) return true;
    else return false;
  }

  public void insertatbeg(int d)
  {
    node n = new node(d);
    if(isempty())
    {
      last=n;
      last.next=last;
      length++;
      return;
    }
    n.next=last.next;
    last.next=n;
    length++;
  }

  public void insertatend(int d)
  {
    node n = new node(d);
    if(isempty())
    {
      last=n;
      last.next=last;
      length++;
      return;
    }
    n.next=last.next;
    last.next=n;
    last=n;
    length++;
  }

  public void display()
  {
    node first=last.next;
    while(first!=last)
    {
      System.out.print(first.data+" -> ");
      first=first.next;
    }
    System.out.println(first.data);
  }

  public void deleteatbeg()
  {
    if(isempty())
    {
      System.out.println("list is empty");
      return;
    }
    if(length==1)
    {
      last=null;
      length=0;
      return;
    }
    last.next= last.next.next;
    length--;
  }

  public void deleteatend()
  {
    if(isempty())
    {
      System.out.println("list is empty");
      return;
    }
    if(length==1)
    {
      last=null;
      length=0;
      return;
    }
    node cur = last.next;
    while(cur.next!=last)
    {
      cur=cur.next;
    }
    cur.next=last.next;
    last=cur;
    length--;

  }

  public static void main(String[] args)
  {
    delete a = new delete();
    delete b = new delete();

    a.deleteatbeg();

    a.insertatbeg(10);
    a.insertatbeg(20);
    a.insertatbeg(30);
    a.insertatbeg(40);
    a.insertatbeg(50);

    b.deleteatend();

    b.insertatend(15);
    b.insertatend(25);
    b.insertatend(35);
    b.insertatend(45);
    b.insertatend(55);

    a.display();
    b.display();

    a.deleteatbeg();
    a.deleteatend();
    b.deleteatbeg();
    b.deleteatend();

    a.display();
    b.display();


  }

  
}
