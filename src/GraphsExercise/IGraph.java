package GraphsExercise;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by beniamino on 11/03/2019.
 */
public interface IGraph {
    int numVertici();
    int numArchi();
    int grado(MarkedVertex vertex);
    void addVertex(MarkedVertex vertex);
    void addEdge(MarkedVertex x, MarkedVertex y);
    void removeVertex(MarkedVertex vertex);
    void removEdge(MarkedVertex x, MarkedVertex y);
    List<MarkedVertex> getNeihbors (MarkedVertex x);
    List<MarkedVertex> getVertices();
    MarkedVertex fisrtVertex();
    boolean isEmpty();
}
