
class MethodOverloading 
{
	public static void main(String[] args)
	{
		add(2,3);
		add(2,3,4);
		add(2,3,4,5);
	}

	public static int add(int a, int b)
	{
		return a+b;
	}
	public static int add(int a, int b, int c)
	{
		return a+b+c;
	}

	public static int add(int a, int b, int c, int d )
	{
		return a+b+c+d;
	}
}

