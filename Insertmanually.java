public class Insertmanually
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

  public static void main(String[] args) 
  {
    Insertmanually im = new Insertmanually();
    im.head = new node(10);
    node second = new node(20);
    node third = new node(30);
    
    im.head.next = second;
    second.next = third;

    
    
  }
}