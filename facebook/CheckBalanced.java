package facebook;

public class CheckBalanced {

	
	public static int checkHeight(TreeNode root){
		
		if(root==null){
			return -1;
		}
		
		int leftHeight= checkHeight(root.left);
		if(leftHeight==-1){
			return -1;//not balanced
		}
		
		int rightHeight= checkHeight(root.right);
		if(rightHeight==-1){
			return -1;
		}
		
		int heightDiff= leftHeight- rightHeight;
		if(Math.abs(heightDiff)>1){
			return -1;
		}else{
			return Math.max(leftHeight, rightHeight)+1;
		}
	}
	
	public static boolean isBalanced(TreeNode root){
		int result= checkHeight(root);
		
		if(result==-1){
			return false;
		}else{
			return true;
		}
	}
}
