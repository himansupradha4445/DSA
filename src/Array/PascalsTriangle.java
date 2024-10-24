package Array;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
	 public static List<List<Integer>> generate(int numRows) {
	        List<List<Integer>> triangle = new ArrayList<>();
	        
	        // Base case; first row is always [1]
	        if (numRows == 0) {
	            return triangle;
	        }

	        // First row
	        List<Integer> firstRow = new ArrayList<>();
	        firstRow.add(1);
	        triangle.add(firstRow);

	        // For each row after the first
	        for (int i = 1; i < numRows; i++) {
	            List<Integer> prevRow = triangle.get(i - 1);
	            List<Integer> currentRow = new ArrayList<>();
	            System.out.println(prevRow);
	            // First element is always 1
	            currentRow.add(1);

	            // Calculate the values in the middle of the row
	            for (int j = 1; j < i; j++) {
	                currentRow.add(prevRow.get(j - 1) + prevRow.get(j));
	            }

	            // Last element is always 1
	            currentRow.add(1);

	            // Add the row to the triangle
	            triangle.add(currentRow);
	        }

	        return triangle;
	    }

	    public static void main(String[] args) {
	        int numRows = 4;  // Example input
	        List<List<Integer>> result = generate(numRows);
	        for (List<Integer> row : result) {
	            System.out.println(row);
	        }
	    }
}
