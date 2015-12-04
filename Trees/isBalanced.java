package Trees;

public class isBalanced {

	
	public static int checkHeight(BinaryTreeNode root){
		if(root==null){
			return 0;
		}
		
		int leftheight= checkHeight(root.getLeft());
		if(leftheight==-1){
			return -1;
		}
		
		int rightheight= checkHeight(root.getRight());
		if(rightheight==-1){
			return -1;
		}
		
		int diff= leftheight- rightheight;
		if(Math.abs(diff)>1){
			return -1;
		}else{
			return Math.max(leftheight, rightheight)+1;
		}
		
	}
	
	public static boolean isBalanced(BinaryTreeNode root){
		if(checkHeight(root)==-1){
			return false;
		}else{
			return true;
		}
	}
}
