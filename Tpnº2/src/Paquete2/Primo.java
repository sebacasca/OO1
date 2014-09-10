package Paquete2;

public class Primo {
	
	//metodo numero primo
	
	/*public static boolean esPrimo(int n){
		int aux,cont;
		boolean primo=true;
		for(cont=2; cont<n;cont++){
			aux=n%cont;
			if(aux==0){
				return primo=false;}
		}
	
	return (primo);
	*/
	
	public static boolean esPrimo(int n){
		int cont=2;
		boolean primo=true;
		while((cont<n)&&(primo) ){
			if(n%cont==0){
				primo=false;}
			
			cont++;}
				
			return (primo);
	}
	
	
	//metodo primo mellizos
	
	public static boolean esPrimoMellizo(int n1, int n2){
			
			
	return((Primo.esPrimo(n1))&&(Primo.esPrimo(n2))&&(n2-n1==2));
	}
	
	
}
	