package GraphsExercise;

public class MarkedVertex extends MyVertex {
    private boolean isMarked;
    public MarkedVertex(Object object) {
        super(object);
        isMarked=false;
    }

    public boolean isMarked() {
        return isMarked;
    }

    public void mark() {
        isMarked = true;
    }

    public void unmark (){
        isMarked=false;
    }
}
