public class circularsingle 
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
      this.next=null;
    }
  }

  public circularsingle()
  {
    this.last = null;
    this.length=0;
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
    node first= last.next;
    n.next=first;
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
    node first=last.next;
    last.next=n;
    n.next=first;
    last=n;
    length++;
  }

  public void display()
  {
    if(last==null)
    {
      System.out.println("list empty");
      return;
    }
    node first = last.next;
    while(first!=last)
    {
      System.out.print(first.data+" -> ");
      first=first.next;
    }
    System.out.println(first.data);
  }


  public static void main(String[] args)
  {
    circularsingle a = new circularsingle();
    circularsingle b = new circularsingle();

    a.insertatbeg(10);
    a.insertatbeg(20);
    a.insertatbeg(30);
    a.insertatbeg(40);
    a.insertatbeg(50);

    b.insertatend(15);
    b.insertatend(25);
    b.insertatend(35);
    b.insertatend(45);
    b.insertatend(55);

    a.display();
    b.display();

  }
}
