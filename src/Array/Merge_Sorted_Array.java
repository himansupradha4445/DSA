package Array;

public class Merge_Sorted_Array {
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // Last element of nums1
        int j = n - 1; // Last element of nums2
        int k = m + n - 1; // Last position in nums1 (end of the combined array)
         while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }

        // Copy any remaining elements from nums2 (if nums1 is fully processed)
        while (j >= 0) {
            nums1[k] = nums2[j];
            j--;
            k--;
        }
         
    }

	public static void main(String[] args) {
		 int[] nums1 = {2, 3,4,0, 0, 0};
	        int m = 3;
	        int[] nums2 = {1,2, 5};
	        int n = 3;
	     merge(nums1, m, nums2, n);
	     for (int num : nums1) {
	            System.out.print(num + " ");
	        }
	     
	}

}
