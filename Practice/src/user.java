
public class user {
	int userid;
	String username;
	
	public user()
	{
		System.out.println("constructor called");
	}
	
	{
		username="anand kumar";
		userid=7874;
		System.out.println("init block1 called");
	}
	
	{
		username="navneet";
		userid=7862;
		System.out.println("init block2 called");
	}
	
	public void userinfo()
	{
		System.out.println("\t userid:" + userid);
		System.out.println("\t username:" + username);
	}
	
	public static void main(String[] args) {
		user u = new user();
		u.userinfo();
	}
}
