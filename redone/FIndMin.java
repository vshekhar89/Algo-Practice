package redone;

import java.util.Stack;

public class FIndMin extends Stack<Integer>{
	
	Stack<Integer> s2;
	
	public void push(int data){
		super.push(data);
		
		if(s2.peek()<data){
		s2.push(data);
		}
	}
	
	public Integer pop(){
		int val= super.pop();
		
		if(val ==s2.peek() ){
			s2.pop();
		}
		return val;
	}
	
	public Integer Min(){
		int min;
		if(s2.isEmpty()){
			return Integer.MAX_VALUE;
		}
		else return s2.peek();
	}

}
