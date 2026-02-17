public class searchelemnt 
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

  public void search(int val)
  {
    node cur = head;
    while(cur!=null)
    {
      if(cur.data==val)
      {
        System.out.println("Found");
        return;
      }
      cur=cur.next;
    }
    System.out.println("Not found");
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
    searchelemnt df = new searchelemnt();
    df.insertatend(10);
    df.insertatend(20);
    df.insertatend(30);
    df.insertatend(40);
    df.display();
    df.search(1);
    df.search(10);
    df.search(40);
    df.display();
    
  }
  
}
