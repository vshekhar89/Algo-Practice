package general;

import javax.swing.tree.TreeNode;

public class CreateTree {

	public static TreeNode createTree(){
		TreeNode root= null;
		 int[] arr= {1,2,3,4,5,6,7,8};
		 int[] unvisited= new int[arr.length];
		 for(int i=0; i<arr.length;i++){
			 unvisited[i]=arr[i];
			 
		 }
		
		return root;
	}
}
