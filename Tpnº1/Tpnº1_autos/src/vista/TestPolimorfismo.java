package vista;
import modelo.Auto;

public class TestPolimorfismo {
	
	public static void main(String[] args) {
		
		Auto objAuto=new Auto("UNL014","XsL8f52MPstU" , 2014, "CHEVROLET");
		Auto objAuto1=objAuto;
		
		System.out.println("************ Escenario 1 ***********");
		System.out.println(objAuto);
		System.out.println(objAuto.equals(objAuto1));
		
		System.out.println("************ Escenario 2 ***********");
		Auto objAuto2=new Auto("UNL014","XsL8f52MPstU" , 2014, "CHEVROLET");
		System.out.println(objAuto);
		System.out.println(objAuto.equals(objAuto2));
		}
}

/* 
1) ¿Cual es el resultado del Escenario 1?

2) ¿Cual es el resultado del Escenario 2?

3) ¿Porque no arrojan el mismo resultado en la aplicación del método equals?

4) Implementar polimorfismo para los métodos toString (en este método solo devolveremos los
atributos de la clase, para plasmar la instancia de la clase) y equals (para la clase Auto dos
instancias son iguales cuando todos sus atributos son los mismos).

5) Volver a ejecutar los dos escenarios, ¿cual es el resultado?*/

/*
RESPUESTAS:

1- El resultado del escenario 1: modelo.Auto@1833955 true. Imprime la direccion de memoria donde se encuentra
   el objeto objAuto, y mediante el equals compara si el objAuto=objAuto1 , y como son iguales (estan alojados
   en el mismo espacio de memoria) retorna un Verdadero(True).

2- El resultado del escenario 2: modelo.Auto@1833955 false. Imprime la direccion de memoria donde se 
   encuentra el objeto objAuto, y mediante el equals compara si el objAuto=objAuto2 , que fue instanciado anteriormente
   y como NO son iguales (estan alojados en espacios de memoria diferentes) retorna un Falso(False).
   
3- Arrojan distintos resultados porque en el escenario 1 el equals que compara el objAuto=objAuto1
   son iguales ya que cuando se instancio el objAuto1 posteriomente se lo igualo al objeto objAuto,
   es por este motivo que el metodo equals retorna un TRUE.
   En cambio en el escenario 2 instacia un nuevo objeto llamado objAuto2 (que aunque tengan los mismos
   parametros que el objeto objAuto) son dos instancias de objetos diferentes, en dos posiciones diferentes
   de memoria. Es por este motivo es que el metodo equals retorna un FALSE. 
   
5-  El resultado fue:

    ************ Escenario 1 ***********
    Patente: UNL014.
    Chasis: XsL8f52MPstU.
    Modelo: 2014.
    Marca: CHEVROLET.
	true

 	************ Escenario 2 ***********
	Patente: UNL014.
	Chasis: XsL8f52MPstU.
	Modelo: 2014.
	Marca: CHEVROLET.
	true

	Como se puede ver, al redefinir el equals, el resultado varía ya que ahora no compara posiciones de memoria, 
	y en su lugar compara los valores que tienen cada uno de las variables(es decir compara los parametros de 
	cada de uno de los objetos instanciados).
 	*/


