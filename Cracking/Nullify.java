package Cracking;

public class Nullify {
	
	public static void nullify(int[][] matrix){
		
		boolean[] row = new boolean[matrix.length];
		boolean[] column = new boolean[matrix[0].length];
		
		for(int i=0; i<matrix.length;i++){
			for(int j=0; j<matrix[0].length;j++){
				if(matrix[i][j]==0){
					row[i]=true;
					column[j]=true;
				}
			}
		}
		
		for(int i=0; i<matrix.length;i++){
			if(row[i]){
				makeRowZero(matrix, i);
			}
		}
		
		for(int j=0;j<matrix[0].length;j++){
			if(column[j]){
				makeColumnZero(matrix,j);
			}
		}
	}
	
	public static void makeRowZero(int[][] matrix, int i){
		for(int j=0; j<matrix[0].length;j++){
			matrix[i][j]=0;
		}
	}
	
	public static void makeColumnZero(int[][] matrix, int j){
		for(int i=0; i<matrix.length;i++){
			matrix[i][j]=0;
		}
	}

}
