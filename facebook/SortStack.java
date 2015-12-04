package facebook;

import java.util.Stack;

public class SortStack {
	
	public static void sort(Stack<Integer> s){
		
		Stack<Integer> r = new Stack<Integer>();
		
		while(!s.isEmpty()){
			int tmp= s.pop();
			if(!r.isEmpty() && r.peek() >tmp){
				s.push(r.pop());
			}
			r.push(tmp);
		}
	}

}
