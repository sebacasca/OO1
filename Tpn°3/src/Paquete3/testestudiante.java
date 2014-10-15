package Paquete3;

public class testestudiante {

	public static void main(String[] args) {
		
		try{
		Estudiante e1 = new Estudiante("ASd","Nom",23232334, 1990, 11, 23);
		System.out.println(e1.toString());
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}

	}

}
