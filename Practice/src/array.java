public class array {
	
	public static int sum(int arr[])
	{
		int sum=0;
		for(int num : arr)
		{
			sum = sum + num;
		}
		return sum;
	}
	
	public static int[] minmax(int arr[])
	{
		int a[]=new int[2];
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		for(int num : arr)
		{
			if(num<min)
			{
				min=num;
			}
			if(num>max)
			{
				max=num;
			}
		}
		a[0]=min;
		a[1]=max;
		return a;
	}
	public static void main(String[] args) {
		int arr[]= {11,2,3,5,6,7,8,32};
		System.out.println("using for loop");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("using for each loop");
		for(int num : arr)
		{
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println("Sum is:" + sum(arr));
		
		int result[] = minmax(arr);
		System.out.println("\nMinimum and maximum is:" + result[0] + " " + result[1]);
	}
}
