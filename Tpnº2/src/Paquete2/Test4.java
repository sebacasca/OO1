package Paquete2;
import Paquete2.Primo;
public abstract class Test4 {
	
	public static void main(String[] args) {
	
	//Numeros primos mellizos de 1 hasta n con FOR
	
	int n=125;
	for(int i=2; i<=n; i++){
			for(int j=1; j<=n; j+=2){
				if(Primo.esPrimoMellizo(i,j)){
			
			System.out.print("\n"+i);
			System.out.println("\n"+j);}
			}
		}
	
	
	//Numeros primos mellizos de 1 hasta n con WHILE
	
	/*int x=125;
	int i=2,j=1;
	while((x>=i)||(x>=j)){
		if(Primo.esPrimoMellizo(i, j)){
			System.out.print("\n"+i);
			System.out.println("\n"+j);}
			i++;
			j+=2;}*/
		
	}
}





