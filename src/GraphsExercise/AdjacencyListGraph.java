package GraphsExercise;

import java.util.*;

/**
 * Created by beniamino on 11/03/2019.
 */
public class AdjacencyListGraph implements IGraph {
    private Map<MyVertex, ArrayList<MyVertex>> adjacencyList;

    public AdjacencyListGraph() {
        this.adjacencyList = new HashMap<MyVertex, ArrayList<MyVertex>>();
    }

    @Override
    public int numVertici() {
        return 0;
    }

    @Override
    public int numArchi() {
        return 0;
    }

    @Override
    public int grado(MyVertex vertex) {
        return 0;
    }

    @Override
    public void addVertex(MyVertex vertex) {
        if (!isPresent(vertex)){
            this.adjacencyList.put(vertex,new ArrayList<MyVertex>());
        }

    }

    private boolean isPresent(MyVertex vertex) {
        return false;
    }

    @Override
    public void addEdge(MyVertex x, MyVertex y) {
        List<MyVertex> xNeighbors = this.adjacencyList.get(x);
        if (!xNeighbors.contains(y)){
            this.adjacencyList.get(x).add(y);
            this.adjacencyList.get(y).add(x);//Non oriented case
        }

    }

    @Override
    public void removeVertex(MyVertex vertex) {

    }

    @Override
    public void removEdge(MyVertex x, MyVertex y) {

    }

    @Override
    public List<MyVertex> getNeihbors(MyVertex x) {
        List<MyVertex> neighbors = this.adjacencyList.get(x);
        return neighbors;
    }

    @Override
    public List<MyVertex> getVertices() {
        Set<MyVertex> vertexs = this.adjacencyList.keySet();
        List<MyVertex> vertexesList = new ArrayList<>(vertexs);
        return vertexesList;
    }
}
