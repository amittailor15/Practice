
public class constructor {
	long id;
	String name;
	int age;
	
	public constructor()
	{
		System.out.println("default constructor");
		id=988998;
		name="navneet";
		age=18;
	}
	public void personInfo() {
		System.out.println("person information");
		System.out.println("\tid : " + id);
		System.out.println("\tname : " + name);
		System.out.println("\tage : " + age);
	}
	public constructor(int id,String name,int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
	}
	
	public static void main(String[] args) {
		constructor c[]=new constructor[3];
		
		c[0]=new constructor();
		c[1]=new constructor(7924,"lalan kumar",23);
		c[2]=new constructor(5786,"amit",18);
		
		for(constructor c1 : c)
		{
			c1.personInfo();
		}
	}
}
