package redo;

import java.lang.reflect.Array;
import java.lang.Iterable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

public class sortAnagrams {

	
	public static void sortAnagram(String[] array){
		
		String temp;
		HashMap<String,LinkedList<String>> hash = new HashMap<String, LinkedList<String>>();
		
		
		
			for(String word: array){
				String sort= sortChar(word);
				if(!hash.containsKey(sort)){
					hash.put(sort,new LinkedList<String>() );
				}
				LinkedList<String> anagrams = hash.get(sort);
				anagrams.push(word);
			}
			
			int index=0;
			for(String key : hash.keySet()){
				LinkedList<String> words= hash.get(key);
				for(String s1: words){
				array[index]= s1;
				index++;
				}
			}
			
			for(int i=0;i<array.length;i++){
				System.out.println(array[i]);
			}
		}
		
		public static String sortChar(String s){
			
			char[] temp= s.toCharArray();
			Arrays.sort(temp);
			return new String(temp);
		}
		
		
		
		public static void main(String args[]){
			
			String[] array={"one", "two", "nine", "eon", "wot", "nnie", "pizza", "four","azzpi", "rouf"};
			sortAnagram(array);
		
		}
	}

