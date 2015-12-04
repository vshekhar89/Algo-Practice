package searching;

public class searchMatrix {

	
	public static void  searchMatrix(int[][] mat, int item){
		
		int row=0;
		int col= mat[0].length-1;
		
		while(row < mat.length && col >= 0){
			if(mat[row][col]== item){
				System.out.println("Element Found at row : "+ row + " and column : "+col);
				break;
			}
			else if(mat[row][col] >item){
				col--;
			}else{
				row++;
			}
		}
		
	}
	
	public static void main(String args[]){
		
		int[][] mat = new int[][]{
			{4, 5, 6}, 
			{5, 6, 10},
			{7, 9, 11}
		};
		
		
		searchMatrix(mat, 9);
	}
}
