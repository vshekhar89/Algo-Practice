import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;


public class sortAnagram {
	
	public static String sortChars(String s){
		char[] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}

	public static void sortArray(String[] array){
		
		Hashtable<String, LinkedList<String>> hash = new Hashtable<String, LinkedList<String>>();
		
		for(String s :array){
			String key= sortChars(s);
			if(!hash.containsKey(key)){
				hash.put(key, new LinkedList<String>());
			}
			
			LinkedList<String> anagrams= hash.get(key);
			anagrams.push(s);
		}
		
		int index=0;
		for(String key :hash.keySet()){
			LinkedList<String> list= hash.get(key);
			for (String s1 : list){
				array[index]=s1;
				index++;
			}
		
		}
		
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}
	
	public static void main(String args[]){
		
		String[] s={"one", "two", "nine", "eon", "wot", "nnie", "pizza", "four","azzpi", "rouf"};
		
		sortArray(s);
	}
}
