package Cracking;

public class SeparateNodes {
	
	public static LinkedListNode separate(LinkedListNode node , int x){
		if(n==null)return null;
		
		LinkedListNode head=node;
		LinkedListNode tail= node;
		
		while(node!= null){
			LinkedListNode next = node.next;
			
			if(node.data <x){
				node.next= head;
				head=node;
			
			}else{
				tail.next= node;
				tail=node;
			}
			node=node.next;
		}
		tail.next=null;
		return head;
	}

}
