package facebook;

import java.util.LinkedList;

public class isConnected {
	
	public enum State{
		VISITED, UNVISITED, VISITING;
	}
	
	public static boolean isConnected(Graph g, Node start, Node end){
		
		if(start==end){
			return true;
		}
		
		for(Node u : g.getNodes()){
			u.state= State.UNVISITED;
		}
		
		LinkedList<Node> q = new LinkedList<Node>();
		start.state= State.VISITED;
		q.enqueue(start);
		Node u;
		
		while(!q.isEmpty()){
			u= q.dequeue();
			if(u!=null){
			for(Node v: u.getAdjecentNodes()){
				if(v.state==State.UNVISITED){
					if(v==end){
						return true;
					}else{
						v.state= State.VISITING;
						q.enqueue(v);
					}
				}
			}
			u.state=State.VISITED;
			}
		}
		return false;
		
		
	}

}
