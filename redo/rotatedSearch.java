package redo;

public class rotatedSearch {
	
	public static int search(int[] a,int right, int left, int x){
		
		int mid= (left+ right)/2;
		
		if(x==a[mid]){
			//System.out.println("Muner found at mid");
			return mid;
		}
		
		if(a[left]< a[mid]){
			if(x >= a[left] && x<= a[mid]){
				return search(a, left, mid-1, x);
			}
			else{
				return search(a, mid+1, right, x);
			}
			
			
		}
		else if(a[left]> a[mid]){
			if(x <= a[right] && x>= a[mid]){
				return search(a,mid+1, right,x);
			}else{
				return search(a, left, mid-1,x);
			}
		}
		else if(a[left]==a[mid]){
			if(a[right]!= a[mid]){
				return search(a, mid+1, right, x);
			}
			else{
				int result= search(a, left, mid-1,x);
			
				if(result==-1){
					return search(a, mid+1, right, x);
				}
				else{
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
