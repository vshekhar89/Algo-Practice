package directedGraps;

import java.util.Stack;

public class DirectedPath {
	
	public boolean[] marked;
	public int[] edgeTo;
	public int s;
	
	public void DirectedPath(Graph G, int s){
		this.marked= new boolean[G.V()];
		this.edgeTo = new int[G.V()];
		this.s= s;
		dfs(G, s);
	}
	
	public void dfs(Graph G, int s){
		marked[s]= true;
		for(int w : G.adj(s)){
			if(!marked[w]){
				marked[w]= true;
				edgeTo[w]= s;
				dfs(G,w);
			}
		}
	}
	
	public boolean hasPath(int v){
		return marked[v];
	}
	
	public Iterable<Integer> path(int v){
		if(!marked[v]) return null;
		Stack<Integer> path = new Stack<>();
		for(int x=v; x!=s; x= edgeTo[x]){
			path.push(x);
		}
		return path;
	}
	
}
