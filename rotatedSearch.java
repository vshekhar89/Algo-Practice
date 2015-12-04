
public class rotatedSearch {

	
	public  static int search(int[] a, int left, int right, int x){
		
		int mid=(left + right)/2;
		
		if(x== a[mid]){
			return mid;
		}
		if(right<left){
			return -1;
		}
		
		//check if left side is normally
		if(a[left] < a[mid]){
			if(x >= a[left] && x <=a[mid]){
				return search(a,left, mid-1, x);
			}
			else{
				return search(a,mid+1, right,x);
			}
		}
		
		else if(a[left]> a[mid]){
			if(x>= a[mid] && x <= a[right]){
				return search(a, mid+1, right, x);
			}
			else{
				search(a, mid-1, left, x);
			}
		}
		else if(a[left]==a[mid]){
			 if(a[mid] != a[right]){
			return search(a,mid+1,right, x);
			}
		else{
			int result= search(a, left, mid-1, x);
			
			if(result==-1){
				return search(a, mid+1, right, x);
			}else{
				return result;
			}
		}
		}
		return -1;
	}
	
	
	
	public static void main(String args[]){
		
		int[] a={10,15,20,0,5}; 
		
		int result= search(a,0,4,5);
		
		if(result==-1){
			System.out.println("Element not found");
		}
		else{
			System.out.println("Element found at position: "+result);
		}
	}
}
