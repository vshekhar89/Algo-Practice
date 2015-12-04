package general;

public class AdjMatrixGraph {
	
	private int V;
	private int E;
	private Boolean[][] adj; 

	
	public AdjMatrixGraph(int V){
		if(V < 0){
			throw new RuntimeException("No of Vertices cannot ne zero");
		}
		this.V=V;
		this.E=0;
		adj= new Boolean[V][V];
	}
	
	public AdjMatrixGraph(int V, int E){
		this(V);
		if(E < 0)throw new RuntimeException("No of edges cannot be zero");
		if(E > (V * (V-1))) throw new RuntimeException("Too many edges");
		
		while(this.E != E){
			int v = (int)(V* Math.random());
			int w = (int)(V* Math.random());
			
			addEdge(v, w);
			
		}
	}
	
	public void addEdge(int v , int w){
		if(!adj[v][w])E++;
		adj[v][w]= true;
		
	}
	
	public boolean contains(int w, int v){
		return adj[w][v];
	}
	
}
