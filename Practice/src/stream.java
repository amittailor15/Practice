import java.util.stream.*;
import java.util.*;
public class stream {
	public static void main(String[] args) {
		int arr[]= {11,2,3,4,1,55,7,8,5,9,10};
		Stream.of(arr).forEach(a->System.out.print(a + ","));
		
		List<Integer> l = new ArrayList<>();
		l.add(1001);
		l.add(108);
		l.add(10);
		l.add(900);
		System.out.println();
		l.stream().forEach(a->System.out.print(a+","));
		System.out.println("\neven number");
		l.stream().filter(a->a%2==0).forEach(a->System.out.print(a+","));
		
		Integer ar[]= {1,2,3,4,5,8,2,4,9,15};
		System.out.println("\nusing map");
		
		Stream.of(ar).forEach(a->System.out.print(a+","));
		System.out.println();
		Stream.of(ar).map(a->a*a).forEach(a->System.out.print(a+","));
		System.out.println("\nusing map and filter");
		Stream.of(ar).map(a->a*a).filter(a-> a>10).forEach(a->System.out.print(a+ ","));
		
		System.out.println();
		List<Integer> asList = Arrays.asList(ar);
		
		asList.forEach(System.out::println);
		
		System.out.println(asList.stream().sorted().distinct().count());
		asList.stream().sorted().distinct().limit(5).forEach(System.out::println);
		asList.stream().sorted().distinct().skip(8).forEach(System.out::println);
		List<Integer> collect = asList.stream().sorted().distinct().collect(Collectors.toList());
		Set<Integer> collect2 = asList.stream().sorted().collect(Collectors.toSet());
		
		System.out.println(collect);
		System.out.println(collect2);
	}
}
