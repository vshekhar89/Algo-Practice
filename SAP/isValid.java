package SAP;

import java.util.Stack;

public class isValid {
	
	
	public static void main(String args[]){
		
		String src="()(";
		
		int ans = isValid(src);
		System.out.println(ans);
		
	}
	
	public static int isValid(String src){
		
		int count=0;
		//Assuming null string has to be considered as balanced
		if(src==null || src==""){
			return 0;
		}
		
		Stack<Character> st= new Stack<Character>();
		
	
		for(char ch : src.toCharArray()){
		switch (ch) {
		case '(':
		case '{':
		case '[':
			st.push(ch);
			break;
			
		case ')':
			if(st.isEmpty() || st.pop() != '('){
				return -1;
				}else{
					count++;
				}
			
			break;
			
		case '}':
			if(st.isEmpty() || st.pop() != '{'){
				return -1;
				}
			else{
				count++;
			}
			break;
			
		case ']':
			if(st.isEmpty() || st.pop() != '['){
				return -1;
				}else{
					count++;
				}
			
			break;
			
		default:
			break;
	
		}
		}
		if(src.isEmpty()){
			return count;
		}
		else{
			return -1;
		}
	}

}
