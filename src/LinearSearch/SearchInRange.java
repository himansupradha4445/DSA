package LinearSearch;

public class SearchInRange {
	public static int search(int arr[])
	{
		int min=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				
				min=arr[i];
				
			}
		}
		return min;
	}

	public static void main(String[] args) {
		int arr[]= {5,2,6,7,89,-1};
		System.out.println(search(arr));
		

	}

}
