package general;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Graph {

	private final int V;
	private int E;
	//Bag<Integer>[] adj;
	ArrayList<Integer>[] adj;
	
	public Graph(int V){
		this.V=V;
		this.E=0;
		adj=  (ArrayList<Integer>[]) new ArrayList[V];
		for(int v=0; v<v; v++){
			adj[v] = new ArrayList<Integer>();
		}
		
	}
	
	public int V(){
		return this.V;
	}
	
	public int E(){
		return this.E;
	}
	
	public void validateVertex(int v){
		if(v< 0 || v > this.V){
			throw new IndexOutOfBoundsException();
		}
	}
	
	public void addEdge(int v, int w){
		validateVertex(v);
		validateVertex(w);
		adj[v].add(w);
		adj[w].add(v);
	}
	
	public ArrayList<Integer> adj(int v){
		return adj[v];
	}
	
	public Integer degree(int v){
		return adj[v].size();
	}
	
	 public String toString() {
	        StringBuilder s = new StringBuilder();
	        String NEWLINE = System.getProperty("line.separator");
	        s.append(V + " vertices, " + E + " edges " + NEWLINE);
	        for (int v = 0; v < V; v++) {
	            s.append(v + ": ");
	            for (int w : adj[v]) {
	                s.append(w + " ");
	            }
	            s.append(NEWLINE);
	        }
	        return s.toString();
	    }
		
}
