package BinarySearch;

import java.util.Arrays;

public class MatrixSearch {

	public static void main(String[] args) {
		int arr[][]= {{10,20,30,40},
				{15,25,35,45},{28,29,37,49},{33,34,38,50}};
		System.out.println(Arrays.toString(search(arr,33)));

	}
	static int [] search(int mat[][],int target)
	{
		int r=0;
		int c=mat.length-1;
		while(c<mat.length && c>=0)
		{
			if(mat[r][c]==target)
			{
				return new int [] {r,c};
			}
			if(mat[r][c]<target)
				r++;
			else
				c--;
				
		}
		return new int[] {-1,-1};
	}

}
