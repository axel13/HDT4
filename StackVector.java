
import java.util.Vector;

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
public class StackVector extends Stack {
    
    private Vector<Object> vector;
		
	public StackVector(){
		this.vector = new Vector<>();
		this.vector.add(0);
        }

    @Override
    public void push(Object data) {
        this.vector.add(data);
    }

    @Override
    public Object pop() {
        Object E = this.vector.lastElement();
	this.vector.removeElementAt(this.vector.size()-1);
	return E;
    }
    
    
    
}
