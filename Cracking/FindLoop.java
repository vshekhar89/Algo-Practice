package Cracking;

public class FindLoop {

	public static LinkedListNode findLoop(LinkedListNode node){
		if(node==null){
			return null;
		}
		
		LinkedListNode fast=node;
		LinkedListNode slow= node;
		
		while(fast.next!= null && fast.next.next! null){
			fast.next= fast.next.next;
			slow= slow.next;
			if(slow==fast){
				break;
			}
		}
		
		if(fast==null || fast.next==null){
			return null;
		}
		
		slow=head;
		while(slow!=fast){
			slow=slow.next;
			fast=fast.next;
		}
		
		return fast;
		
		
	}
}
