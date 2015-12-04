
public class BubbleSort {
	
	public static void bubbleSort(int[] item){
		
		int temp;
		
		for(int i=0; i<item.length-1;i++){
			for(int j=0; j<item.length-i-1;j++){
				if(item[j+1] < item[j]){
					temp= item[j+1];
					item[j+1]=item[j];
					item[j]=temp;
				}
			}
		}
		
		for(int k=0;k<item.length-1;k++){
		
		System.out.println("Sorted Array: "+ item[k]);
		
		
		}
		
	}
	
	public static void main(String args[]){
		int[] item={1,3,6,2,8,4,9,11,98,34,65};
		
		bubbleSort(item);
		
	}

}
