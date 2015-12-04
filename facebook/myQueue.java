package facebook;

import java.util.Stack;


//implement queue using two stacks
public class myQueue<T>{

Stack<T> s1, s2;

	public void myQueue(){
		s1= new Stack<T>();
		s2= new Stack<T>();
	}
	
	
	public void push(T data){
		s1.push(data);
	}
	
	public T peek(){
		shiftstacks();
		return s2.peek();
	}
	
	public T pop(){
		shiftstacks();
		return s2.pop();
		
	}
	
	public  void shiftstacks(){
		if(s2.isEmpty()){
			while(!s1.isEmpty()){
				s2.push(s1.pop());
			}
		}
	}
	
}
