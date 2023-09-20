import java.util.*;

class publisher{
	private long publisherbookid;
	private String[] publisherbook;
	private float[] publisherbookcost;
	private int quantity;
	
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public long getPublisherbookid() {
		return publisherbookid;
	}
	public void setPublisherbookid(long publisherbookid) {
		this.publisherbookid = publisherbookid;
	}
	public String[] getPublisherbook() {
		return publisherbook;
	}
	public void setPublisherbook(String[] publisherbook) {
		this.publisherbook = publisherbook;
	}
	public float[] getPublisherbookcost() {
		return publisherbookcost;
	}
	public void setPublisherbookcost(float[] publisherbookcost) {
		this.publisherbookcost = publisherbookcost;
	}
	
	public publisher(long publisherbookid, String[] publisherbook, float[] publisherbookcost,int quantity) {
		super();
		this.publisherbookid = publisherbookid;
		this.publisherbook = publisherbook;
		this.publisherbookcost = publisherbookcost;
		this.quantity=quantity;
	}
	
}

public class publishermain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter book id:");
		int id=sc.nextInt();
		System.out.println("enter quantity:");
		int n=sc.nextInt();
		
		String bname[]=new String[n];
		
		float[] bcost=new float[n];
		
		System.out.println("enter book name in string and cost in float:");
		for(int i=0;i<n;i++)
		{
			bname[i]=sc.next();
			bcost[i]=sc.nextFloat();
		}
		
		publisher publisher=new publisher(id,bname,bcost,n);
		
		System.out.println("\nid:" +publisher.getPublisherbookid());
		System.out.println("book name:");
		for(String b1:publisher.getPublisherbook())
		{
			System.out.println(b1);
		}
		System.out.println("book cost:");
		for(float b2 :publisher.getPublisherbookcost())
		{
			System.out.println(b2);
		}
		System.out.println("quantity:" +publisher.getQuantity());
	}
		
}
