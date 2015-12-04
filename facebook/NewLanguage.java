package facebook;

public class NewLanguage {
	
	public static char[] findOrder(String[] list){
		char[] order= new char[list.length];
		
		int i=0;
		for(String word: list){
			order[i]= word.charAt(0);
			i++;
		}
		
		return order;
	}
	
	public static void main(String args[]){
		
	}

}
