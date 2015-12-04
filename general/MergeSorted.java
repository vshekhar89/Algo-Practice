package general;


//merge two sorted strings
public class MergeSorted {
	
	public static void main(String args[]){
		int[] a = new int[10];
		int[] b = {0,2,4,6,8};
		a[0]=1;
		a[1]=3;
		a[2]=5;
		a[3]=7;
		a[4]=9;
		
		merge(a,b,5,5);
	}
	
	public static void merge(int[] a, int[] b,int aLast, int bLast){
		
		int aIndex=aLast-1;
		int bIndex=bLast-1;
		int mergeIndex= aLast+bLast -1;
		
		while(bIndex>=0){
			if(aIndex>=0 && a[aIndex]> b[bIndex]){
				a[mergeIndex]= a[aIndex];
				aIndex--;
				mergeIndex--;
			}else{
				a[mergeIndex]= b[bIndex];
				bIndex--;
				mergeIndex--;
			}
		}
		
		for(int i=0; i<a.length;i++){
			System.out.println(a[i]);
		}
	}

}
