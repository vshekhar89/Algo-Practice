package Trees;

public class maxValue {

	public int maxValue(BinaryTreeNode root){
		int maxval= Integer.MIN_VALUE;
		if(root != null){
			int leftMax= maxValue(root.left);
			int rightMax= maxValue(root.right);
			
			if(leftMax > rightMax){
				maxval=leftMax;
			}else{
				maxval= rightMax;
			}
			if(root.data > maxval){
				maxval= root.data;
			}
		}
		
		return maxval;
	}
}
