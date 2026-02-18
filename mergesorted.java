public class mergesorted 
{
  private node head;

  private static class node{
    private int data;
    private node next;

    public node(int data)
    {
      this.data=data;
      this.next = null;
    }

  }

  public void display()
  {
    node cur=head;
    while(cur!=null)
    {
      System.out.print(cur.data+" -> ");
      cur=cur.next;
    }
    System.out.println("null");

  }


  public void add(int d)
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
    cur.next = n;
  }


  public node merge(node a, node b)
  {
    node dummy = new node(0);
    node cur=dummy;
    while(a!=null && b!=null)
    {
      if(a.data<b.data)
      {
        cur.next=a;
        a=a.next;
      }
      else{
        cur.next=b;
        b=b.next;
      }
      cur=cur.next;
    }
    if(a==null)
    {
      cur.next=b;
    }
    else{
      cur.next=a;
    }
    return dummy.next;
  }


  public static void main(String[] args) {
    mergesorted m1 = new mergesorted();
    mergesorted m2 = new mergesorted();
    mergesorted m3 = new mergesorted();
    m1.add(10);
    m1.add(20);
    m1.add(30);
    m1.add(40);
    m2.add(15);
    m2.add(25);
    m2.add(35);
    m2.add(45);
    m1.display();
    m2.display();
    m3.head = m3.merge(m1.head,m2.head);
    m3.display();
  }
  
}
