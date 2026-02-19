public class deleteatpos 
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

  public deleteatpos()
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

  public void deleteatpos(int pos)
  {
    if(isempty())
    {
      System.out.println("list empty");
      return;
    }
    if(pos<=0 || pos>length())
    {
      System.out.println("position out of bounds");
      return;
    }
    if(pos==1 && length()==1)
    {
      head=tail=null;
      length=0;
      return;
    }
    if(pos==1)
    {
      head=head.next;
      head.previous=null;
      length--;
      return;
    }
    if(pos==length())
    {
      tail=tail.prev;
      tail.next=null;
      length--;
      return;
    }
    node cur=head;
    node prev=null;
    int count=1;
    while(cur!=null && count<pos)
    {
      prev=cur;
      cur=cur.next;
      count++;
    }
    prev.next=cur.next;
    cur.next.previous=prev;
    length--;;
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
