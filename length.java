public class length
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

public void len()
{
  node cur = head;
  int count=0;
  while(cur!=null)
  {
    count++;
    cur=cur.next;
  }
  System.out.println(count);
}

    public static void main(String[] args) 
  {
    length im = new length();
    im.head = new node(10);
    node second = new node(20);
    node third = new node(30);
    
    im.head.next = second;
    second.next = third;

    im.len();

    
  }
}