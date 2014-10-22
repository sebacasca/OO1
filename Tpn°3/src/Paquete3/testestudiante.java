package Paquete3;

public class testestudiante {

	public static void main(String[] args) {
		
		try{
		Estudiante e1 = new Estudiante("ASd","Nom",23232335, 1990, 11, 23);
		Estudiante e2 = new Estudiante("ASd","Nom",23232334, 1990, 11, 23);
		//Estudiante e3 = new Estudiante(e1);
		
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		System.out.println(e1.getDni());
		//System.out.println(e3.toString());
		
		if(e1.equals(e2)){
			System.out.println("Son iguales");
		}
		
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}

	}

}
