package Paquete3;
import java.util.ArrayList;
import java.util.List;


public class GestionEstudiante {
	
	private List<Estudiante> listaestudiante;
	private Estudiante estudiante1;
	
	public GestionEstudiante(){
		listaestudiante = new ArrayList<Estudiante>();
		estudiante1= null;
	}
	
	public boolean agregarEstudiante(String apellido,String nombre,long dni, int a, int m, int d)throws Exception{
		boolean valido=true;
		int i = 0;
		
		estudiante1 = new Estudiante(apellido,nombre,dni, a ,m ,d);
		
		while(i<listaestudiante.size() && valido){
			if(listaestudiante.get(i).getDni()==estudiante1.getDni()){
				valido = false;
				}
			i+=1;
			}
	
		if(valido){
			listaestudiante.add(estudiante1);
			}/*else{
				throw new Exception("No se pudo agregar.");
				}*/
				
		
		
		return valido;
	}
	
	public boolean modificarEstudiante(int id,String apellido,String nombre,long dni, int a, int m, int d)throws Exception{
		boolean correcto = false;
		int i=0;
		
		Estudiante e1 =new Estudiante(id,apellido, nombre, dni, a, m, d);
		
		while(i<=listaestudiante.size() && !correcto){
			if(listaestudiante.get(i).equals(e1)){
				listaestudiante.set(i, e1);
				System.out.println("Modificacion exitosa.");
				correcto = true;
			}
			i+=1;
		}
		return correcto;
	}
	
	public boolean eliminarEstudiante(int id){
		boolean hecho = false;
		int i=0;
		
		while(i<listaestudiante.size() && !hecho){
			if(listaestudiante.get(i).getIdestudiante()==id){
				System.out.println("Alumno:"+listaestudiante.get(i).getApellido()+" ha sido eliminado");
				listaestudiante.remove(i);
				hecho = true;
			}
			i+=1;
		}
		
		return hecho;
	}
	
	public Estudiante traerEstudiante(long dni)throws Exception{
		boolean localizado = false;
		int i=0;
		
		while(i<=listaestudiante.size() && !localizado){
			if((listaestudiante.get(i).getDni())==dni){
				estudiante1 = listaestudiante.get(i);
				localizado = true;
			}
			i+=1;
		}
		return estudiante1;
	}
	
	public Estudiante traerEstudiante(int dni)throws Exception{
		boolean localizado = false;
		int i=0;
		
		while(i<=listaestudiante.size() && !localizado){
			if(listaestudiante.get(i).getIdestudiante()==dni){
				estudiante1 = new Estudiante(listaestudiante.get(i));
				localizado = true;
			}
			i+=1;
		}
		return estudiante1;
	}
	
	public Estudiante traerEstudiante(String apellido)throws Exception{
		boolean localizado = false;
		int i=0;
		
		while(i<=listaestudiante.size() && !localizado){
			if((listaestudiante.get(i).getApellido().indexOf(apellido))==0){
				estudiante1 =new Estudiante(listaestudiante.get(i));
				localizado = true;
			}
			i+=1;
		}
		return estudiante1;
	}
	
	
	public void mostrarestudiante(){
		for(Estudiante s: listaestudiante){
			System.out.println(s.toString());
		}
	}
	
	
	
	//lista listaestudiante boolean READY!
	/*agregarestudiante(todo estudiante menos id):return boolean READY!
	 modificarestudiante(todo e id para buscar): boolean READY!
	 eliminarestudiante(id):boolean
	 traerestudiante(long dni) objeto estudiante
	 traerestudiante(idestudiante) objeto estudiante
	 traerestudiante(parte apellido)lista estudiante
	 
	 */

}
