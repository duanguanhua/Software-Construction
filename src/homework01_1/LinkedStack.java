package homework01_1;

import java.util.LinkedList;

/**
 * Created by Duan Guanhua on 2017/10/13.
 */
public class LinkedStack {
    private LinkedList list = new LinkedList<>();

    public void push(Object object) {
        list.addFirst(object);
    }

    public Object pop() {
        return list.removeFirst();
    }

    public Object peek() {
        return list.getFirst();
    }

    public int size() {
        return list.size();

    }

    void clear() {
        list = null;
    }


    public boolean isEmpty() {
        return list.isEmpty();
    }
}

