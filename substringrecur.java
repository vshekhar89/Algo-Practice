import java.util.ArrayList;


public class substringrecur {
	
	
	

	    public static void main(String[] args) {
	        generate("hello");
	    }

	    public static void generate(String word) {
	    	
	    	ArrayList<String> palinSubs= new ArrayList<String>();
	    	
	        if (word.length() == 1) {
	        	if(isPalindrome(word)){
	        	 palinSubs.add(word);
	            //System.out.println(word);
	            return;
	        	}
	        }else{
	            System.out.println(word);
	            generate(word.substring(0, word.length()-1)); 
	            generate(word.substring(1, word.length())); 
	        }

	    }
	    
	    
	    public static boolean isPalindrome(String word){
	    	
	    	int start=0;
	    	int end=word.length()-1;
	    	
	    	while(start<end){
	    		if(word.charAt(start)==word.charAt(end)){
	    			start++;
	    			end--;
	    		}
	    		else{
	    			return false;
	    		}
	    	}
	    	
	    	return true;
	    }

	}
	  
	  

