

public class maxbh
{
  private Integer[] heap;
  private int n;

  public maxbh(int n)
  {
    heap = new Integer[n+1];
    n=0;
  }

  public void swim(int p)
  {
    while(p>0 && heap[p/2] < heap[p])
    {
      int temp = heap[p];
      heap[p]=heap[p/2];
      heap[p/2]=temp;
      p=p/2;
    }
  }

  public void resize(int n)
  {
    Integer[] temp = new Integer[n];
    for(int i =0;i<heap.length;i++)
    {
      temp[i]=heap[i];
    }
    heap=temp;
  }

  public void insert(int a)
  {
    if(n==heap.length-1)
    {
      resize(2*heap.length);
    }
    n++;
    heap[n]=a;
    swim(n);
   
  }

  public void swap(int i,int j)
  {
    int temp = heap[i];
    heap[i]=heap[j];
    heap[j]=temp;
  }

  public void sink(int k)
  {
    while(2*k<=n)
    {
      int p=2*k;
      if(p<n && heap[p+1]>heap[p])
      {
        p++;
      }
      if(heap[k]>heap[p])
      {
        break;
      }
      swap(k, p);
      k=p;
    }
  }

  public int deletemax()
  {
    int max = heap[1];
    swap(1,n);
    n--;
    sink(1);
    return max;
  }

  
  
  
}
