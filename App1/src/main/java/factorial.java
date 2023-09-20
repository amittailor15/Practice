
public class factorial {
	long myfactorial(int a)
	{
		long f=1;
		for(int i=1;i<=a;i++)
		{
			f = f*i;
		}
		return f;
	}
	
	public static void main(String[] args) {
		int f=5;
		System.out.println("factorial of " + f + " is:" + new factorial().myfactorial(f));
		System.out.printf("factorial of %d is %d", f, new factorial().myfactorial(f));
	}
}
