package facebook;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Anagrams {
	
	public static String sortChars(String src){
		char[] str= src.toCharArray();
		
		Arrays.sort(str);
		
		return new String(str);
	}
	
	public static void sortAnag(String[] src){
		
		HashMap<String,ArrayList<String>> hash = new HashMap<String, ArrayList<String>>();
		
		for(String string : src){
			String sorted = sortChars(string);
			if(!hash.containsKey(sorted)){
				hash.put(sorted, new ArrayList<String>());
			}
			ArrayList<String> arr = hash.get(sorted);
			arr.add(string);
			}
		
		int index=0;
		for(String keys : hash.keySet()){
			ArrayList<String> ana= hash.get(keys);
			for(String str: ana){
				src[index]=str;
				index++;
			}
		}
		
		
	}

}
