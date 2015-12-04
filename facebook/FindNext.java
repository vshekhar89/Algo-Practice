package facebook;

public class FindNext {
	
	public static TreeNode findNext(TreeNode n){
		
		if(n==null){
			return null;
		}
		
		if(n.right!=null){
			return leftMostNode(n.right);
		}else{
			TreeNode q= n;
			TreeNode x = q.parent;
			
			while(x!= null && x.left=q){
				q=x;
				x=x.parent;
				
			}
			return x;
		}
	}
	
	
	public static TreeNode leftMostNode(TreeNode n){
		if(n==null){
			return null;
		}
		
		while(n.left!=null){
			n=n.left;
		}
		return n;
	}

}
