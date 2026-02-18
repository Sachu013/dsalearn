public class addtwolist 
{
  private node head;
  private static class node{
    private int data;
    private node next;

    public node(int data)
    {
      this.data=data;
      this.next=null;
    }
  }



  public void insert(int d)
  {
    node n = new node(d);
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
    cur.next = n;

  }

  public node sum(node a, node b)
  {
    node dummy = new node(0);
    node tail = dummy;
    int carry=0;
    while(a!=null || b!=null)
    {
      int x = (a!=null)?a.data:0;
      int y = (b!=null)?b.data:0;
      int sum = carry+x+y;
      carry=sum/10;
      tail.next = new node(sum%10);
      tail=tail.next;
      if(a!=null)a=a.next;
      if(b!=null)b=b.next;
    }
    if(carry>0)
    {
      tail.next=new node(carry);
    }
    return dummy.next;
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

  public static void main(String[] args) {
    addtwolist a = new addtwolist();
    addtwolist b = new addtwolist();
    a.insert(3);
    a.insert(4);
    a.insert(3);
    b.insert(5);
    b.insert(6);
    b.insert(4);
    addtwolist s = new addtwolist();
    s.head = s.sum(a.head,b.head);
    a.display();
    b.display();
    s.display();
  }
  
}
