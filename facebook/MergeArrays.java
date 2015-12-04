package facebook;

public class MergeArrays {
	
	
	public static int[] merge(int[] a, int b[], int lengthA, int lengthB ){
		
		int aLastIndex= lengthA-1;
		int bLastIndex= lengthB-1;
		
		
		int mergeIndex= aLastIndex+ bLastIndex+1;
		
		while(bLastIndex>=0){
			if(aLastIndex >= 0 && a[aLastIndex]> b[bLastIndex]){
				a[mergeIndex]= a[aLastIndex];
				aLastIndex--;
				mergeIndex--;
			}else{
				a[mergeIndex]= b[bLastIndex];
				mergeIndex--;
				bLastIndex--;
			}
		}
		
		return a;
	}
	
	public static void main(String args[]){
		int[] a=new int[10];
		a[0]=1;
		a[1]=3;
		a[2]=5;
		a[3]=7;
		a[4]=9;
		int[] b={0,2,4,6,8};
		
		int[] c=merge(a,b, 5,5);
		
		for(int i=0; i<c.length;i++){
			System.out.println(c[i]);
		}
	}

}
