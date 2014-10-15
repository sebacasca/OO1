package Paquete2;

import java.util.ArrayList;

public class ParOrdenado {
	public static void main(String[] args) {
	
int n=100;
for(int i=2; i<=n; i++){
		for(int j=1; j<=n; j+=2){
			if(Primo.esPrimoMellizo(i,j)){
		
		System.out.print("\n"+i);
		System.out.println("\n"+j);}
		}
	}
	}

}