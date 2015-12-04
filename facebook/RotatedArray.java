package facebook;

public class RotatedArray {
	
	
	public static Integer search(int[] arr, int left, int right, int n){
		int result=1;
		
		if(arr.length==0){
			return -1;
		}
		
		int mid= (left+right)/2;
	
		
		if(arr[mid]==n){
			return mid;
		}
		
		if(arr[mid]>arr[left]){
			if(arr[mid] >= n && arr[left] <= n ){
				search(arr,left, mid-1, n);
			}
			else{
				search(arr,mid+1,right,n);
			}
		}
		
		if(arr[left]> arr[mid]){
			if(arr[mid] <= n && arr[right] >= n){
				search(arr, mid+1, right, n);
			}else{
				search(arr, left, mid-1, n);
			}
		}
		
		return result;
	}

}
