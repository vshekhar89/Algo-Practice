package glassdor;

import java.util.HashMap;

public class removeDup {
	
	public static void main(String args[]){

		int[] A= {1,2,4,5,7,9,12,5,7,8,9};
		int[] B=removeDuplicates(A);
		for(int i=0; i<B.length;i++){
			System.out.println(B[i]);
		}
	}
	
	public static int[] removeDuplicates(int[] input){
	    boolean[] duplicate = new boolean[input.length];
	    int dups = 0;
	    for (int i = 0; i < input.length; i++) {
	        if(duplicate[i])
	            continue;
	        for (int j = i + 1; j < input.length; j++) {
	            if ((input[i]==input[j])) {
	                duplicate[j] = true; // j is duplicate
	                ++dups;
	            }
	        }
	    }
	    int[] r = new int[input.length] ;
	    int index = 0;
	    for(int i = 0; i < input.length; ++i)
	        r[index++] = input[i];
	    return r;
	}

}
