public class detectloop
{
  private node head;

  private static class node
  {
    private int data;
    private node next;

    public node(int data)
  {
    this.data =  data;
    this.next =  null;
  }

  }

  public boolean detect()
  {
    node fast=head;
    node slow=head;
    while(fast!=null && fast.next!=null)
    {
      fast=fast.next.next;
      slow=slow.next;
      if(fast==slow)
      {
        return true;
      }
      
    }
    return false;
  }

    public static void main(String[] args) 
  {
    detectloop im = new detectloop();
    im.head = new node(10);
    node second = new node(20);
    node third = new node(30);
    node fourth = new node(40);
    
    im.head.next = second;
    second.next = third;
    third.next = fourth;
    //fourth.next=second;
    if(im.detect())
    {
      System.out.println("Loop detected");
    
    }
    else{
      System.out.println("No loop");
    }

    
  }
}