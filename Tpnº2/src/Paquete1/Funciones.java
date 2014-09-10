package Paquete1;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.text.DecimalFormat;

public class Funciones {

	
	// traer a�o
	public static int traerAnio (GregorianCalendar anio){
		return anio.get(Calendar.YEAR);
	}
	
	//traer mes
	public static int traerMes (GregorianCalendar mes){
		return (mes.get(Calendar.MONTH))+1;
		
	}
	/*traer dia*/
	
	public static int traerDia (GregorianCalendar dia){
		return dia.get(Calendar.DAY_OF_MONTH);
	}
		
	// es bisiesto??
	
	public static boolean esBisisesto (int a){
		return ((a%4 == 0 && a%100 !=0) || a%400 ==0);
	}
	
	//es fecha valida??
	
		public static boolean fechaValida(int a, int m, int d){
			
			GregorianCalendar fechaActual= new GregorianCalendar();
			//int d= f.get(GregorianCalendar.DAY_OF_MONTH);
			//int m= f.get(GregorianCalendar.MONTH);
			//int a= f.get(GregorianCalendar.YEAR);
			int anioActual= fechaActual.get(GregorianCalendar.YEAR);
			//m=m+1;
			boolean correcto= true;
			
			if(a <= 0 && a >= anioActual){
				correcto=false;}
			
			if(m<0 || m>12){
				correcto=false;
			}
			if (m==2){
					if (esBisisesto(a)){
						if(d<1 || d>29 ){
							correcto=false;
						}
					}else {if(d<1 || d>28){correcto=false;}}
			
				}
				else{
					if(m==4 || m==6 || m==9 || m==11){
						if(d<0 || d>30){
							correcto=false;
						}
						else{
							if(d<0 || d>31){
								correcto=false;
								
							}
							
						}
				}
					
			}
			
			return correcto;
		}
		
	//Traer fecha (parametros int, devuelve gregorian)
	public static GregorianCalendar traerFecha(int a, int m, int d){
		GregorianCalendar fecha=null;
		
			
		if (fechaValida(a,m,d)) fecha= new GregorianCalendar(a,m,d);
		return fecha;
		}
	
	//traer fecha (parametro Stringr, devuelve calendar)
	public static GregorianCalendar traerFecha(String fecha){
		String anio,mes,dia;
		
		dia=fecha.substring(0,2);
		mes=fecha.substring(3,5);
		anio=fecha.substring(6);
		GregorianCalendar date= new GregorianCalendar(Integer.parseInt(anio),(Integer.parseInt(mes)-1),Integer.parseInt(dia));
		return date;
		}

	
	// fecha corta(sobrecargado)
	
	public static String traerFechaCorta(){
		return (traerFechaCorta(new GregorianCalendar()));
	}
	
	//fecha corta
	public static String traerFechaCorta(GregorianCalendar obj){
		int dia= obj.get(GregorianCalendar.DATE);
		int mes= obj.get(GregorianCalendar.MONTH);
		int anio= obj.get(GregorianCalendar.YEAR);
		mes=mes+1;
		String fecha="";		
		
		if(dia<10){
			fecha+="0"+dia+"/";}
		else{
			fecha=dia+"/";}
	
		if(mes<10){
			fecha+="0"+mes+"/";}
		else{
			fecha+=mes+"/";}
		
			fecha+=anio;
				
		return fecha;
	}
	
	
	//dia Habil
	
	public static boolean esdiaHabil(GregorianCalendar f){
		int dia = f.get(GregorianCalendar.DAY_OF_WEEK);
		boolean dh = true;
		
		if( dia==1 || dia==7){
			dh=false;
		}
		return(dh);	
		}
	
	//traer diadelasemana
	
	public static String traerDiaSemana(GregorianCalendar f){
		int dia =f.get(GregorianCalendar.DAY_OF_WEEK);
		String ds="";
		
		switch(dia){
		case 1: ds="Domingo";
				break;
		case 2: ds="Lunes";
				break;
		case 3: ds="Martes";
				break;
		case 4: ds="Miercoles";
				break;
		case 5: ds="Jueves";
				break;
		case 6: ds="Viernes";
				break;
		case 7: ds="Sabado";
				break;
		}
	return ds;
	
	}
	
	//traer mes en letras
	
	public static String traerMesenLetras(GregorianCalendar f){
		int mes =f.get(GregorianCalendar.MONTH);
		String m="";
		switch(mes){
		case 0: m="Enero";
		break;
		case 1: m="Febrero";
		break;
		case 2: m="Marzo";
		break;
		case 3: m="Abril";
		break;
		case 4: m="Mayo";
		break;
		case 5: m="Junio";
		break;
		case 6: m="Julio";
		break;
		case 7: m="Agosto";
		break;
		case 8: m="Septiembre";
		break;
		case 9: m="Octubre";
		break;
		case 10: m="Noviembre";
		break;
		case 11: m="Diciembre";
		break;
		}
	return(m);
	}
	
 //traer fecha larga
	
	public static String traerFechaLarga(GregorianCalendar f){
	String fecha="";
	
	return (fecha+= traerDiaSemana(f)+" "+traerDia(f)+" "+ traerMesenLetras(f)+" "+ traerAnio(f));
		
	}
	
// fechas iguales
	
	public static boolean sonFechasIguales(GregorianCalendar f1, GregorianCalendar f2){
		boolean correcto=true;
		
		if(traerDia(f1)!=traerDia(f2)){
			correcto=false;}
			else{
				if(traerMes(f1)!=traerMes(f2)){
					correcto=false;}
				else{
					if(traerAnio(f1)!=traerAnio(f2)){
						correcto=false;}
					}
			}
		
	return(correcto);	
	}

//cant de dias del mes
	
	public static int traerCantDiasDeUnMes(int m, int a){
		switch(m-1){
		case 0: m=31;
		break;
		case 1: if(esBisisesto(a)){
					m=29;}
				else m=28;
		break;			
		case 2: m=31;
		break;
		case 3: m=30;
		break;
		case 4: m=31;
		break;
		case 5: m=30;
		break;
		case 6: m=31;
		break;
		case 7: m=31;
		break;
		case 8: m=30;
		break;
		case 9: m=31;
		break;
		case 10: m=30;
		break;
		case 11: m=31;
		break;
		}
	return(m);
	}
	
	
	
	 // Aproxi 2 decimales
		public static String aproximar2Decimal (double numero){
			
			DecimalFormat df = new DecimalFormat("0.00");
					
			return df.format(numero);
			
		}
	


}