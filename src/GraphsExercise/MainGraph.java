package GraphsExercise;

/**
 * Created by beniamino on 12/03/2019.
 */
public class MainGraph {

    public static void main(String [ ] args) {
        //Popoliamo il grafo
        MyVertex a = new MyVertex('A');
        MyVertex b = new MyVertex('B');
        MyVertex c = new MyVertex('C');
        MyVertex d = new MyVertex('D');
        MyVertex e = new MyVertex('E');
        MyVertex f = new MyVertex('F');

        IGraph graph = new AdjacencyListGraph();
        graph.addVertex(a);
        graph.addVertex(b);
        graph.addVertex(c);
        graph.addVertex(d);
        graph.addVertex(e);
        graph.addVertex(f);

        graph.addEdge(a,b);
        graph.addEdge(a,d);
        graph.addEdge(c,d);
        graph.addEdge(c,f);
        graph.addEdge(a,e);

        System.out.println(graph);

        //Visitiamo il grafo
    }
}
