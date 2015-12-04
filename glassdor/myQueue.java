package glassdor;

import java.util.Stack;

public class myQueue<T>{
	
	Stack<T> s1;
	Stack<T> s2;
	
	void myQueue(){
		s1 = new Stack<T>();
		s2= new Stack<T>();
	}
	
	public void enqueue(T item){
		s1.push(item);
	}
	
	public T peek(){
		shiftStacks();
		return s2.peek();
	}
	
	public T dequeue(){
		if(s2.isEmpty()){
			shiftStacks();
			return s2.pop();
		}
		return s2.pop();
	}
	public void shiftStacks(){
		if(s2.isEmpty()){
			while(!s1.isEmpty()){
				s2.push(s1.pop());
			}
		}
		
	}
	

}
