package LinearSearch;

public class FindMin {

	public static int min(int arr[])
	{
		// Assume array length=0
		if(arr.length==0)
			return -1;
		// Assume array length!=0
		//return the minimum value
		int min=arr[0];
		for(int i=1;i<arr.length-1;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		int[] arr= {18,12,-7,3,14,28};
		System.out.println(min(arr));

	}

	

}
