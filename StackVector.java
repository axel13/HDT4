
import java.util.Vector;

/**
 *
 * Axel Mazariegos 131212
 * Gustavo Orellana 15073
 */
public class StackVector<E> extends Stack<E> {
    
    private Vector<Object> vector;
		
	public StackVector(){
		this.vector = new Vector<>();
		this.vector.add(0);
        }

    @Override
    public void push(E data) {
        this.vector.add(data);
    }

    @Override
    public E pop() {
        Object gru = this.vector.lastElement();
	this.vector.removeElementAt(this.vector.size()-1);
	return (E) gru;
    }
    
    
    
}
