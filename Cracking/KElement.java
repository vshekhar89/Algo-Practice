package Cracking;

public class KElement {
	
	public static LinkedListNode kthToLast(LinkedListNode head, int k){
		
		if(head==null)
			return null;
		
		LinkedListNode p1=head;
		LinkedListNode p2=head;
		
		for(int i=0; i<k;i++){
			if(p2==null){
				return null;
			}
			p2=p2.next;
		}
		while(p2.next!=null){
			p1=p1.next;
			p2=p2.next;
		}
		
		return p1;
	}

}
