package directedGraps;

public class DirectedDFS {
	
	public boolean[] marked;
	public int count=0;
	
	public void DirectedDFS(Graph G, int s){
		marked= new boolean[G.V()];
		dfs(G,s);
	}
	
	public void dfs(Graph G, int s){
		count++;
		marked[s]= true;
		for(int w:G.adj(s)){
			if(!marked[w]){
				marked[w]=true;
				dfs(G,w);
			}
		}
	}
	
	public boolean isConnected(int w){
		return marked[w];
	}
	
	public int count(){
		return count;
	}

}
