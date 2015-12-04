import java.util.Stack;


public class stackMin extends Stack<Integer> {
	
	Stack<Integer> s2 =null;
	public void stackMin(){
		s2 =new Stack<Integer>();
		
	}
	
	public void push(int value){
		if(value< min()){
			s2.push(value);
		}
		super.push(value);
	}
	 public int pop(){
		 
		 int value= s2.pop();
		 
		 if(value== min()){
			 s2.pop();
		 }
		 return value;
	 }
	 
	 public int min(){
		 if(s2.isEmpty()){
			 return Integer.MAX_VALUE;
		 }else{
			 return s2.peek();
		 }
	 }
	

}
