package Paquete3;
import java.util.GregorianCalendar;
import Funcion.Funciones;

public class Estudiante {

	private static int idSiguiente=0;
	private int idestudiante;
	private long dni;
	private String apellido;
	private String nombre;
	private GregorianCalendar fechanacimiento;
	
	
	public Estudiante(String apellido,String nombre,long dni, int a, int m, int d)throws Exception{
		setId();
		this.apellido=apellido;
		this.nombre=nombre;
		setDni(dni);
		setFechanacimiento(a,m,d);
	}
	
	public Estudiante(Estudiante e)throws Exception{
		this.idestudiante= e.getIdestudiante();
		this.apellido=e.getApellido();
		this.nombre= e.getNombre();
		setDni(e.getDni());
		setFechanacimiento(e.getFechanacimiento());
	}
	
	public Estudiante(int id, String apellido,String nombre,long dni, int a, int m, int d)throws Exception{
		this.idestudiante=id;
		this.apellido=apellido;
		this.nombre=nombre;
		setDni(dni);
		setFechanacimiento(a,m,d);
	}
	
	protected void setId(){
		idSiguiente++;
		this.idestudiante=idSiguiente;}

	public int getIdestudiante() {
		return idestudiante;
	}

	
	
	public long getDni() {
		return dni;
	}

	public String getApellido() {
		return apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public GregorianCalendar getFechanacimiento() {
		return fechanacimiento;
	}

	public void setDni(long dni)throws Exception {
		if(Funciones.validarDni(dni)){
			this.dni=dni;
		}else throw new Exception("Dni invalido.");
	}
	
	public void setFechanacimiento(GregorianCalendar f){
		int d = f.get(GregorianCalendar.DAY_OF_MONTH);
		int m = f.get(GregorianCalendar.MONTH);
		int a = f.get(GregorianCalendar.YEAR);
		setFechanacimiento(d,m,a);
	}
	
	public void setFechanacimiento(int d, int m, int a){
		this.fechanacimiento=Funciones.traerFecha(d,m,a);
	}
	
	public boolean equals(Estudiante c){
		boolean valido = true;
		
		if(this.idestudiante!=c.getIdestudiante()){
			valido = false;
		}
		
		return valido;
	}
	
	public String toString(){
		
		String dato="ID: "+this.idestudiante+"\nNombre: "+this.nombre+"\nApellido: "+this.apellido+"\nDNI: "+this.dni+"\nFecha Nacimiento: "+Funciones.traerFechaCorta(fechanacimiento);
		
		return dato;
	}

		
}
