package careerCup;

import java.util.ArrayList;
import java.util.HashMap;

public class OddOccurances {

	
	public static ArrayList<Integer> oddOccur(int[] arr, int start, int end){
		
		ArrayList<Integer> res = new ArrayList<Integer>();
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		
		for(int num :arr){
			if(hm.containsKey(num)){
				hm.put(num, hm.get(num)+1);
			}else{
				hm.put(num,1);
			}
		}
		
		for(Integer key : hm.keySet()){
			if((hm.get(key))%2!=0){
				res.add((Integer)key);
			}
		}
		
		
		
		
		return res;
		
		
	}
	
	public static void main(String args[]){
		
		int[] arr={4,2,9,3,10,33,33,34,56,32};
		
		ArrayList<Integer> res= new ArrayList<>();
		res= oddOccur(arr,0, arr.length);
		
		System.out.println(res);
	}
}
