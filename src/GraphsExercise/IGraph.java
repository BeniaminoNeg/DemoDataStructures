package GraphsExercise;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by beniamino on 11/03/2019.
 */
public interface IGraph {
    int numVertici();
    int numArchi();
    int grado(MyVertex vertex);
    void addVertex(MyVertex vertex);
    void addEdge(MyVertex x, MyVertex y);
    void removeVertex(MyVertex vertex);
    void removEdge(MyVertex x, MyVertex y);
    List<MyVertex> getNeihbors (MyVertex x);
    List<MyVertex> getVertices();
}
