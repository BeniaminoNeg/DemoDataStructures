/**
 * Created by beniamino on 10/03/2019.
 */
public class MyBynaryTree implements MyDictionary{
    private Node root;

    public MyBynaryTree () {
        root = null;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    @Override
    public Object search(int key) {
        Object lookedFor = null;
        Boolean founded = false;
        Boolean hasChild = true;
        if (root==null){
            hasChild=false;
        }
        Node currentNode = root;
        while (!founded && hasChild){
            if (currentNode.getKey() == key){
                founded = true;
                lookedFor = currentNode;
            }
            else {
                if (key < currentNode.getKey()){
                    if (currentNode.hasLeftChild()){
                        currentNode=currentNode.getLeftChild();
                    }
                    else hasChild=false; //We found that the key is not in the tree
                }
                else {// This is the case in wich the element could be in the right sub-tree
                    if (currentNode.hasRightChild()) {
                        currentNode=currentNode.getRightChild();
                    }
                    else hasChild=false;
                }
            }
        }
        return lookedFor;
    }

    @Override
    public boolean insert(Node node) {
        boolean done = false;
        boolean isPresent = false;
        if (root==null){
            root=node;
            done=true;
        }
        if (root.getKey()==node.getKey()){
            //key already exist
            isPresent=true;
            done=true;
        }
        Node currentNode = root;
        int newKey = node.getKey();
        while (!done){
            if (currentNode.getKey()>newKey){
                if (currentNode.hasLeftChild()){
                    currentNode=currentNode.getLeftChild();
                }
                else {
                    done=true;//il current è il padre e lo metto a sinistra
                    currentNode.setLeftChild(node);
                }
            }
            else {
                //right subtree
                if (currentNode.hasRightChild()) {
                    currentNode=currentNode.getRightChild();
                }
                else {
                    done=true; //il current è il padre e lo metto a destra
                    currentNode.setRightChild(node);
                }
            }
            if (!done){
                if (currentNode.getKey()==newKey){
                    isPresent=true;
                    done=true;
                }
            }
        }
        return isPresent;
    }

    @Override
    public boolean delete(int key) {
        return false;
    }
}
