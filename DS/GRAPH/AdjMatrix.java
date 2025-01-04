public class AdjMatrix{
    int[][] adjMatrix;
    public AdjMatrix(int nodes){
        this.adjMatrix = new int[nodes][nodes];

    }
    public void addEdge(int u,int v){
        this.adjMatrix[u][v] = 1;
        this.adjMatrix[v][u] = 1;

    }
    public static void main(String[] args) {
        AdjMatrix obj = new AdjMatrix(4);
        obj.addEdge(0, 1);
        obj.addEdge(1, 2);
        obj.addEdge(2, 3);
        obj.addEdge(3, 0);
    }

    
}