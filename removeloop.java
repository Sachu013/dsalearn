public class removeloop 
{

  private node head;

  private static class node{
    private int data;
    private node next;

    public node(int data)
    {
      this.data = data;
      this.next  = null;
    }
  }

  public void del()
  {
    node fast = head;
    node slow= head;
    while(fast!=null && fast.next!=null)
    {
      fast=fast.next.next;
      slow=slow.next;
      if(slow==fast)
      {
        node temp=head;
        while(temp.next!=slow.next)
        {
          temp=temp.next;
          slow=slow.next;
        }
        slow.next=null;
        break;
      }
      
    }
    
  }

  public void display()
  {
    node cur = head;
    while(cur!=null)
    {
      System.out.print(cur.data +" -> ");
      cur=cur.next;
    }
    System.out.println("null");
  }

  public static void main(String[] args) {
    removeloop f = new removeloop();
    f.head = new node(10);
    node second = new node(20);
    node third = new node(30);
    node fourth = new node(40);
    node fifth = new node(50);
    
    f.head.next = second;
    second.next = third;
    third.next = fourth;
    fourth.next=fifth;
    fifth.next=third;

    f.del();
    f.display();
  }
  
}
