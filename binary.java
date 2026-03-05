import java.util.*;

public class binary 
{

  private node root;

  private class node
  {
    private int data;
    private node right;
    private node left;

    public node(int data)
    {
      this.data=data;
    }

  }

  
  public void create()
  {
    node n1 = new node(10);
    node n2 = new node(20);
    node n3 = new node(30);
    node n4 = new node(40);
    node n5 = new node(50);

    root = n1;
    n1.left= n2;
    n1.right=n3;
    n2.left = n4;
    n2.right = n5;
  }

  public void preorder(node root)
  {
    if(root == null)
    {
      return;
    }
    System.out.println(root.data);
    preorder(root.left);
    preorder(root.right);
  }
  public void inorder(node root)
  {
    if(root == null)
    {
      return;
    }
    
    inorder(root.left);
    System.out.println(root.data);
    inorder(root.right);
  }
  public void postorder(node root)
  {
    if(root == null)
    {
      return;
    }
    postorder(root.left);
    postorder(root.right);
    System.out.println(root.data);

  }


  public void prestack(node root)
  {
    if(root == null)
    {
      return;
    }
    Stack<node>st = new Stack<>();
    st.push(root);
    while(!st.isEmpty())
    {
      node temp = st.pop();
      System.out.print(temp.data+" ");
      if(temp.right!=null)
      {
        st.push(temp.right);
      }
      if(temp.left!=null)
      {
        st.push(temp.left);
      }
    }
  }

  public void instack(node root)
  {
    if(root==null)
    {
      return;
    }
    Stack<node> st = new Stack<>();
    node temp= root;
    while(!st.isEmpty() || temp!=null)
    {
      if(temp!=null)
      {
        st.push(temp);
        temp=temp.left;
      }
      else
      {
        temp=st.pop();
        System.out.println(temp.data);
        temp=temp.right;


      }
    }
  }
 
  public void poststack(node root)
  {
    if(root == null)
    {
      return;
    }
    Stack<node> st = new Stack<>();
    node cur = root;
    while(!st.isEmpty() || cur!=null)
    {
      if(cur!=null)
      {
        st.push(cur);
        cur=cur.left;
      }
      else
      {
        node temp = st.peek().right;
        if(temp==null)
        {
          temp = st.pop();
          System.out.print(temp.data+" ");
          while(!st.isEmpty() && temp == st.peek().right)
          {
            temp = st.pop();
            System.out.print(temp.data+" ");
          }
        }
        else
        {
          cur = temp;
        }
      }
    }
  }

  public void levelorder(node root)
  {
    if(root == null)
    {
      return;
    }
    Queue<node> q = new LinkedList<>();
    q.offer(root);
    while(!q.isEmpty())
    {
      node temp = q.poll();
      System.out.print(temp.data+" ");
      if(temp.left!=null)
      {
        q.offer(temp.left);
      }
      if(temp.right!=null)
      {
        q.offer(temp.right);
      }


    }
  }

 

  public static void main(String[] args) {
    binary b = new binary();
    b.create();
    b.preorder(b.root);

  }
  
}
