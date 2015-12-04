package redo;

public class bubbleSort {

	
	public static void main(String args[]){
		
		int[] item={1,5,8,2,9,11,10,32,22};
		
		bubbleSort(item);
	}
	
	public static void bubbleSort(int[] list){
		
		int temp;
		for(int i=0; i<list.length-1;i++){
			for(int j=0; j<list.length-i-1;j++){
				if(list[j+1]<list[j]){
					temp=list[j+1];
					list[j+1]= list[j];
					list[j]=temp;
				}
			}
		}
		for(int k=0; k<list.length;k++){
			System.out.println(list[k]);
		}
		
	}
}
