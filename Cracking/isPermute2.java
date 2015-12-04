package Cracking;

public class isPermute2 {
	
	public static boolean isPermute(String s1, String s2){
		
		if(s2.length()!= s1.length()){
			return false;
		}
		
		int[] letters= new int[256];
		char[] str1= s2.toCharArray();
		
		for(char c: str1){
			letters[c]++;
		}
		
		for(int i=0; i<s2.length();i++){
			int c= (int) s2.charAt(i);
			
			if(--letters[c]<0){
				return false;
			}
		}
		
		return true;
		
		
	}

}
