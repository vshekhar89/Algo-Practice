package facebook;

import java.util.ArrayList;
import java.util.Arrays;

public class AnagramIndex {
	
	
	public static String sortchars(String st){
		char[] src= st.toCharArray();
		Arrays.sort(src);
		
		
		return new String(src);
	}
	
	public static ArrayList<Integer> findIndex(String s1, String s2){
		ArrayList<Integer> res= new ArrayList<Integer>();
		
		
		for(int i=0; s2.length()-i > s1.length();i++){
			if(sortchars(s2.substring(i,i+s1.length())).equals(sortchars(s1))){
				res.add(i);
			}
		}
		
		
		return  res;
	}
	
	
	public static void main(String args[]){

		String s1="abcd";
		String s2="abcdefcdbacd";
		
		ArrayList result= findIndex(s1,s2);
		
		System.out.println(result);
	}

}
