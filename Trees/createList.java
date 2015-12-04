package Trees;

import java.util.ArrayList;
import java.util.LinkedList;

public class createList {

	
	
	public static ArrayList<LinkedList<BinaryTreeNode>> createLists(BinaryTreeNode root){
		
		ArrayList<LinkedList<BinaryTreeNode>> result= new ArrayList<LinkedList<BinaryTreeNode>>();
		LinkedList<BinaryTreeNode> current= new LinkedList<BinaryTreeNode>();
		
		if(root == null){
			return null;
		}else{
			current.add(root);
		}
		
		while(current.size() >0){
			result.add(current);
			
			LinkedList<BinaryTreeNode> parents= current;
			for(BinaryTreeNode parent:parents){
				if(parent.getLeft()!= null){
					current.add(parent.left);
				}
				if(parent.getRight()!= null){
					current.add(parent.getRight());
				}
			}
			
		}
		
		return result;
	}
}
