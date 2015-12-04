package facebook;

public class SubsRecur {
	
	public static void suffixGen(String word){
		if(word.length()>1){
			generate(word);
			suffixGen(word.substring(1));
		}
		
	}
	
	public static void generate(String word){
		
		if(word.length()==1){
			System.out.println(word);
			return;
		}
		
		if(word.length()!=0){
			System.out.println(word);
			generate(word.substring(0, word.length()-1));
		}
	}
	
	public static void main(String args[]){
		suffixGen("Shekhar");
	}

}
