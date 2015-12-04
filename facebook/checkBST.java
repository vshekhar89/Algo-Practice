package facebook;

public class checkBST {
	
	public static int index=0;
	public static void copyBST(TreeNode root, int[] arr){
		if(root==null){
			return;
		}
		copyBst(root.left, arr);
		arr[index]=root;
		copyBST(root.right,arr);
	}
	
	public static boolean isBST(TreeNode root){
		int[] arr = new int[root.size];
		
		copyBST(root, arr);
		
		for(int i=0; i<arr.length;i++){
			if(arr[i]<= arr[i-1]){
				return false;
			}
		}
		
		return true;
	}
	
	public static Integer last_printed;
	
	public static boolean checkBST(TreeNode n){
		if(n==null)return false;
		
		//check left
		if(!checkBST(n.left)){
			return false;
		}
		
		if(last_printed!= null && last_printed >= n.data){
			return false;
		}
		
		last_printed= n.data;
		
		//check right
		if(!checkBST(n.right)){
			return false;
		}
		
		return true;
	}
	
	
	public static boolean checkForBST(TreeNode n, Integer min, Integer max){
		if(n==null){
			return false;
		}
		
		if((min != null && n.data <= min) || (max != null && n.data > max)){
			return false;
		}
		
		if(!checkForBST(n.left,min, n.data)) || !checkForBST(n.right, n.data, max)){
			return false;
		}
		
		return true;
		
		
		
	}

}
