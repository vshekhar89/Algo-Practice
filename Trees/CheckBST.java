package Trees;

public class CheckBST {

	
	public void chckBST(BinaryTreeNode root){
		
		chckBST(root, null, null);
	}
	
	public boolean chckBST(BinaryTreeNode n , Integer min, Integer max){
		
		if(n==null){
			return false;
		}
		
		if((min!=null && n.data <= min) ||
			(max!= null && n.data >= max)){
			return false;
		}
		
		if(! chckBST(n.left, min , max)|| !chckBST(n.right, min , max)){
			return false;
		}
		
		return true;
	}
}
