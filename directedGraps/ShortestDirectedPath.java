package directedGraps;

import general.GraphDef.Queue;

public class ShortestDirectedPath {

	public boolean[] marked;
	public int[] edgeTo;
	public int[] distTo;

	public void ShortestDirectedPath(Graph G, int s){
		marked= new boolean[G.V()];
		edgeTo = new int[G.V()];
		
		for(int v=0; v< G.V();v++){
			distTo[v]= Integer.MAX_VALUE;
		}
		
		bfs(G,s);
		
	}
	
	public void bfs(Graph G, int s){
		Queue<Integer> q = new Queue<Integer>();
		q.enqueue(s);
		marked[s]= true;
		distTo[s]=0;
		while(!q.isEmpty()){
			int v= q.dequeue();
			for(int w : G.adj(v)){
				if(!marked[w]){
					marked[w]=true;
					edgeTo[w]= v;
					distTo[w]= distTo[v]+1;
					q.enqueue(w);
				}
			}
		}
		
		
	}
}
