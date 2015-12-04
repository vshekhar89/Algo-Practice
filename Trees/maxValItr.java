package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class maxValItr {

	public int maxValItr(BinaryTreeNode root){
		if(root == null){
			return Integer.MIN_VALUE;
		}
		int maxVal= Integer.MIN_VALUE;
		
		Queue<BinaryTreeNode> q = new LinkedList<BinaryTreeNode>();
		
		q.offer(root);
		while(root!= null){
			
			BinaryTreeNode tmp= q.poll();
			
			if(tmp.getData() > maxVal){
				maxVal= tmp.getData();
			}
			if(tmp!= null){
				if(tmp.getLeft()!= null){
					q.offer(tmp.left);
				}if(tmp.getRight()!=null){
					q.offer(tmp.right);
				}
			}
		}
		
		return maxVal;
	}
	
}
