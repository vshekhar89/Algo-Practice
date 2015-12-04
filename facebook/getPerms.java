 package facebook;

import java.util.ArrayList;

public class getPerms {
	
	public static ArrayList<String> getPermutes(String src){
		
		ArrayList<String> result= new ArrayList<String>();
		
		if(src==null){
			System.out.println("Empty String");
			return null;
		}
		if(src.length()==0){
			result.add("");
			return result;
		}
		
		char first= src.charAt(0);
		String remainder= src.substring(1);
		ArrayList<String> words= getPermutes(remainder);
		for(String word: words){
			for(int i=0; i<=word.length();i++){
			String res= insertCharAt(word,i, first);
			result.add(res);
			}
		}
		
		return result;
	}
	
	public static String insertCharAt(String word, int i, char first){
		String fir= word.substring(0,i);
		String last= word.substring(i);
		return fir+first+last;
		
		
	}
	
	public static void main(String args[]){
		
		String src="Shekhar";
		ArrayList<String> permutes= new ArrayList<String>();
		
		permutes= getPermutes(src);
		System.out.println(permutes);
	}

}
