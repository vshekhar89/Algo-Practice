package general;

import java.util.ArrayList;

public class Anagrams {
	
	public static ArrayList<String> getPerms(String str){
		ArrayList<String> permutations= new ArrayList<String>();
		if(str==null){
			return null;
		}
		if(str.length()==0){
			permutations.add("");
			return permutations;
		}
		char first= str.charAt(0);
		String remainder= str.substring(1);
		ArrayList<String> words= getPerms(remainder);
		for(String word: words){
			for(int j=0; j<=word.length();j++){
				String answer= insertChar(word,first,j);
				permutations.add(answer);
			}
			
		}
		
		return permutations;
	}
	
	public static String insertChar(String word, char first, int j){
		String start= word.substring(0, j);
		String end= word.substring(j);
		return start+first+end;
	}
	
	public static void main(String args[]){
		ArrayList<String> perms= getPerms("shekhar");
		System.out.println(perms);
		
	}

}
