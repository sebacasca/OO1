package Paquete3;
import java.util.ArrayList;
import java.util.List;


public class GestionEstudiante {
	
	private List<Estudiante> listaestudiante;
	
	public GestionEstudiante(){
		listaestudiante = new ArrayList<Estudiante>();
	}
	
	public boolean agregarEstudiante(String apellido,String nombre,long dni, int a, int m, int d)throws Exception{
		
		Estudiante e = traerEstudiante(dni);
		if(e!=null){throw new Exception("Ya existe un estudiante con ese dni.");}
			
		return listaestudiante.add(new Estudiante(apellido,nombre,dni, a,m,d));
	}
	
	public boolean modificarEstudiante(int id,String apellido,String nombre,long dni, int a, int m, int d)throws Exception{
		boolean correcto = false;
		Estudiante e = traerEstudiante(id);
		
		if(e!=null){
			e.setDni(dni);
			e.setApellido(apellido);
			e.setNombre(nombre);
			//e.setFechanacimiento(d, m, a);
			}else throw new Exception("No existe en la lista.");
		
		return correcto;
	}
	
	public boolean eliminarEstudiante(int id)throws Exception{
		Estudiante e = traerEstudiante(id);
		
		if(e==null){throw new Exception("No existe el dato a eliminar");}
		
		return listaestudiante.remove(e);
	}
	
	public Estudiante traerEstudiante(long dni){
		boolean localizado = true;
		int i=0;
		Estudiante estudiante1 = null;
		
		while(i<listaestudiante.size() && localizado){
			if((listaestudiante.get(i)).getDni()==dni){
				estudiante1 = listaestudiante.get(i);
				localizado = false;
			}
			i+=1;
		}
		return estudiante1;
	}
	
	public Estudiante traerEstudiante(int id)throws Exception{
		Estudiante estudiante1=null;
		int i=0;
		boolean localizado = true;
		
		
		while(i<listaestudiante.size() && localizado){
			if((listaestudiante.get(i)).getIdestudiante()==id){
				estudiante1 = listaestudiante.get(i);
				localizado = false;
			}
			i+=1;
		}
		
		return estudiante1;
	}
	
	public List<Estudiante> traerEstudiante(String apellido)throws Exception{
		
		int i=0;
		List <Estudiante> lista = new ArrayList<Estudiante>();
	
		while(i<listaestudiante.size()){
			if((listaestudiante.get(i).getApellido().indexOf(apellido))>=0){
				lista.add(listaestudiante.get(i));
			}
			i+=1;
		}
		if(lista.size()==0){throw new Exception("No coinciden.");}
		i=0;
		while(i<lista.size()){
			System.out.println(lista.get(i).toString());
			i+=1;
		}
		
		return lista;
	}
	
	
	public void mostrarestudiante(){
		for(Estudiante s: listaestudiante){
			System.out.println(s.toString());
		}
	}
	

}
