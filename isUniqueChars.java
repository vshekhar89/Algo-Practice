
public class isUniqueChars {
	
	public static boolean isUniqueChars(String str){
		if(str.length()>128)
			return false;
		
		boolean[] char_set = new boolean[256];
		
		for(int i=0;i<str.length();i++){
			int val =str.charAt(i);
			if(char_set[val]){
				return false;
		}
			char_set[val]=true;
		}
		
		return true;
	}
		
	public static void main(String args[]){
		boolean result;
		String s="Not a unique char string";
		String s1= "Uniqe";
		
		result=isUniqueChars(s1);
		if(result==true){
			System.out.println("Unique char string");
		}
		else
			System.out.println("Not a unique char string");
	}
	

}
