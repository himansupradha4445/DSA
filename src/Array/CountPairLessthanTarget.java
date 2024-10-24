package Array;

import java.util.Arrays;

public class CountPairLessthanTarget {
	public static int CountPairs(int a[],int target)
	{
		int i=0;
		int j=a.length-1;
		int c=0;
		while(i<j)
		{
			if(a[i]+a[j]<target)
			{
				c += (j - i);
				i++;
			}
			else
			{
				j--;
			}
		}
		return c;
	}

	public static void main(String[] args) {
		int a[]= {-1,1,2,3,1};
		Arrays.sort(a);
		System.out.println(a.toString());
		int target=2;
		System.out.println(CountPairs(a,target));
		

	}

}
