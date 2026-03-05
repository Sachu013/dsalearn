import java.util.*;

public class binarysearch 
{
  private node root;

  private class node
  {
    private int data;
    private node left;
    private node right;

    public node(int data)
    {
      this.data=data;
    }
  }

  public node insert(node root, int val)
  {
    if(root == null)
    {
      root = new node(val);
      return root;
    }
    if(val<root.data)
    {
      root.left=insert(root.left,val);
    }
    else
    {
      root.right= insert(root.right,val);
    }
    return root;

  }

  public node search(node root,int val)
  {
    if(root==null || root.data==val)
    {
      return root;
    }
    if(val<root.data)
    {
      return search(root.left,val);
    }
    else
    {
      return search(root.right,val);
    }
  }

  public void inorder(node root)
  {
    if(root == null)
    {
      return;
    }
    Stack<node> st = new Stack<>();
    node temp = root;
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
        System.out.print(temp.data+" ");
        temp=temp.right;
      }
    }
  }

  public boolean valid(node root, int min, int max)
  {
    if(root==null)
    {
      return true;
    }
    if(root.data<=min || root.data>=max)
    {
      return false;
    }
    return valid(root.left,min,root.data) && valid(root.right,root.data,max);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    binarysearch bs = new binarysearch();
    bs.root=bs.new node(25);
    bs.insert(bs.root,10);
    bs.insert(bs.root,20);
    bs.insert(bs.root,30);
    bs.insert(bs.root,40);
    bs.insert(bs.root,5);
    bs.inorder(bs.root);
    if(bs.search(bs.root, sc.nextInt())!=null)
    {
      System.out.println("found");
    }
    else{
      System.out.println("not found");
    }
    sc.close();

  }
  
}
