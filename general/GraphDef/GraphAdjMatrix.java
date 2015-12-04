package general.GraphDef;

public class GraphAdjMatrix {

	private final int V;
	private int E;
	private boolean[][] adj;
	
	
	public GraphAdjMatrix(int v){
		this.V=v;
		this.E=0;
		adj= new boolean[V][V];
	}
	
	public GraphAdjMatrix(int v , int E){
		this.V=v;
		if(E < 0)throw new RuntimeException("Edges cannot be less tha zero");
		if(E >(V * (V-1))) throw new RuntimeException("Too many edges");
		while(this.E != E){
			int x= (int)(V * Math.random());
			int y = (int)(V * Math.random());
			
			addEdge(x,y);
		}
	}
	
	public void addEdge(int v, int w){
		if(v < this.V && w < this.V){
			adj[v][w]= true;
			
			E++;
		}
	}
	
	public boolean contains(int v, int w){
		return adj[v][w];
	}
}
