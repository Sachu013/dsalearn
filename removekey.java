public class removekey 
{
  private node head;
  
  private static class node
  {
    private int data;
    private node next;

    public node(int data)
    {
      this.data= data;
      this.next= null;
    }

  }

  public void insert(int d)
  {
    node n= new node(d);
    if(head==null)
    {
      head=n;
      return;
    }
    node cur= head;
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
      System.out.print(cur.data+ " -> ");
      cur=cur.next;
    }
    System.out.println("null");
  }

  public void delete(int val)
  {
    if(head==null)
    {
      System.out.println("emoty list when trying to delete "+val);
      return;
    }
    if(head.data==val)
    {
      head=head.next;
      return;
    }
    node cur = head;
    node prev=null;
    while(cur!=null)
    {
      if(cur.data==val)
      {
        prev.next=cur.next;
        return;
      }
      prev=cur;
      cur=cur.next;
    }
    System.out.println("no element found of "+val);

  }

  
  public static void main(String[] args)
  {
    removekey rm = new removekey();
    rm.delete(30);
    rm.insert(10);
    rm.display();
    rm.delete(10);
    rm.display();
    rm.insert(20);
    rm.display();
    rm.delete(30);
    rm.insert(30);
    rm.display();
    rm.delete(10);
    rm.insert(25);
    rm.display();
    rm.delete(30);
    rm.display();
  }
  

}
