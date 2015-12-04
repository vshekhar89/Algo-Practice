package Cracking;

public class Rotate {
	
	public static void rotate(int[][] matrix, int n){
		for(int layer=0; layer<n/2; ++layer){
			int first= layer;
			int last= n-1-first;
			
			for(int i=first; i<last;i++){
				int offset= i-first;
				
				int top = matrix[first][i];
				
				matrix[first][i]= matrix[first][last-offset];
				
				matrix[first][last-offset]= matrix[last][last-offset];
				
				matrix[last][last-offset]= matrix[i][last];
				
				matrix[i][last]=top;
			}
		}
	}

}
