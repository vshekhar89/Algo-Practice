package directedGraps;

public class AdcencyMatrix {

	private int V;
	private int E;
	private boolean[][] adj;
	
	public void AdjecencyMatrix(int v){
		this.V=v;
		this.E=0;
		this.adj= new boolean[v][v];
	}
	
	public int V(){
		return this.V;
	}
	
	public int E(){
		return this.E;
	}
	
	public int[] adj(int v){
		int[] neigbour= new int[this.V];
		int count=0;
		for(int w=0; w<this.V;w++){
			if(adj[v][w]){
				neigbour[count]=w;
				count++;
			}
		}
			return neigbour;
	}
	
	public void addEdge(int v, int u){
		if(!adj[v][u]){
			adj[v][u]=true;
			E++;
		}
	}
	
}
