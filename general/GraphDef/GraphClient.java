package general.GraphDef;

public class GraphClient {

	
	public static int degree(Graph G, int v){
		int degree=0;
		
		for(int w : G.adj(v)){
			degree++;
		}
		
		return degree;
	}
	
	public static int  maxDegree(Graph G){
		int max=0;
		
		for(int v=0; v<G.V();v++){
			if(G.degree(v)> max){
				max =G.degree(v);
			}
		}
		return max;
	}
	
	
	public static int selfLoops(Graph G){
		int selfloops=0;
		
		for(int v=0 ; v<G.V();v++){
			for(int w : G.adj(v)){
				if(v==w){
					selfloops++;
				}
			}
		}
		return selfloops;
	}
}
