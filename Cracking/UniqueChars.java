package Cracking;

public class UniqueChars {

	public static boolean isUnique(){
		String str="Thisisateststring";
		
		if(str.length()>128){
			return false;
		}
		
		boolean[] char_set= new boolean[256];
		
		for(int i=0;i<str.length();i++){
			if(char_set[str.charAt(i)]){
				return false;
			}else{
				char_set[str.charAt(i)]=true;
			}
		}
		
		return true;
	}
}
