package SAP;

public class IsCountEqual {

	
	public static void main(String args[]){
		String src="())(()";
		
		boolean ans = isCountEqual(src);
		if(ans==true){
			System.out.println("Balanced");
			
		}else{
			System.out.println("UnBalanced");
		}
		
	}
	
	public static boolean isValid(String src){
		
		int opening=0; //opening bracket count
		int closing=0; //closing bracket count
		
		
		for(char ch : src.toCharArray()){
			
			if(closing > opening)
				return false;
			
			if(ch=='(')
				opening++;
			
			if(ch==')'){
				closing++;
			}
				
			
		}
		
		if(opening==closing)
			return true;
		
		return false;
	}
}
