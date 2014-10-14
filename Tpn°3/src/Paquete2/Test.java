package Paquete2;
import java.util.ArrayList;
public class Test {

	public static void main(String[] args) {
		
		System.out.println(Primo.esPrimo(90));
		System.out.println(Primo.esPrimo(7));
		
		ArrayList<Integer> lista = new ArrayList<Integer>(); 
		for (int i=1;i<100;i++) { 
		if (Primo.esPrimo(i)) lista.add(i); 
		} 
		System.out.println(lista); 
		}
	
	
}

