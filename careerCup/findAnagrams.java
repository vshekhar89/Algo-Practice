package careerCup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class findAnagrams {
	
	
	public static ArrayList<Integer> findAnagram(String s1, String s2){
		ArrayList<Integer> resultList= new ArrayList<Integer>();
		
		Map<Character, Boolean> map = new HashMap<>();
		int counter=0;
		
		for(int i=0; i<s1.length();i++){
			
			
				map.put(s1.charAt(i),true);
			
		}
		for(int i=0; i<=s2.length()-s1.length();i++){
			if(map.containsKey(s2.charAt(i))){
				map.put(s2.charAt(i), false);
				counter++;
				for(int j=i+1; j<s1.length()+i;j++){
					if(map.containsKey(s2.charAt(j))){
						map.put(s2.charAt(j), false);
						counter++;
					}
					else{
						break;
					}
				}
				if(counter==s1.length()){
					resultList.add(i);}
					//System.out.println(resultList);
					resetMap(map);
					counter=0;
				
				
				
				
			}
		}
		
		return resultList;
	}
	
	public static void resetMap(Map<Character, Boolean> map){
		for(Object c: map.entrySet()){
		
			Map.Entry me= (Map.Entry)c;
			me.setValue(true);
		}
		
		
	}
	
	public static void main(String args[]){
		
		String s1="abcd";
		String s2="abcdefcdbacd";
		
		ArrayList<Integer> res = findAnagram(s1, s2);
		
		System.out.println(res);
	}

}
