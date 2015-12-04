package general.GraphDef;

import java.util.Queue;

//used to find the shortest path between a source or list of sources and a destination vertex
public class BreadthFirstSearch {
	public static final int IFINITY= Integer.MAX_VALUE;
	private int[] edgeTo;
	private int[] distTo;
	private boolean marked[];
	
	
	public BreadthFirstSearch(Graph G, int s){
		edgeTo = new int[G.V()];
		marked= new boolean[G.V()];
		distTo = new int[G.V()];
		
	}
	
	public void bfs(Graph G, int s){
		
		Queue<Integer> q = new Queue<Integer>();
		marked[s]=true;
		distTo[s]=0;
		q.add(s);
		
		while(!q.isEmpty()){
			int v = q.remove();
			for(int w :G.adj(v)){
				if(!marked[w]){
					marked[w]=true;
					edgeTo[w]=v;
					distTo[w]= distTo[v]+1;
					q.add(w);
				}
				
			}
		}
		
		
	}
	

}
