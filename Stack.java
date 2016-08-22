/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Axel
 */
public abstract class Stack<E> {
    /**
     *
     * @param data
     */
    public abstract void push(E data);
    
    /**
     *
     * @return E
     */
    public abstract E pop();
    
}
