package _03_Intro_to_2D_Arrays;

public class _02_RowColumnSum {

    public int getSumByRow(int[][] matrix, int row) {
 int rowsum = 0;
    	for (int i = 0; i < matrix.length; i++) {
    		rowsum += matrix[row][i];
		}
    	
    
        return rowsum;
    }
    
    public int getSumByColumn(int[][] matrix, int col) {
    	int columnsum = 0;
    	for (int i = 0; i < matrix.length; i++) {
			columnsum += matrix[i][col];
		}
        
        return columnsum;
    }
}
