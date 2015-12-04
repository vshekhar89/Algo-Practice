package facebook;

public class countZero {

	
	
	public static Integer countZero(int[] arr, int start, int end){
		
		int mid= (start + end)/2;
		
		if(arr.length==0 || start> end){
			return 0;
		}
		
		if(arr[mid]==0){
			return (mid-start)+1 + countZero(arr, mid+1, end);
		}else{
			return countZero(arr, start, mid-1);
		}
	}
	
	
	
	public static void main(String args[]){
		
		
		int[] arr={0,0,0,0,0,0,0,0,1,1,1,1,1};
		
		int result= countZero(arr, 0, arr.length-1);
		
		System.out.println(result);
	}
}
