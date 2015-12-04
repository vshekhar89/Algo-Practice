package general;



public class GraphClient {

	//degree of a node
	public static Integer degree(Graph G, int v){
		int degree=0;
		
		for(int w : G.adj(v)){
			degree++;
		}
		
		return degree;
	}
	
	//max degree of the graph
	public static Integer maxDegree(Graph G){
		int max=0;
		
		for(int v=0; v< G.V();v++){
			if(G.degree(v)> max){
				max= degree(G,v);
			}
		}
		
		return max;
	}
	
	//number of self loops
	public static Integer selfLoops(Graph G){
		int self=0;
		
		for(int v=0; v< G.V();v++){
			for(int w : G.adj(v)){
				if(v==w){
					self++;
				}
			}
		}
		return self/2;
	}
}
