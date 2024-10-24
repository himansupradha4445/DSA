package LinearSearch;

public class Lsearch {

	public static int linearSearch1(int arr[],int target)
	{
		//search the item // if found return index
		// if not return -1
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==target)
			{
				return i;
			}
		}
		return -1;
		
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5,6,7};
		int target=7;
		//System.out.println(linearSearch(arr,target));
		System.out.println(linearSearch1(arr,target));

	}
	static int linearSearch(int arr[],int target)
	{
		if(arr.length==0)
		{
			return -1;
		}
		
		for(int element:arr)
		{
			if(element==target)
				return element;
		}
		
	return Integer.MAX_VALUE;
	}

}
