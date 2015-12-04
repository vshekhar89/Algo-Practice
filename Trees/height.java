package Trees;

public class height {

	public int maxHeight(BinaryTreeNode root){
		
		if(root== null){
			return 0;
		}
		
		int leftDepth = maxHeight(root.left);
		int rightDepth= maxHeight(root.right);
		return (leftDepth > rightDepth)? leftDepth+1 : rightDepth+1;
	}
	
	
	
}
