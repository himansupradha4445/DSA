package Array;

public class CountNegativeNumbers {
	
	public static int countNegatives(int[][] grid) {
        int rows = grid.length;
        int columns = grid[0].length;
        
		//start position in the left bottom (but it can be right top)
        int i = rows - 1;
        int j = 0;
        
        int result = 0;
        while(i>=0 && j<columns) {
            if(grid[i][j]<0) {
				i--;                         //switch to the upper row
				result += columns - j;       //add to result count of all numbers from current ot the end of row (because of sorted row)
            } else {
                j++;                         //switch to the right column
            }
        }
        
        return result;
    }


    public static void main(String[] args) {
        int[][] grid = {
            {4, 3, 2, -1},
            {3, 2, 1, -1},
            {1, 1, -1, -2},
            {-1, -1, -2, -3}
        };
        
        int rows = grid.length;
        int columns = grid[0].length;
        System.out.println(rows+" "+columns);

        int result = countNegatives(grid);
        System.out.println("Number of negative numbers in the matrix: " + result);
    }
}
