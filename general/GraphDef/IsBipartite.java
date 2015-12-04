package general.GraphDef;

import java.util.Stack;

public class IsBipartite {

	
	public boolean[] color;
	public boolean[] marked;
	public Integer[] edgeTo;
	public Stack<Integer> cycle;
	public boolean isBipartite;
	
	public void IsBipartite(Graph G){
		color = new boolean[G.V()];
		marked= new boolean[G.V()];
		edgeTo= new Integer[G.V()];
		isBipartite = true;
		
		for(int v=0; v<G.V();v++){
			if(!marked[v]){
				dfs(G,v);
			}
		}
		
	}
	
	public void dfs(Graph G, Integer v){
		marked[v] = true;
		
		for(int w : G.adj(v)){
		if(cycle!=null)return;
		
		
			if(!marked[w]){
				edgeTo[w]= v;
				color[w] = !color[v];
				dfs(G,w);
			}
			
			else if(color[w]==color[v]){
				isBipartite= false;
				cycle= new Stack<Integer>();
				cycle.push(w);
				for(Integer x = v; x!=w;x= edgeTo[x]){
					cycle.push(x);
				}
				cycle.push(w);
			}
		}
		
	}
}
