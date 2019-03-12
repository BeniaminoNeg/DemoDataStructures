package GraphsExercise;

import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by beniamino on 12/03/2019.
 */
public class MainGraph {

    public static void main(String [ ] args) {
        //Popoliamo il grafo
        MarkedVertex a = new MarkedVertex('A');
        MarkedVertex b = new MarkedVertex('B');
        MarkedVertex c = new MarkedVertex('C');
        MarkedVertex d = new MarkedVertex('D');
        MarkedVertex e = new MarkedVertex('E');
        MarkedVertex f = new MarkedVertex('F');

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

        //Visitiamo il grafo in DFS
        List<MarkedVertex> visited = new ArrayList<>();
        // We must start from the first
        if (!graph.isEmpty()){
            Stack<MarkedVertex> stack = new Stack();
            stack.push(graph.fisrtVertex());
            //root dell'albero = firstVertex
            graph.fisrtVertex().mark();
            visited.add(graph.fisrtVertex());
            System.out.println("primo:"+graph.fisrtVertex().getObject().toString());
            while (!stack.empty()){
                MarkedVertex current = stack.pop();
                List<MarkedVertex> adjacents = graph.getNeihbors(current);
                for (MarkedVertex neighbor: adjacents
                     ) {
                        if (!neighbor.isMarked()){
                            stack.push(neighbor);
                            neighbor.mark();
                            visited.add(neighbor);
                            //albero.appendiFIglio(current, neighboir)
                        }
                }
            }
            visited.add(graph.fisrtVertex());
        }
        System.out.println("Lista dei vertici");
        for (MarkedVertex current :
                visited) {
            System.out.println(current.getObject().toString());
        }
    }
}
