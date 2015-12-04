package Trees;

public class MinimalBST {
	
	public BinaryTreeNode createMinimalBST(int[] arr, int start, int end){
		if(end<start){
			return null;
		}
		
		int mid=(start+end)/2;
		
		BinaryTreeNode root= new BinaryTreeNode(arr[mid]);
		
		root.left= createMinimalBST(arr, start, mid-1);
		root.right= createMinimalBST(arr, mid+1, end);
		
		return root;
	}
	
	public BinaryTreeNode createMinimalBST(int[] arr){
		return createMinimalBST(arr, 0, arr.length-1);
	}

}
