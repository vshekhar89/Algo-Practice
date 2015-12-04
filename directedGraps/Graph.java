package directedGraps;

import java.util.LinkedList;
import java.util.Stack;

import javax.management.RuntimeErrorException;

public class Graph {
	
	private  int v;
	private Integer e;
	private LinkedList<Integer>[] adj;
	
	public void Graph(int V){
		if(V< 0)throw new RuntimeException("Vertices cannot be less than 0");
		this.v=V;
		this.e= 0;
		
		for(int v=0; v<V;v++){
			adj[v]= new LinkedList<Integer>();
		}
	}
	
	public int V(){
		return v;
	}
	
	public Integer E(){
		return e;
	}
	
	public LinkedList<Integer> adj(int v){
		return adj[v];
	}
	
	public void addEdge(int v, int u){
		adj[v].add(u);
		e++;
	}
	
	public void Graph(Graph G){
		this.v= G.V();
		this.e=G.E();
		
		Stack<Integer> reverse= new Stack<Integer>();
		for(int v=0;v<G.v;v++){
			for(int w :G.adj(v)){
				reverse.push(w);
			}
			for(int w:reverse){
				adj[v].add(w);
			}
		}
	}

}
