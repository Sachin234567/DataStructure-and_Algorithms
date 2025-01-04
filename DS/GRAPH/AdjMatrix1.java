public class AdjMatrix1 {
    private int V;
    private int E;
    private int[][] adjacent;
    public AdjMatrix1(int nodes){
        this.V = nodes;
        this.E = 0;
        this.adjacent = new int[nodes][nodes];

    }
    public void addEdge(int u, int v){
        adjacent[u][v] = 1;
        adjacent[v][u] = 1;
        E++;
    }
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(V + "vertices," + E + "Edges" +"\n" );
        for(int v = 0; v < V; v++){
            sb.append(v + " : ");
            for(int w:adjacent[v]){
                sb.append(w + " ");

            }
            sb.append("\n");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        AdjMatrix1 obj = new AdjMatrix1(4);
        obj.addEdge(0, 1);
        obj.addEdge(1, 2);
        obj.addEdge(2, 3);
        obj.addEdge(3, 0);
        System.out.println(obj);
    }


    
}
