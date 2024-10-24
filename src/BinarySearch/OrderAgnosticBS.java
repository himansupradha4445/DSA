package BinarySearch;

public class OrderAgnosticBS {

	public static void main(String[] args) {
		int arr[]= {98,87,76,65,54,43,21,1};
		int target=98;
		int ans=binarySearch(arr,target);
		System.out.println(ans);

	}

	 static int binarySearch(int[] arr, int target) {
		int start=0;
		int end=arr.length-1;
		boolean isAsc=arr[start]<arr[end];
		while(start<=end)
		{
			
			int mid=start+(end-start)/2;
			if(arr[mid]==target)
			{
				return mid;
			}
			else
			{
				if(isAsc)
				{
					if(target<arr[mid])
					{
						end=mid-1;
					}
					else
					{
						start=mid+1;
					}
				} else
				{
					if((target>arr[mid]))
					{
						end=mid-1;
					}
					else
					{
						start=mid+1;
					}
				}
			}
		}
		return -1;
		
	}

}
