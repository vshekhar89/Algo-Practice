package general.GraphDef;

import java.util.ArrayList;

public class Graph {
	
	private final int V;
	private int E;
	private ArrayList<Integer>[] adj;
	
	public Graph(int v){
		this.V= v;
		this.E=0;
		adj= (ArrayList<Integer>[])new ArrayList[v+1];
		for(int i=0; i<v;i++){
			adj[i]= new ArrayList<Integer>();
		}
	}
	
	public int V(){
		return this.V;
	}
	
	public int E(){
		return this.E;
	}
	
	public boolean validateVertex(int v){
		if(v >= 0 && v <= this.V){
			return true;
		}else{
			throw new IndexOutOfBoundsException();
		}
	}
	
	public ArrayList<Integer> adj(int v){
		return adj[v];
	}
	
	public void addEdge(int v , int w){
		validateVertex(v);
		validateVertex(w);
		adj[v].add(w);
		adj[w].add(v);
	}
	
	public int degree(int v){
		return adj[v].size();
	}
	
	

}
