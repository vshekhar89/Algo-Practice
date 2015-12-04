package facebook;

public class SeparateZero {
	
	public static int[] separateZero(int[] arr){
		int w=arr.length-1;
		
		//for(int r=0; r<arr.length;r++){
			//if(arr[r]!=0){
				//arr[w++]= arr[r];
			//}
		//}
		
		for(int r= arr.length-1; r>0;r--){
			if(arr[r]!=0){
				arr[w--]= arr[r];
			}
		}
		
		for(;w>arr.length;w--){
			arr[w]=0;
		}
		return arr;
	}
	
	public static void main(String args[]){
		int[] arr ={1,0,4,5,6,0,0,0,7};
		
		arr= separateZero(arr);
		
		for(int i=0; i<arr.length;i++){
			System.out.print(arr[i]+"\t");
		}
	}

}
