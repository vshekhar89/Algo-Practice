package redo;

import java.util.ArrayList;

public class getPermutes {

	public static void main(String args[]){
		String src="shekhar";
		ArrayList<String> permutes = getPermute(src);
		System.out.println(permutes);
	}
	
	
	public static ArrayList<String> getPermute(String src){
		
		
		//char[] sr= src.toCharArray();
		ArrayList<String> temp = new ArrayList<String>();
		
		

		if(src==null){
			return null;
		}
		
		if(src.length()==0){
			temp.add("");
			return temp;
		}
		char first= src.charAt(0);
		
		String remainder= src.substring(1);
		ArrayList<String> words= getPermute(remainder);
		for(String word: words){
			for(int i=0; i<=word.length();i++){
				String s1= insertChars(word, first, i);
				temp.add(s1);
			}
		}
		return temp;
		
	}
	
	public static String insertChars(String word, char first, int i){
		String start= word.substring(0,i);
		String end = word.substring(i);
		return start+first+end;
		
		
	}
}
