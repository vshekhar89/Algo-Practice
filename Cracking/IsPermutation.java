package Cracking;

import java.util.Arrays;

public class IsPermutation {
	
	public static boolean isPermute(String s1, String s2){
		
		if(s1.length()!= s2.length()){
			return false;
		}
		
		System.out.println(sortChars(s1));
		System.out.println(sortChars(s2));
		return sortChars(s1).equals(sortChars(s2));
	}
	
	
	public static String sortChars(String src){
		
		char[] str= src.toCharArray();
		Arrays.sort(str);
		
		return new String(str);
		
	}

	public static void main(String args[]){
		String s1="This";
		String s2="Tish";
		
		boolean result= isPermute(s1, s2);
		
		System.out.println(result);
	}
}
