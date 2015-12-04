package Cracking;

import java.util.HashSet;
import java.util.LinkedList;

public class RemoveDups {

	public static void removeDups(LinkedListNode n){
		HashSet<Integer> set = new HashSet<Integer>();
		
		LinkedListNode previous= null;
		
		while(n!=null){
			if(set.contains(n.data)){
				previous.next= n.next;
				
			}else{
				set.add(n.data);
				previous=n
			}
			n=n.next;
		}
	}
	
	public static void removeDuplics(LinkedListNode head){
		if(head==null)return;
		
		LinkedListNode current = head;
		
		while(current!= null){
			LinkedListNode runner = current;
			while(runner.next!= null){
				if(runner.next.data== runner.data){
					runner.next= runner.next.next;
				}else{
					runner=runner.next
				}
			}
			current=current.next;
		}
	}i
}
