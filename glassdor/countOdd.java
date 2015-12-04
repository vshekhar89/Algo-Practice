package glassdor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class countOdd {

	public static void main(String args[]){
		
		int[] array= {1,3,4,1,6,4,5,1,3,3,3,4,4};
		countOdd(array);
		
	}
	
	
	public static void countOdd(int[] array){
		
		int length = array.length;
		
		List<Integer> in= new ArrayList<Integer>();
		for(Integer p : in){
			
		}
		HashMap<Integer,Integer> hash = new HashMap<Integer, Integer>();
		int count;
		
		for(int i=0; i<length;i++){
			if(hash.containsKey(array[i])){
				 count= hash.get(array[i]);
				 hash.put(array[i], ++count);
			}
			else{
				hash.put(array[i], 1);
			}
		}
		for(int keys: hash.keySet()){
			if(!((hash.get(keys))%2 == 0)){
				System.out.println(keys);
			}
		}
	}
}
