
public class FootBallSports extends Sports
{
	private String location;
	private int teammembercount;
	void info()
	{
		sportsinfo();
		System.out.println("\tlocation:" + location);
		System.out.println("\tteam member count:" + teammembercount);
	}
	@Override
	void welcome()
	{
		super.welcome();
		System.out.println("greeting from footballsports");
	}
	
	public static void main(String[] args) 
	{
		FootBallSports sports = new FootBallSports();
		sports.setId(767678);
		sports.setName("football");
		sports.location = "new delhi";
		sports.teammembercount = 11;
		
		sports.info();
	}
}