package general;
//check whether a string contains unique characters
public class UniqueString {
	
	
	public static boolean isUnique(String src){
		
		boolean[] char_set= new boolean[256];
		
		for(int i=0; i<src.length();i++){
			char value= src.charAt(i);
			if(char_set[value]){
				return false;
			}else{
				char_set[value]=true;
			}
		}
		
		return true;
	}
	
	public static void main(String args[]){
		String src="Test String";
		
		boolean res= isUnique(src);
		
		if(res){
			System.out.println("Unique char String");
		}else{
			System.out.println("Not unique");
		}
	}

}
