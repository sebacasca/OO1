package test;
import modelo.Circulo;
import modelo.Punto;


public class test {
	public static void main(String[] args) {
		
		Circulo circulo1=new Circulo(1);
		System.out.println(circulo1+ " de Area="+circulo1.calcularArea());
		Punto punto1=new Punto(1.2, 3.4);
		
		Circulo circulo2=new Circulo(punto1, 4);
		System.out.println(circulo2 + " de Area="+circulo2.calcularArea());

		Circulo circulo3=new Circulo(new Punto (1,1), new Punto(4,5));
		System.out.println(circulo3+ " de Area="+circulo3.calcularArea());
		
		System.out.println("\nPerimetro de circulo1: "+circulo1.calcularPerimetro());
		System.out.println("Perimetro de circulo2: "+circulo2.calcularPerimetro());
		System.out.println("Perimetro de circulo3: "+circulo3.calcularPerimetro());

		
		//equals (c:circulo):boolean
		
		Circulo circulo4=new Circulo(punto1,5);
		if(circulo4.equals(circulo2)){
			System.out.println ("\nson iguales\n");}
		else{
			System.out.println("\nson diferentes\n");
			}
		
		
		Circulo circulo5=new Circulo(new Punto(1,1),new Punto (4,5));
		if(circulo5.equals(circulo3)){
			System.out.println ("son iguales\n");}
		else{
			System.out.println("\nson diferentes\n");
			}
		
		
		// toString clase Circulo
		
		System.out.print ("Circulo2: ");
		System.out.println (circulo2.toString());
		
		System.out.print ("Circulo3: ");
		System.out.println (circulo3.toString());
		
		//equals (p:punto):boolean
		
		Punto punto2= new Punto(4.2,8.5);
		if(punto2.equals(punto1)){
			System.out.println("\nson iguales.\n");}
		else{
			System.out.println("\nson diferentes.\n");}
		
		// toString clase Punto
		
		System.out.print ("Punto1: ");
		System.out.println (punto1.toString());
		System.out.print ("\nPunto2: ");
		System.out.println (punto2.toString());
		
		
		//calcular distancia entre dos puntos
		
		System.out.print("\ndistancia entre"+punto1+"y"+punto2+" es :");
		System.out.print (punto1.calcularDistancia(punto2));
	
		
	
	
	}
	
	    
	
	
	
	
}
	
	
	
	
	
	
