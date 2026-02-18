public class findstartofloop 
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

  public void find()
  {
    node fast = head;
    node slow = head;
    while(fast!=null && fast.next!=null)
    {
      slow=slow.next;
      fast = fast.next.next;
      if(slow==fast)
      {
        node n = head;
        while(n!=slow)
        {
          slow=slow.next;
          n=n.next;
        }
        System.out.println(n.data);
      }
      
    }
  }


  public static void main(String[] args) {
    findstartofloop f = new findstartofloop();
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

    f.find();
  }
  
}
