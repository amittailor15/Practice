import java.util.*;

public class exception {
	void hello()
	{
		System.out.println(getClass().getName());
	}
	
	static int division(int a,int b) throws Exception {
		if(b==0)
			throw new Exception("second number is zero");
		else
		{
			return a/b;
		}
	}
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		try {
			System.out.println("division is" + division(a,b));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
