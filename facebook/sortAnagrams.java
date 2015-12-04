package facebook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class sortAnagrams {
	
	public static String sortchars(String s){
		char[] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}
	
	public static void sort(String[] src){
		
		HashMap<String, LinkedList<String>> hash = new HashMap<String, LinkedList<String>>();
		
		for(String s :src){
			String key= sortchars(s);
			if(!hash.containsKey(key)){
				hash.put(key, new LinkedList<String>());
			}
			
			LinkedList<String> anagrams= hash.get(key);
			anagrams.push(s);
		}
		int index=0;
		for(String keys : hash.keySet()){
			LinkedList<String> list= hash.get(keys);
			for(String s1: list){
			src[index]=s1;
			index++;
			}
		}
		
		for(int i=0; i<src.length;i++){
			System.out.println(src[i]);
		}
		
		
	}
	
public static void main(String args[]){
		
		String[] s={"one", "two", "nine", "eon", "wot", "nnie", "pizza", "four","azzpi", "rouf"};
		
		sort(s);
	}

}
