package careerCup;

public class countZero {

	
	public static Integer countZeroRec(int[] arr, int start, int end){
		
		if (arr.length <= 0 || (start > end)) return 0;
		
		int mid=(start+end)/2;
		
		if(arr[mid]==0){
			return (mid- start)+1 + countZeroRec(arr, mid+1, end);
		}else{
			return countZeroRec(arr, start, mid-1);
		}
		
		
	}
	
	
	public static void main(String args[]){
		
		int[] arr={0,0,0,0,0,0,0,1,1,1,1};
		
		int res=countZeroRec(arr, 0, arr.length-1);
		System.out.println(res);
	}
}
