package Sorting;

public class SelectionSort {
	
	public static void main(String args[]){
		
		int[] list={3,8,1,2,9,0,10,34,12};
		
		sort(list);
		
	}
	
	public static void sort(int list[]){
		
		int temp;
		int index;
		for(int i=0; i<list.length-1;i++){
			index = i;
            for (int j = i + 1; j < list.length; j++){
                if (list[j] < list[index])
                    index = j;
            }
           temp= list[index]; 
            list[index] = list[i];
            list[i] = temp;
            System.out.println("next iteration");
            for(int k =0; k<list.length-1;k++){
        		System.out.print(" "+ list[k]);		
        	}
        }

		
		for(int k =0; k<list.length-1;k++){
		System.out.println("Sorted array"+ list[k]);		
	}
	}
}
	
	

