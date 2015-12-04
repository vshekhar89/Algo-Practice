package general;

public class rotatedSearch {

	public static boolean search(int[] arr, int left, int right, int x ){
		
		int mid= (left+ right)/2;
		
		if(arr[mid]==x){
			return true;
		}
		if(right<left){
			return false;
		}
		if(arr[left]<arr[mid] && x < arr[mid]){
			if(x>= arr[left] && x<= arr[mid]){
				return search(arr, left, mid-1, x);
			}else{
				return search(arr, mid+1, right, x);
			}
		}
		else if(arr[left] > arr[mid]){
			if(x>= arr[mid] && x<= arr[right]){
				return search(arr,mid+1,right, x);
			}else{
				return search(arr,left,mid-1, x);
			}
		}
		
		else if(arr[left]==arr[mid]){
			if(arr[mid] != arr[right]){
				return search(arr,mid+1,right,x);
			}else{
				boolean result= search(arr, left, mid-1,x);
				
				if(result==false){
					return search(arr, mid+1, right, x);
				}else{
					return result;
				}
			}
			
		}
			
			
		
		return false;
	}
	
	public static void main(String args[]){
		
		int[] a={10,15,20,0,5}; 
		
		boolean result= search(a,0,4,8);
		
		if(result==false){
			System.out.println("Element not found");
		}
		else{
			System.out.println("Element found at position: "+result);
		}
	}
	
}
