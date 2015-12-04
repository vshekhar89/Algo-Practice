package facebook;

import java.util.Stack;

public class StackMin extends Stack<Integer> {
	
	public static Stack<Integer> s2= new Stack<Integer>();
	
	public void push(int data){
		super.push(data);
		if(s2.peek()< data){
			s2.push(data);
		}
	}
	
	public Integer pop(){
		
		if(super.peek()==s2.peek()){
			s2.pop();
		}
		return super.pop();
	}
	
	public Integer min(){
		if(s2.isEmpty()){
			System.out.println("Stack Empty");
			return Integer.MAX_VALUE;
		}else{
			return s2.peek();
		}
	}
	
	
}
