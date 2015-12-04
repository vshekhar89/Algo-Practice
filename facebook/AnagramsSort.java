package facebook;

import java.util.HashMap;
import java.util.Map;

public class AnagramsSort {
	
	public static void getIndex(String s1, String s2){
		
		Map<Character, Boolean> hash = new HashMap<Character, Boolean>();
		
		for(int i=0; i<s1.length();i++){
			hash.put(s1.charAt(i), true);
		}
		int counter=0;
		
		for(int k=0; s2.length() > s1.length()-k;k++){
			if(hash.containsKey(s2.charAt(k))){
				hash.put(s2.charAt(k), false);
				counter++;
				for(int j=k+1; j<s1.length()+k;j++){
					if(hash.containsKey(s2.charAt(j))){
						hash.put(s2.charAt(j), false);
						counter++;
					}else
						break;
				}
				if(counter==s1.length()){
					System.out.println(k);
					counter=0;
					resetMap(hash);
				}
			}
		}
		
	}
	  private static void resetMap(Map<Character, Boolean> map) {
	        for(Object o : map.entrySet()){
	            Map.Entry me = (Map.Entry) o;
	            me.setValue(true);
	        }
	    }

}
