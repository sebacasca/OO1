package modelo;
import java.util.Calendar;
import java.util.GregorianCalendar;

import modelo.ObraSocial;

public class Paciente {
	private String apellido;
	private String nombre;
	private String dni;
	

	private ObraSocial obraSocial= new ObraSocial("","","");
	
	GregorianCalendar fechaDeNacimiento= new GregorianCalendar();
	

	/*constructor*/
	public Paciente(String apellido, String nombre,String dni, String os, String eM, String tel, int anio, int mes, int dia){
		this.apellido=apellido;
		this.nombre= nombre;
		this.dni=dni;
		obraSocial.setObraSocial(os);
		obraSocial.seteMail(eM);
		obraSocial.settelefono(tel);
		fechaDeNacimiento.set(GregorianCalendar.DATE,dia);
		fechaDeNacimiento.set(GregorianCalendar.MONTH,--mes);
		fechaDeNacimiento.set(GregorianCalendar.YEAR,anio);
	}
	
	public void setFecha(int dia, int mes, int anio){
		fechaDeNacimiento.set(GregorianCalendar.DATE,dia);
		fechaDeNacimiento.set(GregorianCalendar.MONTH,--mes);
		fechaDeNacimiento.set(GregorianCalendar.YEAR,anio);
	}

/*set y get para clase Paciente*/
	
	public String getapelligo(){
		return apellido;
	}
	public void setapellido(String apellido){
		this.apellido=apellido;
	}
	public String getnombre(){
		return nombre;
	}
	public void setnombre(String nombre){
		this.nombre=nombre;
	}
	public String getdni(){
		return dni;
	}
	public void setdni(String dni){
		this.dni=dni;
	}
	
	public int getdia(){
		return fechaDeNacimiento.get(Calendar.DAY_OF_MONTH);
	}
	
	public int getmes(){
		return fechaDeNacimiento.get(Calendar.MONTH);
	}
	
	public int getanio(){
		return fechaDeNacimiento.get(Calendar.YEAR);
	}
	
	
	/*public String fechaCorta(){
		d= fechaDeNacimiento.get(GregorianCalendar.DATE);
		m= fechaDeNacimiento.get(GregorianCalendar.MONTH);
		a= fechaDeNacimiento.get(GregorianCalendar.YEAR);
	m=m+1;
	if (d<10 && m<10){
		fecha="0"+d+"/"+"0"+m+"/"+a;
	}
	if (d<10 && m>10){
		fecha="0"+d+"/"+m+"/"+d;}
	if (d>10 && m<10){
		fecha=d+"/"+"0"+m+"/"+a;}
	
	return fecha;
	}*/	
	
//metodo para traer fechaCorta:
	
	String fechaCorta;
	public String traerFechaCorta(){
		String fechaCorta="";
		if(fechaDeNacimiento.get(Calendar.DAY_OF_MONTH)<10){
			fechaCorta+="0"+fechaDeNacimiento.get(Calendar.DAY_OF_MONTH)+"/";}
		else{
			fechaCorta=fechaDeNacimiento.get(Calendar.DAY_OF_MONTH)+"/";}
	
		if((fechaDeNacimiento.get(Calendar.MONTH)+1)<10){
			fechaCorta+="0"+(fechaDeNacimiento.get(Calendar.MONTH)+1)+"/";}
		else{
			fechaCorta+=(fechaDeNacimiento.get(Calendar.MONTH)+1)+"/";}
		
			fechaCorta+=fechaDeNacimiento.get(Calendar.YEAR);
				
		return fechaCorta;
	}
	
	
	/*get para traer los atributos de la obra social*/
	
	public ObraSocial getObraSocial(){
		return getObraSocial();
	}
	
	public void setObraSocial(ObraSocial obraSocial){
		this.obraSocial=obraSocial;
	}
		
/*metodos re-definidos*/
	
	public boolean equals(Paciente p){
		return (p.dni==this.dni);	
	}
	
	public String toString(){
		String obj="Nombre:" +nombre+ " Apellido:" +apellido+ " DNI:"+dni+ " Fecha de Nacimiento: "+traerFechaCorta();
	
	obj+="\n"+obraSocial;
	return obj;
	} 

	//es año bisiesto?
	int a,m;
	public static boolean esBisisesto (int a){
		return ((a%4 == 0 && a%100 !=0) || a%400 ==0);
	}
	
	//cant de dias del mes
	
		public static int traerCantDiasDeUnMes(int m ,int a){
			switch(m){
			case 0: m=31;
			case 1: if(esBisisesto(a)){
						m=29;}
					else m=28;
			case 2: m=31;
			case 3: m=30;
			case 4: m=31;
			case 5: m=30;
			case 6: m=31;
			case 7: m=31;
			case 8: m=30;
			case 9: m=31;
			case 10: m=30;
			case 11: m=31;
			}
		return(m);
		}	
		
		public String calcularEdad() {
			
			// guardo dia, mes, año como enteros
			int diaNacimiento = fechaDeNacimiento.get(Calendar.DAY_OF_MONTH);
			int mesNacimiento = fechaDeNacimiento.get(Calendar.MONTH);
			int anioNacimiento = fechaDeNacimiento.get(Calendar.YEAR);
			
			// fecha actual
			GregorianCalendar fechaActual = new GregorianCalendar();
			
			// guardo dia, mes, año actual como enteros
			int diaActual = fechaActual.get(Calendar.DAY_OF_MONTH);
			int mesActual = fechaActual.get(Calendar.MONTH);
			int anioActual = fechaActual.get(Calendar.YEAR);
			
			// llamo al metodo para traer el ultimo dia del mes
			int ultimoDiaDelMes = traerCantDiasDeUnMes(m,a);
			
			// guardo los días, meses y años de la persona 
			int diaViv = diaActual - diaNacimiento;
			int mesViv = mesActual - mesNacimiento;
			int anioViv = anioActual - anioNacimiento;
			
			//mesViv=mesViv-1;
			
			//se le pide una unidad al mes si los dias son negativos
			if (diaViv < 0) {
				mesViv = mesViv-1 ;
				diaViv = diaViv + (ultimoDiaDelMes);
			}
			
			//se le pide una unidad al año si los meses son negativos
			if(mesViv < 0) {
				anioViv = anioViv - 1;
				mesViv = mesViv + 12;
			}
			
			//se chequea que la persona haya nacido
			if(anioActual < anioNacimiento) {
				return "fecha invalida\n";
			}
			else if (anioActual == anioNacimiento && (mesActual < mesNacimiento)) {
				return "fecha invalida\n";
			}
			else if (anioActual == anioNacimiento && (mesActual == mesNacimiento && (diaActual < diaNacimiento))) {
				return "fecha invalida\n";
			}
			
			
			return anioViv + " años, " + (mesViv) + " meses y " + diaViv + " días.\n\n";
		}
	
		
}
