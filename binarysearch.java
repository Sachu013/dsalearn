import java.util.Stack;

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
    if(val<=root.data)
    {
      root.left=insert(root.left,val);
    }
    else
    {
      root.right= insert(root.right,val);
    }
    return root;

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

  public static void main(String[] args) {
    binarysearch bs = new binarysearch();
    bs.root=bs.new node(25);
    bs.insert(bs.root,10);
    bs.insert(bs.root,20);
    bs.insert(bs.root,30);
    bs.insert(bs.root,40);
    bs.insert(bs.root,5);
    bs.inorder(bs.root);

  }
  
}
