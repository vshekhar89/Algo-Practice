import java.util.EmptyStackException;


public class impleStack {

	int stackSize = 100;
	int buffer[] = new int[stackSize * 3];
	
	int[] stackPointer ={-1, -1, -1};
	
	void push(int data, int stacknum) throws Exception{
		if(stackPointer[stacknum] +1 >= stackSize){
			throw new FullStackException();
		}
		else{
			stackPointer[stacknum]++;
			buffer[absTopOfStack(stacknum)]=data;
		}
		
	}
	
	int pop (int stackNum)throws Exception{
		
		if(stackPointer[stackNum] == -1){
			throw new EmptyStackException();
		}
		
		int value= buffer[absTopOfStack[stackNum]];
		stackPointer[stackNum]--;
		buffer[absTopOfStack[stackNum]]=0;
		return value;
	}
	
	int peek(int stackNum){
		if(isEmpty(stackNum)){
			throw new EmptyStackException();
	}
	
	int index =absTopOfStack[stackNum];
	return index;
	}
	
	boolean isEmpty(int stackNum){
	return stackPointer[stackNum]==-1;	
	}
	
	
	
	
}
