package facebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CheckAnagram {
	
	public static ArrayList<Integer> check(String s1, String s2){
		
		
		ArrayList<Integer> res= new ArrayList<Integer>();
		
		Map<Character, Boolean> hash = new HashMap<Character, Boolean>();
		
		for(int i=0;i<s1.length();i++){
			hash.put(s1.charAt(i), true);
			}
			
		int counter=0;
			
		
		for(int i=0; i <= s2.length() - s1.length() ;i++){
			if(hash.containsKey(s2.charAt(i))){
				hash.put(s2.charAt(i), false);
				counter++;
				 for(int j=i+1; j < s1.length()+i;j++){
				if(hash.containsKey(s2.charAt(j))){
					hash.put(s2.charAt(j),false);
					counter++;
				}else{
					break;
				}
				 }
				if(counter==s1.length()){
					res.add(i);
				}
				resetmap(hash);
				counter=0;
				
				 }
			
		}
			
		return res;
	}
		
		public static void resetmap(Map<Character, Boolean> hash){
			
			for(Object key : hash.entrySet()){
				Map.Entry<Character, Boolean> entry = (Map.Entry<Character, Boolean>)key;
				entry.setValue(true);
				
			}
		}
		
		public static void main(String[] args) {
	        ArrayList<Integer> res= check("abcd", "abcdefcdbacd");
	        System.out.println(res);
	    }
	}


