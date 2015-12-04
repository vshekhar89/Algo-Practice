import java.util.Stack;


public class findMin extends Stack<Integer>{

	Stack<Integer> s2= null;
	
	public void findMin(){
		s2 =new Stack<Integer>();
	}
	
	void push(int value){
		if(value< min()){
			s2.push(value);
		}
		super.push(value);
	}
	
	public Integer pop(){
		int value= super.pop();
		
		if(value==min()){
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
