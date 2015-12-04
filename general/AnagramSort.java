package general;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

//sort similar anagrams
public class AnagramSort {

	public static void sortAnagrams(String[] arr){
		HashMap<String, LinkedList<String>> hash = new HashMap<String, LinkedList<String>>();
		
		for(String word:arr){
			String key= sortChars(word);
			if(!hash.containsKey(key)){
				hash.put(key, new LinkedList<String>());
			}
			LinkedList<String> ana= hash.get(key);
			ana.push(word);
		}
		int index=0;
		for(String keys: hash.keySet()){
			LinkedList<String> res= hash.get(keys);
			for(String words: res){
				arr[index]=words;
				index++;
			}
		}
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
	
	public static String sortChars(String src){
		char[] src_arr= src.toCharArray();
		Arrays.sort(src_arr);
		return new String(src_arr);
	}
	
public static void main(String args[]){
		
		String[] s={"one", "two", "nine", "eon", "wot", "nnie", "pizza", "four","azzpi", "rouf"};
		
		sortAnagrams(s);
	}
}
