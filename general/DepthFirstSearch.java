package general;

public class DepthFirstSearch {
	
	boolean marked[];
	int count;
	
	
	public DepthFirstSearch(Graph G, int s){
		marked= new boolean[G.V()];
		dfs(G,s);
		
	}
	
	public void dfs(Graph G, int v){
		count++;
		marked[v]= true;
		for(int w : G.adj(v)){
			if(!marked[w]){
				dfs(G,w);
			}
		}
	}
	
	public boolean isMarked(int v){
		return marked[v];
	}
	
	public int count(){
		return count;
	}

}
