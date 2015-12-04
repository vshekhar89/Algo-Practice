package facebook;

import java.util.ArrayList;
import java.util.LinkedList;

public class CreateLists {
	
	public static ArrayList<LinkedList<TreeNode>> createLists(TreeNode root){
		
		if(root==null){
			return null;
		}
		
		ArrayList<LinkedList<TreeNode>> result = new ArrayList<LinkedList<TreeNode>>();
		
		LinkedList<TreeNode> current= new LinkedList<TreeNode>();
		
	if(root!=null){
		current.enqueue(root);
	}
	
	while(current.size!=null){
		LinkedList<TreeNode> parents= current;
		current= new LinkedList<TreeNode>();
		
		for(TreeNode parent: parents){
			if(parent.left!=null){
				current.add(parent.left);
			}
			if(parent.right!=null){
				current.add(parent.right);
			}
		}
	}
	return result;
		
	}
	

}
