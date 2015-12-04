package facebook;

public class App {

	public static void main(String args[]){
	    
	    String src="Shekhar";
	    
	    
	    for(int i=0; i<src.length(); i++){
	        for(int c=0;c<src.length()-i+1;c++){
	            System.out.println(src.substring(i,i+c));
	            
	        }
	    }
	}

	
}
