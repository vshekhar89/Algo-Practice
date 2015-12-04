package redo;

public class uniqueChars {

	
	public static boolean isUniqueChars(String str){
		
		boolean[] char_set= new boolean[326];
		
		char[] src = str.toCharArray();
		
		for(int i=0; i<str.length();i++){
			int val= src[i];
			if(char_set[val]){
				return false;
			}
			char_set[val]= true;
		}
		
		
		return true;
	}
	
	
	public static void main(String args[]){
		String un="Unique";
		String nu="This is not unique";
		
		boolean result= isUniqueChars(un);
		if(result){
			System.out.println("Unique char string");
		}else{
			System.out.println("Not Unique Char String");
		}
		
	}
}
