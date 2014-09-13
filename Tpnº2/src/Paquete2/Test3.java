package Paquete2;
import Paquete2.Primo;
public class Test3 {

	public static void main(String[] args) {
		
		// Numeros primos de 1 hasta n con WHILE
		
		int n=125;
		int i=1;
		while(n>=i){
			if(Primo.esPrimo(i)){
				System.out.print("\n"+i);}
		i++;}
		
		
		//Numeros primos de 1 hasta n con FOR
		
		/*int n=125;
		for(int i=1; i<=n; i++){
			if(Primo.esPrimo(i)){
				System.out.print("\n"+i);}
				}*/
	}
				
}
	


