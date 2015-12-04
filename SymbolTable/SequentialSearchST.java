package SymbolTable;

public class SequentialSearchST <Key,Value>{
	
	private Node first;
	
	private class Node{
		
		Key key;
		Value val;
		Node Next;
		
		public  Node(Key key, Value val, Node next){
			this.key= key;
			this.val= val;
			this.Next= next;
			
		}
	}
	
	public  Value get(Key key){
		for(Node x= first; x.Next!= null; x= x.Next){
			if(x.key==key){
				return x.val;
			}
		}
		return null;
		
	}
	
	public void put(Key key, Value val){
		for(Node x= first; x.Next!=null;x= x.Next)
			if(x.key==key){
				x.val=val;
				return;
			}
		
		first= new Node(key,val,first);
	}
	

}
