package facebook;

public class merge {
	
	public static void main(String args[]){
		int[] a= new int[10];
		a[0]=1;
		a[1]=3;
		a[2]=5;
		a[3]=7;
		a[4]=9;
		int[] b={0,2,4,6,8};
		
		merge(a,b,5,5);
	}
	
	public static void merge(int[] a, int[] b, int lastA, int lastB){
		int indexA= lastA-1;
		int indexB= lastB-1;
		int mergeindex= lastA + lastB -1;
		
	
		while(indexB >= 0){
			if(indexA >=0 && a[indexA] > b[indexB]){
				a[mergeindex]= a[indexA];
				indexA--;
				mergeindex--;
			}else{
				a[mergeindex] = b[indexB];
				indexB--;
				mergeindex--;
			}
		}
		for(int k =0; k<a.length;k++){
			System.out.println(a[k]);
		}
		
	}

}
