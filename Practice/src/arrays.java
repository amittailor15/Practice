import java.util.*;
public class arrays {
	public static void main(String[] args) {
		int arr1[]= {11,2,3,1,44,5,6,8};
		int arr2[]= {11,2,3,1,44,5,6,8};
		System.out.println(Arrays.toString(arr1));
		
		System.out.println(Arrays.equals(arr1,arr2));
		
		Arrays.sort(arr1);
		
		int pos=Arrays.binarySearch(arr1, 5);
		System.out.println("index is:" + pos);
		
	}
}
