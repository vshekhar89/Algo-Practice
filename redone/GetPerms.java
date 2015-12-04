package redone;

import java.util.ArrayList;

import facebook.getPerms;

public class GetPerms {
	public static ArrayList<String> getPerms(String src){
		ArrayList<String> perms= new ArrayList<String>();
		
		if(src.length()==0){
			perms.add("");
			return perms;
		}
		if(src==null){
			return null;
		}
		char first = src.charAt(0);
		String remainder = src.substring(1);
		ArrayList<String> words= getPerms(remainder);
		for(String word: words){
			for(int i=0; i<=word.length();i++){
				String perm = insertChar(word,first,i);
				perms.add(perm);
			}
		}
	return perms;
	}
	public static String insertChar(String word, char first, int i){
		String init= word.substring(0,i);
		String last = word.substring(i);
		return init+first+last;
	}
	
	public static void main(String args[]){
		
		String src="Shekhar";
		ArrayList<String> result = getPerms(src);
		System.out.println(result);
	}
	

}
