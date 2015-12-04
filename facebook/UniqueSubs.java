package facebook;

import java.util.ArrayList;
import java.util.HashSet;

public class UniqueSubs {
	
	
	public static void UniqueSubs(String src){
		
		HashSet<String> set = new HashSet<String>();
		ArrayList<String> res= new ArrayList<String>();
		
		for(int i=0; i < src.length();i++){
			for(int c=1; c <= src.length()-i;c++){
				if(set.contains(src.substring(i,i+c))){
					continue;
				}else{
					set.add(src.substring(i,i+c));
					res.add(src.substring(i,i+c));
				}
			}
		}
		System.out.println(res);
	}
	
	public static void main(String args[]){
		String src= "shekhar";
		UniqueSubs(src);
	}

}
