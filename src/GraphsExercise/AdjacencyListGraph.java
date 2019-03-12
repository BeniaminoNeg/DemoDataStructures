package GraphsExercise;

import java.util.*;

/**
 * Created by beniamino on 11/03/2019.
 */
public class AdjacencyListGraph implements IGraph {
    private Map<MarkedVertex, ArrayList<MarkedVertex>> adjacencyList;

    public AdjacencyListGraph() {
        this.adjacencyList = new HashMap<MarkedVertex, ArrayList<MarkedVertex>>();
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
    public int grado(MarkedVertex vertex) {
        return 0;
    }

    @Override
    public void addVertex(MarkedVertex vertex) {
        if (!isPresent(vertex)){
            this.adjacencyList.put(vertex,new ArrayList<MarkedVertex>());
        }

    }

    private boolean isPresent(MarkedVertex vertex) {
        return false;
    }

    @Override
    public void addEdge(MarkedVertex x, MarkedVertex y) {
        List<MarkedVertex> xNeighbors = this.adjacencyList.get(x);
        if (!xNeighbors.contains(y)){
            this.adjacencyList.get(x).add(y);
            this.adjacencyList.get(y).add(x);//Non oriented case
        }

    }

    @Override
    public void removeVertex(MarkedVertex vertex) {

    }

    @Override
    public void removEdge(MarkedVertex x, MarkedVertex y) {

    }

    @Override
    public List<MarkedVertex> getNeihbors(MarkedVertex x) {
        List<MarkedVertex> neighbors = this.adjacencyList.get(x);
        return neighbors;
    }

    @Override
    public List<MarkedVertex> getVertices() {
        Set<MarkedVertex> vertexs = this.adjacencyList.keySet();
        List<MarkedVertex> vertexesList = new ArrayList<>(vertexs);
        return vertexesList;
    }

    @Override
    public MarkedVertex fisrtVertex() {
        MarkedVertex returned = null;
        if (!this.getVertices().isEmpty()){
            System.out.println("stampiao tutti gli elementi");
            for (MarkedVertex current :
                    this.adjacencyList.keySet()) { //nb il metodo keySet è da verificare
                System.out.println(current.getObject().toString());
            }
            returned = this.getVertices().get(0);
            System.out.println("sono nel metodo del grafo e ritorno "+returned.getObject().toString());
        }
        return returned;
    }

    @Override
    public boolean isEmpty() {
        return this.getVertices().isEmpty();
    }
}
