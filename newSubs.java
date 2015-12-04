import java.util.ArrayList;


public class newSubs {

	

	    static String in = "Hello";

	    public static void main(String[] args) {
	        suffixGen(in);
	    }
	    public static void generate(String word) 
	    {
	    	
	    	ArrayList<String> palinSubs= new ArrayList<String>();
	    	//base case... wtf is the base case here?
	        //idk bout this 
	        if (word.length() == 1)
	        {	
	            System.out.println(word);
	            return;
	        }
	        //recursive case
	        if (word.length() != 0)
	        {

	            System.out.println(word);
	            generate(word.substring(0, word.length()-1)); //gets the first 5 substrings
	        }
	    }
	   public static void suffixGen(String word)
	    {
	        if (word.length() > 1)
	        {
	             generate(word);
	            suffixGen(word.substring(1));
	        }

	    }
	
}
