package LinearSearch;

//https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class CountEvenDigits {

	public static void main(String[] args) {
		int arr[]= {11,12,123};
		System.out.println(countEven(arr));

	}
	public static int countEven(int arr[])
	{
		int count=0;
		for(int num:arr)
		{
			
			if(even(num))
			{
				count++;
			}
			
		}
		return count;
	}
	private static boolean even(int num) {
		if(digit2(num)%2==0)
		return true;
		return false;
	}
	private static int digit(int num) {
		int count=0;
		while(num>0)
		{
			
			count++;
			num=num/10;
			
		}
		return count;
	}
	private static int digit2(int num)
	{
		return (int)(Math.log10(num))+1; //Number system
	}
	

}
