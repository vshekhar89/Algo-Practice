package facebook;

//Bubble sort

public class BubbleSort {
	
	
	public static void sort(int[] arr){
		
		int temp;
		for(int i=0; i < arr.length;i++){
			for(int j=0; j<arr.length-i-1;j++){
				if(arr[j+1] < arr[j]){
					temp=arr[j+1];
					arr[j+1]= arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int r=0; r<arr.length;r++){
			System.out.println(arr[r]);
		}
	}
	
	public static void main(String arg[]){
		int[] arr={7,3,5,89,34,22,1,0,65};
		sort(arr);
	}

}
