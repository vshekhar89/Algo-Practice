package general.GraphDef;

import java.util.Scanner;

public class isConnected {

	static boolean[] visited;

	public static void main(String args[]) {

		/* Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the number of vertex");
		 int v = sc.nextInt();
		 Graph G = new Graph(v);
		 visited = new boolean[v];
		 System.out.println("Enter the number of edges");
		 int e = sc.nextInt();
		 for(int i=0; i< e;i++){
		 System.out.println("First edge from:");
		 int u= sc.nextInt();
		 System.out.println("to");
		 int w= sc.nextInt();
		 System.out.println("Added egde between: "+ u +"and" +w);
		 G.addEdge(u, w);
		 }*/

		Graph G = new Graph(10);
		int v = 10;
		visited = new boolean[v];
		G.addEdge(0, 1);
		G.addEdge(1, 2);
		G.addEdge(2, 3);
		G.addEdge(1, 3);
		G.addEdge(7, 6);
		G.addEdge(6, 8);
		G.addEdge(8, 9);
		G.addEdge(9, 6);
		G.addEdge(5, 4);
		G.addEdge(4, 3);
		

		for (int i = 0; i < v; i++) {
			// System.out.println(G.adj(i));
			System.out.println(i + "is connected to " + G.adj(i));
			// System.out.println(G.adj(i));
		}

		boolean result = dfs(G, 9, 4);
		System.out.println(result);
	}

	public static boolean dfs(Graph G, int v, int u) {

		visited[v] = true;
		if (v == u)
			return true;
		for (int w : G.adj(v)) {
			//System.out.println(w);
			if (!visited[w] && dfs(G, w, u)) {
				return true;
			}
		}

		return false;
	}

}
