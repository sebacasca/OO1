package Paquete2;
import java.util.Arrays;
import java.util.ArrayList;
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
	
	//metodo esPrimo mediante Eratostenes
	
	/*public static boolean esPrimo(int n){
		int cont=2;
		boolean primo=true;
		while((cont<n)&&(primo) ){
			if(n%cont==0){
				primo=false;}
			
			cont++;}
				
			return (primo);
	}*/
	 
	public static boolean esPrimo(int i){ 
	boolean esprimo=true;
		for (int j=2;j<i;j++){
		if (i%j==0){ 
			esprimo= false;} 
		}
	
	return esprimo; 
	} 
	
	
	public static boolean esPrimoMellizo(int n1, int n2){
		return((Primo.esPrimo(n1))&&(Primo.esPrimo(n2))&&(n2-n1==2));
		}
	
	/*
	public static boolean[] esPrimo(int n){
		 boolean primos[] = new boolean[n+1];
		 Arrays.fill(primos,true);
		 primos[0] = primos[1] = false;
		 for(int i=2;i<(int)Math.sqrt(n)+1;i++){
		  if(primos[i])
		   for(int j=i*i;j<primos.length;j+=i)
		    primos[j] = false;}
		 return primos;
		}*/

	
	//metodo primo mellizos
	
	/*public static boolean esPrimoMellizo(int n1, int n2){
			
			
	return((Primo.esPrimo(n1))&&(Primo.esPrimo(n2))&&(n2-n1==2));
	}*/
	
	
}
	
