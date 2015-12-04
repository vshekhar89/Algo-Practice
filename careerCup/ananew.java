package careerCup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ananew {

	public static void main(String[] args) {
        ArrayList<Integer> res= findIndex("abcd", "abcdefcdbacd");
        System.out.println(res);
    }

    private static ArrayList<Integer> findIndex(String s1, String s2) {
        ArrayList<Integer> res= new ArrayList<>();
    	Map<Character, Boolean> map = new HashMap<>();
        for(int i = 0; i < s1.length(); i++)
            map.put(s1.charAt(i), true);
        
        int counter = 0;
        for(int i = 0; i <= s2.length() - s1.length() ; i++){
            if(map.containsKey(s2.charAt(i))){
                map.put(s2.charAt(i), false);
                counter++;
                for(int j = i + 1; j < s1.length() + i; j++){
                    if(map.containsKey(s2.charAt(j))){
                        map.put(s2.charAt(j), false);
                        counter++;
                    }
                    else
                        break;
                }
                if(counter == s1.length()){
                    System.out.println(i);
                res.add(i);}
                resetMap(map);
                counter = 0;
            }
        }
        
        return res;
    }

    private static void resetMap(Map<Character, Boolean> map) {
        for(Object o : map.entrySet()){
            Map.Entry me = (Map.Entry) o;
            me.setValue(true);
        }
    }
    
    
}
