package Paquete3;
import java.util.GregorianCalendar;
import Funcion.Funciones;

public class Estudiante {

	protected int idSiguiente=0;
	private int idestudiante;
	private long dni;
	private String apellido;
	private String nombre;
	private GregorianCalendar fechanacimiento;
	
	
	public Estudiante(String apellido,String nombre,long dni, String fn)throws Exception{
		setId();
		this.apellido=apellido;
		this.nombre=nombre;
		setDni(dni);
		setFechanacimiento(fn);
	}
	
	protected void setId(){
		idSiguiente++;
		this.idestudiante=idSiguiente;}

	public int getIdestudiante() {
		return idestudiante;
	}

	public void setDni(long dni)throws Exception {
		if(Funciones.validarDni(dni)){
			this.dni=dni;
		}else throw new Exception("Dni invalido.");
	}
	
	public void setFechanacimiento(String f){
		this.fechanacimiento=Funciones.traerFecha(f);
	}
	
	public String toString(){
		
		String dato="ID: "+this.idestudiante+"\nNombre: "+this.nombre+"\nApellido: "+this.apellido+"\nDNI: "+this.dni+"\nFecha Nacimiento: "+Funciones.traerFechaCorta(fechanacimiento);
		
		return dato;
	}

		
}
