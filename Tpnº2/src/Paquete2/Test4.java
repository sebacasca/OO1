package Paquete2;

public abstract class Test4 {

	public static void main(String[] args) {
		int n=100;
		int aux=1, aux2=1;
		int c1=1;
		int n1=1;
		int n2=1;
		while(! (c1<n)){
			n1++;
			n2++;
			if(Primo.esPrimoMellizo(n1, n2)==true){
				aux=n1;
				aux2=n2;}
			c1++;
			System.out.println(aux+ aux2);
		}
		
		}
		

	}


