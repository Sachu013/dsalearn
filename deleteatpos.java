import java.lang.classfile.TypeAnnotation.SupertypeTarget;

public class deleteatpos 
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

  public void insertatend(int data)
  {
    node n = new node(data);
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
    cur.next=n;


  }

  public void deletepos(int pos)
  {
    if(pos==1)
    {
      System.out.println(head.data);
      head=head.next;
    }
    else
    {
      int count=1;
      node prev=head;
      while(count<pos-1 && prev!=null)
      {
        prev=prev.next;
        count++;
      }
      if(prev==null)
      {
        System.out.println("out of bounds");
      }
      else
      {
        node n = prev.next;
        prev.next=n.next;
        System.out.println(n.data);
      }
      
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
    deleteatpos df = new deleteatpos();
    df.insertatend(10);
    df.insertatend(20);
    df.insertatend(30);
    df.insertatend(40);
    df.display();
    df.deletepos(1);
    df.display();
    
  }
  
}
