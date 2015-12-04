package general.GraphDef;

import java.util.Stack;

public class ShortestPath {

	public Boolean[] marked;
	public Integer[] edgeTo;
	public Integer[] distTo;
	
	
	public void ShortestPath(Graph G, Integer s){
		marked = new Boolean[G.V()];
		edgeTo = new Integer[G.V()];
		distTo= new Integer[G.V()];
		bfs(G,s);
	}
	
	public void bfs(Graph G, int s){
		Queue<Integer> q = new Queue<Integer>();
		for(int v=0; v<G.V();v++){
			distTo[v]= Integer.MAX_VALUE;
		}
		marked[s]= true;
		distTo[s]=0;
		q.enqueue(s);
		while(!q.isEmpty()){
			int v= q.dequeue();
			for(int w : G.adj(v)){
				if(!marked[w]){
					marked[w]= true;
					edgeTo[w]= v;
					distTo[w]= distTo[v]+1;
					q.enqueue(w);
				}
			}
		}
		
		
	}
	
	public boolean hasPath(int v){
		return marked[v];
	}
	
	public Stack<Integer> path(int v){
		Stack<Integer> s = new Stack<Integer>();
		int x;
		for(x= v; distTo[x]==0; x= edgeTo[x]){
			s.add(x);
		}
		s.add(x);
		return s;
	}
	
	
}
