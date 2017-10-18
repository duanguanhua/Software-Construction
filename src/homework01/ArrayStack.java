/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework01;


/**
 * @author Duan Guanhua
 */
public class ArrayStack implements Stack {
    final private static int DEFAULT_SIZE = 16;
    private Object[] datas;
    private int top = 0;

    ArrayStack() {
        datas = new Object[DEFAULT_SIZE];
        top = 0;
    }

    @Override
    public void push(Object e) {
        if (top >= datas.length) {
            Object[] temp = new Object[top * 2];
            System.arraycopy(datas, 0, temp, 0, top);
            datas = temp;
        }
        datas[top] = e;
        top++;
    }

    @Override
    public Object pop() {
        if (isEmpty()) {
            return null;
        }
        top--;
        return datas[top];
    }

    @Override
    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        return datas[top - 1];
    }

    @Override
    public void clear() {
        while (top > 0) {
            top--;
            datas[top] = null;
        }
    }

    @Override
    public int size() {
        return top;
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }
}
