package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class size {
	
	public int size(BinaryTreeNode root){
		
		int countleft= root.left==null? 0: size(root.left);
		int countRight= root.right==null? 0: size(root.right);
		return 1 + countleft+ countRight;
	}
	
	
	public int size(BinaryTreeNode root){
		if(root==null){
			return 0;
		}
		int count=0;
		
		
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		
		q.offer(root);
		while(!q.isEmpty()){
			
			count++;
			BinaryTreeNode tmp= q.poll();
			
			if(tmp.left!= null){
				q.offer(tmp.left);			}
			if(tmp.right!= null){
				q.offer(tmp.right);
			}
		}
		return count;
	}

}
