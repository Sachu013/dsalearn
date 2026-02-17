public class displaydata
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

  public static void main(String[] args) 
  {
    displaydata im = new displaydata();
    im.head = new node(10);
    node second = new node(20);
    node third = new node(30);
    
    im.head.next = second;
    second.next = third;

    im.display();
    
  }
}