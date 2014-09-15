package Paquete2;
import Paquete2.Primo;
public class Test1y2 {

	public static void main(String[] args) {
	
	int n1=7;
	int n2=15;
	int n3=5;	
	int n4= 11;	
	int n5=20;	
		
	System.out.println(n1+" Es numero primo? "+Primo.esPrimo(n1)+"\n");
		
	System.out.println(n2+ " Es numero primo? "+Primo.esPrimo(n2)+"\n");
		
	System.out.println(n3+" y "+n1+ " Son numeros primos mellizos? "+Primo.esPrimoMellizo(n3, n1)+"\n");
		
	System.out.println(n1+" y "+n4+ " Son numeros primos mellizos? "+Primo.esPrimoMellizo(n1, n4)+"\n");
		
	System.out.println(n2+" y "+n5+ " Son numeros primos mellizos? "+Primo.esPrimoMellizo(n2, n5)+"\n");


	
		
	}

	
}
