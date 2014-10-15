package Paquete3;
import java.util.GregorianCalendar;

public class test {

	public static void main(String[] args) {
		
		try{
		
		/*Estudiante e1 = new Estudiante("ASd","Nom",23232334,"23/12/1990");
		System.out.println(e1.toString());*/
		GestionEstudiante prueba =new GestionEstudiante();
		prueba.agregarEstudiante("Hola", "Hola!", 34567218, "23/12/1990");
		prueba.agregarEstudiante("Hola", "Hola!", 34567218, "23/12/1990");
		prueba.agregarEstudiante("Hola", "Hola!", 34567218, "23/12/1990");
		prueba.agregarEstudiante("Hola", "Hola!", 34567218, "23/12/1990");
		prueba.mostrarestudiante();
		
		
		
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}

	}

}
