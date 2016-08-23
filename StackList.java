
import java.util.LinkedList;
/**
 *
 * Axel Mazariegos 131212
 * Gustavo Orellana 15073
 */
public class StackList<E> extends Stack<E> {
    
    private LinkedList<Object> list;
    
    public StackList(){
        this.list = new LinkedList<>();
        this.list.add(0);
    }
   
    @Override
    public void push(E data) {
        }

    @Override
    public E pop() {
        }
    
    
    
}
