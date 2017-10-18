package homework01_1;

import java.util.LinkedList;

/**
 * Created by Duan Guanhua on 2017/10/13.
 */
public class LinkedStack<T> {
    private LinkedList<T> linkedList = null;

    public LinkedStack() {
        linkedList = new LinkedList<T>();
    }

    public void push(T t) {
        linkedList.addFirst(t);
    }

    public T pop() {
        return linkedList.removeFirst();
    }

    public T peek(){
        return linkedList.peekFirst();

    }
    public int size() {
        return linkedList.size();
    }

    void clear() {
        linkedList.clear();
    }


    public boolean isEmpty() {
        return linkedList.size() == 0;
    }
}

