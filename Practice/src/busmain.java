
class bus{
	private long busid;
	private String busname;
	private String busroute;
	private float busfare;
	
	public bus(long busid, String busname, String busroute, float busfare)
	{
		super();
		this.busid=busid;
		this.busname=busname;
		this.busroute=busroute;
		this.busfare=busfare;
	}

	public long getBusid() {
		return busid;
	}

	public void setBusid(long busid) {
		this.busid = busid;
	}

	public String getBusname() {
		return busname;
	}

	public void setBusname(String busname) {
		this.busname = busname;
	}

	public String getBusroute() {
		return busroute;
	}

	public void setBusroute(String busroute) {
		this.busroute = busroute;
	}

	public float getBusfare() {
		return busfare;
	}

	public void setBusfare(float busfare) {
		this.busfare = busfare;
	}
	
	public void businfo()
	{
		System.out.println("\nbus id is:" + getBusid());
		System.out.println("bus name is:" + getBusname());
		System.out.println("bus route is:" + getBusroute());
		System.out.println("bus fare is:" + getBusfare());
	}
	
}

public class busmain
{
	public static void main(String[] args) {
		bus b1 = new bus(455454,"delhi","laxminagar to noida",40.56f);
		bus b2 = new bus(455455,"delhi","laxminagar to greater noida",48.52f);
		
		System.out.println("\nbus1 information:");
		b1.businfo();
		System.out.println("\nbus2 information:");
		b2.businfo();
		
		bus b3=b2;
		System.out.println("\nbus3 information:");
		b3.businfo();
		
		b3.setBusid(1);
		b3.setBusname("Noida");
		b3.setBusroute("noida to greater noida");
		b3.setBusfare(36.24f);
		
		System.out.println("\nbus2 information:");
		b2.businfo();
	}
}
