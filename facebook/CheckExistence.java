package facebook;

import java.util.HashMap;

public class CheckExistence {
	
	public static boolean ifExist(char[] keynums, String src){
		HashMap<Character, Integer> hash = new HashMap<Character, Integer>();
		
		for(int i=0; i<keynums.length;i++){
			if(!hash.containsKey(keynums[i])){
				hash.put(keynums[i], 1);
			}else{
				hash.put(keynums[i], hash.get(keynums[i])+1);
			}
		}
		
		for(int k=0; k<src.length();k++){
			if(!hash.containsKey(src.charAt(k)) || hash.get(src.charAt(k))==0){
				System.out.println("Not possible");
				return false;
			}
		}
		return true;
		
	}

	public static void main(String args[]){
		
		char[] keys ={'n','t','a','o','b','r','t','e','c'};
		
		String in= "note";
		
		boolean res= ifExist(keys, in);
		
		if(res==true){
			System.out.println("Match");
		}
	}
}
