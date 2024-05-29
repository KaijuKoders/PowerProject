
public class mult 
{
	void sub(int a,int b)
	{
		System.out.println(a - b);
	}
	public static void main(String[] args) 
	{
		int a = 5;
		int b = 6;
		
		System.out.println(a*b);
		
		mult m = new mult();
		m.sub(a, b);
		
	}
}
