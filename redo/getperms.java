package redo;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class getperms {
	
	public static void main(String args[]){
		
		String src="Shekhar";
		ArrayList<String> res= getPerms(src);
		System.out.println(res);
	}

	
	public static ArrayList<String> getPerms(String src){
		
		ArrayList<String> permutations= new ArrayList<String>();
		
		if(src==null){
			return null;
		}
		
		if(src.length()==0){
			permutations.add("");
			return permutations;
		}
		
		char first= src.charAt(0);
		
		String remainder= src.substring(1);
		ArrayList<String> words = getPerms(remainder);
		
		for(String word:words){
			for(int i=0; i<=word.length();i++){
				String s= insertCharAt(first, word, i);
				permutations.add(s);
			}
		}
		
		return permutations;
		
	}
	
	public static String insertCharAt(char first,String word, int i){
		
		String start= word.substring(0, i);
		String end= word.substring(i);
		return start+first+end;
	}
}
