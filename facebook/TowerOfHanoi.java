package facebook;

import java.util.Stack;

public class TowerOfHanoi {
	
	public static void main(String args[]){
		int n=3;
		Tower[] tower = new Tower[n];
		
		for(int i=0; i<n;i++){
			tower[i]= new Tower(i);
		}
		
		for(int i=n-1;i>=0; i--){
			tower[0].add(i);
		}
		
	}
}
	public class Tower{
		private Stack<Integer> disks;
		int index;
		
		public Tower(int i){
			disks = new Stack<>();
			index=i;
	}
		
		public void add(int d){
			if(!disks.isEmpty() && disks.peek() <= d){
				System.out.println("Error");
			}else{
				disks.push(d);			}
		}
		
		
		public void moveDisks(int n, Tower buffer, Tower destination){
			if(n>0){
				moveDisks(n-1, buffer, destination);
				moveToTop(destination);
				buffer.moveDisks(n-1,destination,this);
			}
		}
		
		public void moveToTop(Tower t){
			int top= disks.pop();
			t.add(top);
			System.out.println("Disk Moved");
		}
		
		
}


