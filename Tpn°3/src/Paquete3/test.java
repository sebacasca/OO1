package Paquete3;

public class test {

	public static void main(String[] args) {
		
		try{
		
		GestionEstudiante prueba =new GestionEstudiante();
		System.out.println("Listado de estudiantes:");
		prueba.agregarEstudiante("Ganipa", "Hola!", 34567213, 1934,11,12);
		prueba.agregarEstudiante("Ultron", "Hola!", 34567113, 1987,2,13);
		prueba.agregarEstudiante("Hola", "Hola!", 34567518, 1973,4,14);
		prueba.agregarEstudiante("Hola", "Hola!", 34567618, 1945,6,5);
		prueba.mostrarestudiante();
		System.out.println("\n--------------------");
		prueba.modificarEstudiante(3, "Downey Jr.", "Robert", 32567897, 1993, 2, 13);
		prueba.modificarEstudiante(4, "Rogers", "Steve", 31567898, 1923, 2, 13);
		System.out.println("\n--------------------");
		
		prueba.eliminarEstudiante(1);
		prueba.eliminarEstudiante(2);
		System.out.println("---------------------");
		
		System.out.println("\nListado actualizado:");
		prueba.mostrarestudiante();
		System.out.println("----------------------\n");
		int id = 3;
		long dni = 31567898;
		System.out.println(prueba.traerEstudiante(dni));
		System.out.println(prueba.traerEstudiante(id));
		System.out.println(prueba.traerEstudiante("Downe"));
		
		
		}
		catch (Exception e){
			System.out.println(e.getMessage());
		}

	}

}
