/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homework01;

/**
 * @author
 */
public interface Stack {
    Object pop();  //out

    Object peek(); //top one

    void push(Object e);    //in

    void clear();

    int size();

    boolean isEmpty();
}
