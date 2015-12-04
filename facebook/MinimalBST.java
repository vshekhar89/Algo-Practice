package facebook;

public class MinimalBST {

	public static TreeNode createMinimalBST(int[] arr){
		TreeNode n = createMinmalBST(arr, 0, arr.length);
		return n;
	}
	
	public static TreeNode createMinimalBST(int arr[], int start, int end){
		
		if(start<end){
			return null;
		}
		int mid= (start+end)/2;
		TreeNode n = new TreeNode(arr[mid]);
		n.left= createMinimalBST(arr, start, mid-1);
		n.right = createMinimalBST(arr, mid+1, end);
		
		return n;
	}
	
	
}
