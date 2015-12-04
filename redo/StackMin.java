package redo;

import java.sql.Statement;
import java.util.Stack;

public class StackMin extends Stack<Integer>{
	
	public static Stack<Integer> s1= null;
	public static Stack<Integer> s2 = null;
	
	public void StackMin(){
		this.s1= new Stack<Integer>();
		this.s2 = new Stack<Integer>();
	}
	
	public void push(int item){
		if(s2.pop() > item){
			s2.push(item);
		}
		s1.push(item);
	}
	
	public Integer pop(){
		if(s2.peek()== s1.pop()){
			s2.pop();
		}
		return s1.pop();
	}
	
	public Integer min(){
		return s2.peek();
	}
	
	

}
