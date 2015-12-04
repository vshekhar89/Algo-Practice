import java.util.Stack;


public class myQueue<T>{

	Stack<T>newestStack, oldestStack;
	
	public void myQueue(){
		
		newestStack =new Stack<T>();
		oldestStack= new Stack<T>();
	}
	
	public void push(T value){
		newestStack.push(value);
	}
	
	public T peek(){
		shiftStacks();
		return oldestStack.peek();
		
		
	}
	
	public T pop(){
		shiftStacks();
		return oldestStack.pop();
	}
	
	public void shiftStacks(){
		if(oldestStack.isEmpty()){
			while(!newestStack.isEmpty())
			{
				oldestStack.push(newestStack.pop()) ;
			}
		}
		
	}
}
