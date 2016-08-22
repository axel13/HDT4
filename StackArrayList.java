
import java.util.ArrayList;

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
public class StackArrayList<E> extends Stack<E> {
    
    private ArrayList<Object> array;
    
    public StackArrayList(){
        this.array = new ArrayList<>();
	this.array.add(0);
    }

    @Override
    public void push(E data) {
        this.array.add(data);
    }

    @Override
    public E pop() {
        Object gru = this.array.toArray()[this.array.size()-1];
	this.array.remove(this.array.size()-1);
	return (E) gru;
    }
    
    
    
    
}
