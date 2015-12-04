package glassdor;

import java.util.Stack;

public class returnTop extends Stack<Integer>{
	
	Stack<Integer> s2;
	int min;
	public returnTop(){
		s2= new Stack<Integer>();
	}
	
 public void push(int value){
	if (s2.pop()>value){
		 s2.push(value);
	 }
	super.push(value);
 }
 
 public Integer pop(){
	 if(super.pop()== s2.peek()){
		 s2.pop();
		 return super.pop();
	 }
	 else return super.pop();
 }

}
