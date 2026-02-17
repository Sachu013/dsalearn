public class insertatpos 
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

  public void insertpos(int d,int pos)
  {
    node n= new node(d);
    if(pos==1)
    {
      n.next=head;
      head=n;
    }
    else
    {
      node prev= head;
      int count=1;
      while(count<pos-1 && prev!=null)
      {
        prev=prev.next;
        count++;
      }
      if(prev == null)
    {
        System.out.println("Position out of bounds");
        return;
    }
      node cur= prev.next;
      prev.next=n;
      n.next=cur;

    }
    
    
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
    insertatpos i = new insertatpos();
    i.insertpos(10,1);
    i.insertpos(20,2);
    i.insertpos(40,5);
    i.insertpos(25,1);
    i.display();

    
  }
  
}
