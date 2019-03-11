import java.util.*;

/**
 * Created by beniamino on 06/10/18.
 */
public class Main {

    void  Fed (){
        //ArrayList<Integer> de = new ArrayList<Integer>(3,  6 , 5 );
        Integer d = new Integer(8);
        double dd = d;
        double ee = 4;
        Integer eee = new Integer((int)ee);



        List<Integer> lista = new ArrayList<Integer>();
        lista.add(7);
        lista.add(0,9);

        System.out.println(lista.toString());

        System.out.println(lista.size());
        lista.get(0);
        lista.set(0,13);

        System.out.println(lista.toString());

        List lisdue = new ArrayList();
        lisdue.add("pip");
        lisdue.add("plu");
        lisdue.add(3);

        System.out.println(lisdue.toString());

        int [] arr = new int[15];

        List<Integer> linked = new LinkedList<Integer>();
        linked.add(5);
        List linked2 = new LinkedList();
        linked2.add("pippo");
        linked2.add(3);
        linked2.set(0,7);

        Stack stack = new Stack();
        stack.push(3);
        stack.push(7);
        System.out.println(stack.pop().toString());
        System.out.println(stack.peek());
        System.out.println(stack.peek());

        Queue queue = new PriorityQueue();
        queue.add(4);
        queue.add(8);
        System.out.println(queue.remove());

        Queue lindedlistqueue = new LinkedList();

        Vector vector = new Vector();
        vector.add(3);

        Set set = new HashSet();

        set.add(3);
        set.add(5);
        set.add(3);

        System.out.println(set);

        Map hashtable = new Hashtable();

        Hashtable hashtable1 = new Hashtable();

        Map map4 = new TreeMap();

        TreeMap treeMap = new TreeMap();

        








    }





}
