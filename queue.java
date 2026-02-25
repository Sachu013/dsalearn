import java.util.*;

public class queue 
{

  private node front;
  private node rear;
  private int length;

  private class node
  {
    private int data;
    private node next;

    public node(int data)
    {
      this.data = data;
      this.next = null;
    }

  }

  public queue()
  {
    this.front = null;
    this.rear = null;
    this.length = 0;
  }

  public boolean isEmpty()
  {
    return length==0;
  }

  public void enqueue(int data)
  {
    node n = new node(data);
    if(front==null)
    {
      front = rear = n;
      length++;
      return;
    }
    rear.next = n;
    rear = n;   
    length++;
  }

  public int dequeue()
  {
    if(isEmpty())
    {
      System.out.println("queue empty");
      return 0;
    }
    else
    {
      int d = front.data;
      front = front.next;
      if(front == null)
      {
        rear=null;
      }
      length--;
      return d;
    }
  }

  public void display()
  {
    node n = front;
    if(n==null)
    {
      System.out.println("null");
      return;
    }
    while(n!=rear)
    {
      System.out.print(n.data+" -> ");
      n=n.next;
    }
    System.out.println(n.data);
  }
  
  public static void main(String[] args) {
    queue q = new queue();
    q.display();
    q.enqueue(10);
    
    q.enqueue(20);
    q.enqueue(30);
    q.enqueue(40);
    q.enqueue(50);
    q.display();
    q.dequeue();
    q.display();
  }

}
