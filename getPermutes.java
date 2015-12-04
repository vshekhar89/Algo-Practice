import java.util.ArrayList;


public class getPermutes {

	
	public static void main(String args[]){
		
		ArrayList<String> perms = getPerms("shekhar");
		System.out.println(perms);
	}
	
	
	public static ArrayList<String> getPerms(String src){
		
		ArrayList<String> permutations = new ArrayList<String>();
		if(src==null){
			//permutations.add("");
			//System.out.println("NULL String");
			return null;
			
		}
		if(src.length()==0){
			
			permutations.add("");
			return permutations;
		}
		
		char first = src.charAt(0);
		String remainder = src.substring(1);
		ArrayList<String> words = getPerms(remainder);
		
		for(String word:words){
			for (int j=0; j<= word.length();j++){
				String s= insertCharAt(word, first ,j);
				permutations.add(s);			}
		}
		
		return permutations;
	}
	
	public static String insertCharAt(String word, char first, int i){
		String start= word.substring(0, i);
		String end= word.substring(i);
		return start+first+end;
		
		
		
	}
}


