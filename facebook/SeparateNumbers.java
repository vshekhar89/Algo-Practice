package facebook;

public class SeparateNumbers {
	
	
	public static void main(String args[]){
		
		int[] arr= {1,1,2,3,2,3,1,2};
		
		int top=0;
		int bottom= arr.length-1;
		int cursor=0;
		
		while(cursor<=bottom){
			if(arr[cursor]==1){
				swap(arr,top,cursor);
				//int temp= arr[cursor];
				//arr[cursor]=arr[top];
				//arr[top]= temp;
				top++;
				cursor++;
			}else if(arr[cursor]==3){
				swap(arr,bottom,cursor);
				//int temp=arr[cursor];
				//arr[cursor]=arr[bottom];
				//arr[bottom]=temp;
				bottom--;
				
			}else{
				cursor++;
			}
		}
		
		for(int v:arr){
			System.out.println(v);
		}
		
	}
	 public static void swap(int[] arr, int i, int j) {
	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }

}
