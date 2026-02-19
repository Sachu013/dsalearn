public class delete 
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

  public delete()
  {
    this.head=null;
    this.tail=null;
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
      head=n;
      tail=n;
    }
    else{
      n.next=head;
      head.previous=n;
      head=n;
    }
    length++;
  }

  public void insertatend(int d)
  {

    node n = new node(d);
    if(isempty())
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

  public void deleteatfirst()
  {
    if(isempty())
    {
      System.out.println("list empty");
      return;
    }
    if(length()==1)
    {
      head=tail=null;
      length=0;
      return;
    }
    head=head.next;
    head.previous=null;
    length--;
  }

  public void deleteatlast()
  {
    if(isempty())
    {
      System.out.println("list empty");
      return;
    }
    if(length()==1)
    {
      head=tail=null;
      length=0;
      return;
    }
    tail=tail.previous;
    tail.next=null;
    length--;
  }

  

  public void display()
  {
    node cur = head;
    while(cur!=null)
    {
      System.out.println(cur.data+" -> ");
      cur=cur.next;
    }
    System.out.println("null");
  }
  
}
