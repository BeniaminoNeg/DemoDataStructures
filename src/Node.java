/**
 * Created by beniamino on 10/03/2019.
 */
public class Node {
    private int key;
    private Object value;

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    private Node leftChild;
    private Node rightChild;

    //Constructor (?)
    public Node (Integer key, Object value) {
        this.key = key;
        this.value = value;
    }

    //get and set of children
    public void setLeftChild (Node child) {
        this.leftChild=child;
    }

    public Node getLeftChild () {
        return this.leftChild;
    }

    public void setRightChild (Node child) {
        this.rightChild=child;
    }

    public Node getRightChild () {
        return this.rightChild;
    }

    public boolean hasLeftChild (){
        boolean has = false;
        if (this.leftChild != null){
            has=true;
        }
        return has;
    }

    public boolean hasRightChild (){
        boolean has = false;
        if (this.rightChild != null){
            has=true;
        }
        return has;
    }

}
