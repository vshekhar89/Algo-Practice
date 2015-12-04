
public class merge {

	
	public static void main(String args[]){
		int[] a=new int[10];
		a[0]=1;
		a[1]=3;
		a[2]=5;
		a[3]=7;
		a[4]=9;
		int[] b={0,2,4,6,8};
		
		merge(a,b, 5,5);
	}
	
	public static void merge(int[] A, int[] B, int lastA, int lastB){
		int indexA= lastA-1;
		int indexB= lastB-1;
		int mergeIndex= lastA+lastB -1;
		
		while(indexB>=0){
		
			if( indexA>=0 && A[indexA] > B[indexB]){
				A[mergeIndex]=A[indexA];
				indexA--;
				mergeIndex--;
			}
			else{
				A[mergeIndex]=B[indexB];
				indexB--;
				mergeIndex--;
			}
		}
		
		for (int k=0; k <A.length-1; k++){
			System.out.println(A[k]);
		}
	}
}
