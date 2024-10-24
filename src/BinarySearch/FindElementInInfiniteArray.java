package BinarySearch;

public class FindElementInInfiniteArray {
	public static int FindPos(int nums[],int target)
	{
		int s=0;
		int e=1;
		while(target>nums[e])
		{
			int temp=e+1;
			e=e+(e-s+1)*2;
			s=temp;
			
		}
		return BinarySearch(nums,target,s,e);
		
	}
	
	public static int BinarySearch(int arr[],int target,int s,int e)
	{
		while(s<=e)
		{
			int mid=s+(e-s)/2;
			if(target>arr[mid])
			{
				s=mid+1;
			}
			else if(target<arr[mid])
			{
				e=mid-1;
			}
			else
			{
				return mid;
			}
		}
		return -1;
		
	}

	public static void main(String[] args) {
		int nums[] ={3, 5, 7, 9, 10, 90, 
                100, 130, 140, 160, 170};
		int target=10;
		System.out.println(FindPos(nums,target));
		

	}

}
