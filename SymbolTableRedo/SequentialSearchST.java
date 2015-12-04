package SymbolTableRedo;

public class SequentialSearchST<Key, Value> {
	
	public Node first;
	
	private class Node{
		private Key key;
		private Value val;
		private Node next;
		
		public Node(Key key, Value val, Node next){
			this.key= key;
			this.val=val;
			this.next= next;
		}
	}

	public Value get(Key key){
		
		for(Node x= first; x.next != null; x= x.next){
			if(x.key== key){
				return x.val;
			}
		}
		return null;
	}
	
	public void put(Key key, Value val){
		
		for(Node x= first; x.next != null; x= x.next){
			if(x.key==key){
				x.val= val;return;
			}
		}
		first = new Node(key,val, first); 
		
	}
}
