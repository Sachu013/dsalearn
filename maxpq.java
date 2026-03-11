public class maxpq 
{
	private Integer[] heap;
	private int n;

	public maxpq(int n)
	{
		heap = new Integer[n+1];
		n=0;
	}  

	public boolean isEmpty()
	{
		return n==0;
	}

	public int size()
	{
		return n;
	}

	public static void main(String[] args)
	{
		maxpq m = new maxpq(5);
		
	}
}
