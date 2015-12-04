import java.util.LinkedList;


public class sortList {

	
	public static LinkedList sortList(LinkedList node , int x){
	LinkedList beforeStart= null;
	LinkedList beforeend =null;
	LinkedList afterstart=null;
	LinkedList afterend=null;
	
	if(node==null) return null;
	while(node!= null){
		if(node.data < x){
			if(beforeStart==null){
				beforeStart = node;
				beforeend=beforeStart;
			}
			beforeend.next=node;
			beforeend=node;
			
		}
		else{
			if(afterstart==null){
				afterstart=node;
				afterend=afterstart;
			}else{
				afterend.next=node;
				afterend=node;
			}
		}
		node=node.next;
	}
	
	
	return (beforeend.=aftertart);
		
	}
}
