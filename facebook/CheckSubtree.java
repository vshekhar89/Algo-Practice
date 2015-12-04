package facebook;

public class CheckSubtree {
	
	public static boolean checkSubtree(TreeNode t1, TreeNode t2){
		if(t2==null){
			return false;
		}
		return subtree(t1, t2);
	}
	
	public static boolean subtree(TreeNode r1, TreeNode r2){
		
		if(r1==null){
			return false;
		}
		if(r1.data==r2.data){
			return matchTree(r1, r2);
		}
		return subtree(r1.left,r2)|| subtree(r1.right, r2);
	}
	
	public static boolean matchTree(TreeNode r1, TreeNode r2){
		if(r1==null && r2== null){
			return true;
		}
		
		if(r1==null || r2==null){
			return false;
		}
		
		if(r1.data!= r2.data){
			return false;
		}
		return matchTree(r1.left, r2.left) && matchTree(r1.right, r2.right);
		
	}

}
