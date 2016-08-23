/**
 *
 * Axel Mazariegos 131212
 * Gustavo Orellana 15073 
 */
import java.util.*;
public class main {
    public static void main(String[] args){
        Scanner texto = new Scanner(System.in);
        String Archivo;
        
        try{
            System.out.println ("Nombre del archivo, incluir extension (.txt): " );
            Archivo = texto.next();
            
            BufferedReader br = new BufferedReader(new FileReader(Archivo));
            try {
                String line = br.readLine();

                while (line != null) {
                    lines.add(line);
                    line = br.readLine();
                }    
            } finally {
            br.close();
            }
            
            
            
        }
        
        catch(Exception e)
		{
			System.out.println("no se encontro archivo solicitado/ \nno esta bien definida la operacion");
		}
    }
}
