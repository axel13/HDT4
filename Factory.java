
import java.util.Scanner;

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
public class Factory {
    
    public Stack StackFactory(){
	Scanner teclado = new Scanner(System.in);
	int ingreso = 0;
	int op = 0;
	Object stackOp;
		
        stackOp = new Object();
	while(op <= 3){
	System.out.println("\n");
	System.out.println("Escoja su opcion favorita:");
	System.out.println("1. ArrayList");
	System.out.println("2. Vector");
	System.out.println("3. Lista");
	
        try{
            ingreso = teclado.nextInt();
            switch (ingreso){
                case 1:
                    System.out.println("ArrayList");
                    StackArrayList array = new StackArrayList();
                    stackOp = array;
                    op = 4;
                    break;
		case 2:
                    StackVector Objeto1 = new StackVector();
                    System.out.println("Vector");
                    stackOp = Objeto1;
                    op = 4;
                    break;
		case 3:
                    System.out.println("List");
                    StackList Objeto2= new StackList();
                    stackOp = Objeto2;
                    op = 4;
                    break;
			
            }
	}
	catch(Exception e){
            System.out.println("Seleccione una opcion correcta\n");
            teclado.nextLine();
	}	
		
	}
        
	return (Stack) stackOp;
	}
    
    
}
