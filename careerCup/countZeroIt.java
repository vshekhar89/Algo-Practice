package careerCup;

public class countZeroIt {
	
	public static Integer countZeroIte(int[] arr, int start, int end){
		
		if(arr.length==0){
			return -1;
		}
		int count=0;
		int mid=0;
		while(start < end){
			mid=(start+ end)/2;
			
			if(arr[mid]==0){
				count= count + (mid-start)+1;
				start= mid+1;
			}
			else{
				end=mid-1;
			}
			
		}
		return count;
		
	}
	
public static void main(String args[]){
		
		int[] arr={0,0,0,0,0,0,0,1,1,1,1};
		
		int res=countZeroIte(arr, 0, arr.length-1);
		System.out.println(res);
	}
	
	
}
