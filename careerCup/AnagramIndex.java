package careerCup;


import java.util.ArrayList;
import java.util.Arrays;

public class AnagramIndex {

	
	
	public static ArrayList<Integer> returnIndex(String s1, String s2){
		ArrayList<Integer> index= new ArrayList<Integer>();
		
		
		int len=0;
		for(int i=0;(s2.length()-i) > s1.length();i++){
			 if((sortChars(s2.substring(i, i+s1.length()))).equals(sortChars(s1))){
				 index.add(i);
			 }
			
		}
		
		return index;
		
	}
	
	
	public static String sortChars(String subset){
		char[] sub= subset.toCharArray();
		Arrays.sort(sub);
		return String.valueOf(sub);
		
	}
	
	public static void main(String args[]){
		
		String s1="abcd";
		String s2="abcdefcdbacd";
		
		ArrayList<Integer> res = returnIndex(s1, s2);
		
		System.out.println(res);
	}
}
