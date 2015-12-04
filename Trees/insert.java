package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class insert {
	
	public BinaryTreeNode insertNode(BinaryTreeNode root, int data){
		
		if(root== null){
			return null;
		}
		
		Queue<BinaryTreeNode> q= new LinkedList<BinaryTreeNode>();
		
		q.offer(root);
		
		while(!q.isEmpty()){
			
			BinaryTreeNode tmp = q.poll();
			
			if(tmp!= null){
			if(tmp.getLeft() != null){
				q.offer(tmp.getLeft());
			}
			else{
				tmp.left = new BinaryTreeNode(data);
			}
			
			if(tmp.getRight() != null){
				q.offer(tmp.getRight());
			}else{
				tmp.right= new BinaryTreeNode(data);
			}
			}
		}
		
		return root;
	}
	
	
	public void insert(BinaryTreeNode root, int data){
		if(root ==null){
			root= new BinaryTreeNode(data);
		}
		else{
			insertHelper(root, data);
		}
		
		
	}
	
	public BinaryTreeNode insertHelper(BinaryTreeNode root, int data){
		
		if(root.left==null){
			root.left= new BinaryTreeNode(data);
		}
		else{
			return insertHelper(root.right, data);
		}
		if(root.right==null){
			root.right = new BinaryTreeNode(data);
		}else{
			return insertHelper(root, data);
		}
		
	}

}
