package Paquete3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class GestionEstudiante {
	
	List<Estudiante> listaestudiante= new ArrayList<Estudiante>();
	Estudiante estudiante1;
	
	public boolean agregarEstudiante(String apellido,String nombre,long dni, int a, int m, int d)throws Exception{
		
		boolean valido=true;
		
		estudiante1 = new Estudiante(apellido,nombre,dni, a ,m ,d);
		if(!listaestudiante.add(estudiante1)){
			throw new Exception("No se pudo agregar.");
		}
		
		return valido;
	}
	
	public void mostrarestudiante(){
		for(Iterator<Estudiante> i= listaestudiante.iterator(); i.hasNext();){
			System.out.println(i.next());
		}
	}
	
	/*public String datoestudiante(){
		return estudiante1.toString();
	}*/
	
	
	//lista listaestudiante boolean
	/*agregarestudiante(todo estudiante menos id):return boolean
	 modificarestudiante(todo e id para buscar): boolean
	 eliminarestudiante(id):boolean
	 traerestudiante(long dni) objeto estudiante
	 traerestudiante(idestudiante) objeto estudiante
	 traerestudiante(parte apellido)lista estudiante
	 
	 */

}
