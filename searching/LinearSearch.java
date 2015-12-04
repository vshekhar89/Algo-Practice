package searching;

import java.io.SequenceInputStream;

public class LinearSearch {

	public static int seqSearch(int list[], int item){
		
		for(int i=0; i<list.length-1;i++){
			
			if(list[i]==item){
				//System.out.println("Found");
				return i;
			}
		}
		
		System.out.println("Item not found");
		return -1;
	}
	
	public static void main(String args[]){
		
		int item[]={1,2,3,5,10,99,67,65};
		int res=seqSearch(item ,5);
		
		if(res>-1){
			System.out.println("Item found at Position: "+ res);
			
		}
		
	}
	

}
