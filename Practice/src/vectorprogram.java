import java.util.Vector;

public class vectorprogram {
	public static void main(String[] args) {
		Vector<Integer> vector1=new Vector<>();
		System.out.println("initial size:" +vector1.size());
		System.out.println("initial capacity:" +vector1.capacity());
		
		for(int i=100; i<110;i++)
		{
			vector1.add(i+20);
		}
		vector1.add(200+20);
		
		System.out.println("vector size:" +vector1.size());
		System.out.println("vector capacity:" +vector1.capacity());
	}
}
