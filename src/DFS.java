import java.util.*;

public class DFS {

    private int V;
    private LinkedList<Integer> adj[];

    // Constructor
    DFS(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList<>();
    }


    void addEdge(int v, int w) {
        adj[v].add(w);
    }


    void DFSUtil(int v, boolean visited[]) {
        // Mark the current node as visited and print it
        visited[v] = true;
        System.out.print(v + " ");


        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }


    void DFS(int v) {
        // Mark all the vertices as not visited
        boolean visited[] = new boolean[V];


        DFSUtil(v, visited);
    }

    public static void main(String args[]) {
        DFS g = new DFS(11); // Number of vertices is 11 (1 to 10)

        // Add edges to the graph
        g.addEdge(1, 2);
        g.addEdge(2, 4);
        g.addEdge(4, 3);
        g.addEdge(1, 5);
        g.addEdge(5, 6);
        g.addEdge(5, 8);
        g.addEdge(8, 10);
        g.addEdge(10, 9);
        g.addEdge(5, 7);


        System.out.println("Depth First Traversal starting from node 1:");
        g.DFS(1);
    }
}
