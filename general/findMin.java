package general;

import java.util.Stack;
//Find the min value in a Stack in O(1) time
public class findMin extends Stack<Integer>{
	
	Stack<Integer> min;
	
	public findMin(){
		min = new Stack<Integer>();
	}
	
	public void push(int item){
		super.push(item);
		if(min.peek()> item){
			min.push(item);
		}
	}
	
	public Integer pop(){
		int value= super.pop();
		if(value==min.peek()){
			min.pop();
		}
		return value; 
	}
	
	public Integer findMin(){
		return min.peek();
	}
	
}
