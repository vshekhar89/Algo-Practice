package facebook;

import java.util.HashSet;

public class Addtozero {
	
	public static boolean checkzero(int[] src){
		
		HashSet<Integer> set = new HashSet<>();
		for(int i=0; i< src.length;i++){
			set.add(src[i]);
		}
		
	for(int i:src){
		for(int j :src){
			if(set.contains(-i -j)){
				return true;
			}
		}
	}
	return false;
		
		
	}
	
	public static void main(String args[]){
		int[] arr= {2,-1,3,2,0,-2,-1};
		
		boolean res= checkzero(arr);
		
		System.out.println(res);
	}

}
