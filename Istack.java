/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * Axel Mazariegos 131212
 * Gustavo Orellana 15073
 */
public interface Istack<E> {
    
    /**
     *
     * @param data
     */
    public void push(E data);
    
    /**
     *
     * @return
     */
    public E pop();
    
}
