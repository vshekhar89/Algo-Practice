package SymbolTable;

import SymbolTableRedo.BinarySearchTree.Node;

public class SearchBST <Key extends Comparable<Key>, Value> {

	private Node root;
	
	private class Node{
		private Node left,right;
		Key key;
		Value value;
		int n;
		
		public Node(Key key, Value val, int N){
			this.key=key;
			this.value=val;
			this.n=N;
		}
	}
	
	public Value get(Key key){
		return getValue(key, root).value;
	}
	
	public int size(Node x){
		return size(x.left)+size(x.right)+1;
		
	}
	
	public Node getValue(Key key, Node x){
		if(x==null)return null;
		
		int cmp = key.compareTo(x.key);
		if(cmp < 0)return getValue(key, x.left);
		else if(cmp > 0)return  getValue(key,x.right);
		else return x;
	}
	
	public void put(Key key, Value val){
		root= put(key,val,root);
	}
	
	public Node put(Key key, Value val, Node x){
		if(x==null)return null;
		int cmp=key.compareTo(x.key);
		if(cmp< 0)x=put(key, val,x.left);
		else if(cmp > 0)x=put(key,val,x.right);
		else{
			x.value=val;
			x.n= size(x.left)+size(x.right)+1;
		}
		return x;
	}
	
	public Node deleteMin(Node x){
		if(x.left==null)return x.right;
		x.left=deleteMin(x.left);
		x.n= size(x.left)+size(x.right)+1;
		return x;
	}
	
	public Key floor(Key key){
		return FloorNode(root, key).key;
	}
	public Node FloorNode(Node x, Key key){
		if(x==null)return null;
		int cmp= key.compareTo(x.key);
		if(cmp < 0)return FloorNode(x.left,key);
		if(cmp ==0)return x;
		Node t= FloorNode(x.right,key);
		if(t!=null)return t;
		else return x;
	}
	
	public int rank(Key key){
		return rank(root, key);
	}
	
	public int rank(Node x, Key key){
		if(x== null)return 0;
		int cmp=key.compareTo(x.key);
		if(cmp < 0)return rank(x,key);
		if(cmp > 0)return 1 + size(x.left)+rank(x.right,key);
		else return size(x.left);
	}
	
	public Key select(int k){
		return select(root, k).key;
	}
	
	public Node select(Node x, int k){
		if(x==null)return null;
		int t = size(x.left);
		if(t > k)return select(x.left,k);
		if(t < k)return select(x.right,k-t-1);
		else return x;
	}
	
	public void delete(Key key){
		root= deleteNode(root, key);
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
	public Node deleteNode(Node x, Key key){
		if(x==null)return null;
		int cmp= key.compareTo(x.key);
		if(cmp < 0)x.left= deleteNode(x.left,key);
		if(cmp > 0)x.right= deleteNode(x.right,key);
		else{
			if(x.left==null)return x.right;
			if(x.right==null)return x.left;
			Node t = x;
			x= minNode(t.right);
			x.right= deleteMin(t.right);
			x.left= t.left;
		}
		x.n= 1 + size(x.left)+ size(x.right);
		return x;
		
	}
	
}
