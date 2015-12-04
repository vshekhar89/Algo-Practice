package SymbolTableRedo;

public class BinarySearchTree<Key extends Comparable<Key>,Value> {
	
	private Node root;
	
	public class Node{
		private Node right;
		private Node left;
		private Key key;
		private Value val;
		private int N;
		
		public Node(Key key, Value val, int count){
			this.key= key;
			this.val=val;
			//this.right=right;
			//this.left= left;
			this.N= count;
			
		}
	}
	
	public int size(Node x){
		int count=0;
		if(x==null)return 0;
		count= size(x.left)+size(x.right)+1;
		return count;
	}
	
	public Value get(Key key){
		return getVal(root, key);
	}
	
	public Value getVal(Node x,Key key){
		if(x==null)return null;
		int cmp= root.key.compareTo(key);
		if(cmp < 0) return getVal(x.left,key); 
		else if(cmp > 0)return getVal(x.right,key);
		else return x.val;
	}
	
	public void put(Key key, Value val){
		root=putVal(root,key,val);
	}
	
	
	public Node putVal(Node x, Key key, Value val){
		if(x==null)return new Node(key,val,1);
		
		int cmp= key.compareTo(x.key);
		if(cmp > 0)x= putVal(x.right,key,val);
		else if(cmp < 0)x=putVal(x.left,key,val);
		else{
			x.val=val;
			x.N= size(x.left)+size(x.right)+1;
			
		}
		return x;
		
	}
	
	public Node min(){
		return minNode(root);
	}
	
	public Node minNode(Node x){
		if(x.left==null)return x;
		
		while(x.left!=null){
			x=x.left;
		}
		return x;
	}
	
	public Node max(){
		return maxNode(root);
	}
	
	public Node maxNode(Node x){
		if(x.right==null)return x;
		
		while(x.right!=null){
			x=x.right;
		}
		return x;
	}
	
	public Key Floor(Key key){
		return FloorNode(root,key).key;
	}
	
	public Node FloorNode(Node x, Key key){
		
		if(x==null)return null;
		int cmp= key.compareTo(x.key);
		if(cmp < 0)return FloorNode(x.left,key);
		if(cmp==0)return x;
		Node t = FloorNode(x.right, key);
		if(t!=null)return t;
		else return x;
	}
	
	public int rank(Key key){
		return rank(key,root);
	}
	
	public int rank(Key key, Node x){
		if(x==null)return 0;
		int cmp= key.compareTo(x.key);
		if(cmp < 0)return rank(key,x.left);
		if(cmp> 0)return 1+size(x.left)+rank(key,x.right);
		else return size(x.left);
	}
	
	public Key select(int k){
		return select(root,k).key;
	}

	public Node select(Node x , int k){
		if(x==null)return null;
		int t= size(x.left);
		if(t > k)return select(x.left,k);
		if(t < k)return select(x.right,k-t-1);
		else return x; 
	}
	
	public Node deleteMin(Node x){
		if(x.left==null)return x.right;
		x.left=deleteMin(x.left);
		x.N= size(x.left)+size(x.right)+1;
		return x;
	}
	
	public void delete(Key key){
		root= delete(root, key);
	}
	
	public Node delete(Node x, Key key){
		if(x==null)return null;
		int cmp= key.compareTo(x.key);
		if(cmp < 0) x.left= delete(x.left,key);
		if(cmp >0)x.right= delete(x.right,key);
		else{
			if(x.left==null)return x.right;
			if(x.right==null)return x.left;
			Node t =x;
			x= minNode(t.right);
			x.right=deleteMin(t.right);
			x.left= t.left;
			}
		x.N= size(x.left)+ size(x.right)+1;
		return x;
	}
	
}
