package general.GraphDef;

public class Cycle {
	
	public Integer[] marked;
	public Integer[] edgeTo;
	public Integer[] cycle;
	
	public void Cycle(Graph G){
		marked = new Integer[G.V()];
		edgeTo= new Integer[G.V()];
	}

}
