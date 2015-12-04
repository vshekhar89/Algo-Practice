package general;

import java.util.ArrayList;

//generate all substrings of a given string
public class GenerateSubs {
	
	public static void main(String args[]){
		String src="Shekhar";
		suffixgen(src);
	}
	
	public static void suffixgen(String src){
		if(src.length() > 1){
			generate(src);
			suffixgen(src.substring(1));
		}
	}
	
	public static void generate(String src){
		
		if(src.length()==1){
			System.out.println(src);
			return;
		}
		if(src.length()!=0){
			System.out.println(src);
			generate(src.substring(0,src.length()-1));
		}
	}
}
