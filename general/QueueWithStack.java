package general;

import java.util.Queue;
import java.util.Stack;

//implementing queue using stack
public class QueueWithStack<T>{

	Stack<T> stnew, stold;
	
	public QueueWithStack(){
		stnew = new Stack<T>();
		stold = new Stack<T>();
	}
	
	public void push(T item){
		stnew.push(item);
	}
	
	public T pop(){
		shiftstacks();
		return stold.pop();
	}
	
	public T peek(){
		shiftstacks();
		return stold.peek();
	}
	
	public void shiftstacks(){
		if(stold.isEmpty()){
			while(stnew.isEmpty()){
				stold.push(stnew.pop());
			}
		}
	}
	
	
}
