package Paquete3;
import java.util.GregorianCalendar;

public class test {

	public static void main(String[] args) {
		
		try{
		
		GestionEstudiante prueba =new GestionEstudiante();
		prueba.agregarEstudiante("Hola", "Hola!", 34567218, 1934,11,12);
		prueba.agregarEstudiante("Hola", "Hola!", 34567218, 1987,2,13);
		prueba.agregarEstudiante("Hola", "Hola!", 34567218, 1973,4,14);
		prueba.agregarEstudiante("Hola", "Hola!", 34567218, 1945,6,5);
		prueba.mostrarestudiante();
		
		
		
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}

	}

}
