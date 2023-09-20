class X
{
	public X() 
	{
		System.out.println("X constructor called");
	}
}

class Y extends X
{
	public Y()
	{
		System.out.println("Y constructor called");
	}
}

class Z extends Y
{
	public Z()
	{
		super();
		System.out.println("Z constructor called");
	}
	
	public static void main(String args[])
	{
		new Z();
	}
}
