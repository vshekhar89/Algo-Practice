package facebook;

import java.util.Stack;

public class QueueImple<T>{

	Stack<T> oldStack, newStack;
	
	public QueueImple(){
		oldStack= new Stack<T>();
		newStack= new Stack<T>();
	}
	
	public void push(T value){
		newStack.push(value);
	}
	
	public void shiftStacks(){
		if(oldStack.isEmpty()){
			while(!newStack.isEmpty()){
				oldStack.push(newStack.pop());
			}
		}
	}
	
	public T pop(){
		shiftStacks();
		return oldStack.pop();
	}
	
	public T peek(){
		shiftStacks();
		return oldStack.peek();
	}
}
