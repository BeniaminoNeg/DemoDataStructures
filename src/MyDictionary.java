/**
 * Created by beniamino on 10/03/2019.
 */
public interface MyDictionary {

    public Object search(int key);

    public boolean insert (Node node);

    public boolean delete(int key);
}
