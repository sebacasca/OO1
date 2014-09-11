package Paquete1;

import java.util.GregorianCalendar;

public class Test {

	public static void main(String[] args) {

		
		//GregorianCalendar fecha = new GregorianCalendar(2000,(12-1),8);
		//Traer fecha parametro string, devuelve gregoriancalendar
		GregorianCalendar fecha = Funciones.traerFecha("23/12/2000");
		//traer fecha
		GregorianCalendar fecha2 = Funciones.traerFecha(2014, 9, 7);
		GregorianCalendar fecha3 = Funciones.traerFecha(2014, 9, 7);
		
		// Traer Año
		System.out.println("Imprimir año 1: "+Funciones.traerAnio(fecha));
		System.out.println("Imprimir año 2: "+Funciones.traerAnio(fecha2));
		System.out.println("Imprimir año 3: "+Funciones.traerAnio(fecha3));
		System.out.println("----------------------------");
		
		//Traer Mes
		System.out.println("Imprimir mes 1: "+Funciones.traerMes(fecha));
		System.out.println("Imprimir mes 2: "+Funciones.traerMes(fecha2));
		System.out.println("Imprimir mes 3: "+Funciones.traerMes(fecha3));
		System.out.println("----------------------------");
		
		//Traer dia
		System.out.println("Imprimir Dia 1: "+Funciones.traerDia(fecha));
		System.out.println("Imprimir Dia 2: "+Funciones.traerDia(fecha2));
		System.out.println("Imprimir Dia 3: "+Funciones.traerDia(fecha3));
		System.out.println("----------------------------");
		
		//Si es Bisiesto
		System.out.println("El año es bisiesto: "+Funciones.esBisisesto(2000));
		System.out.println("El año es bisiesto: "+Funciones.esBisisesto(2014));
		System.out.println("----------------------------");
		
		//Traer Fecha Corta
		System.out.println("Imprime Fecha corta 1: "+Funciones.traerFechaCorta(fecha));
		System.out.println("Imprime Fecha corta 2: "+Funciones.traerFechaCorta(fecha2));
		System.out.println("Imprime Fecha corta 3: "+Funciones.traerFechaCorta(fecha3));
		System.out.println("----------------------------");
		
		//Traer fecha actual reutilizada
		System.out.println("Imprime Fecha corta actual: "+Funciones.traerFechaCorta());
		System.out.println("----------------------------");
		
		//Fecha Valida
		System.out.println("Es Fecha Valida?: "+Funciones.fechaValida(2030, 7, 23));
		System.out.println("Es Fecha Valida?: "+Funciones.fechaValida(1990, 14, 23));
		System.out.println("Es Fecha Valida?: "+Funciones.fechaValida(2014, 2, 29));
		System.out.println("Es Fecha Valida?: "+Funciones.fechaValida(2000, 2, 29));
		System.out.println("----------------------------");
		
		//traerFecha
		Funciones.traerFecha(1990,11,1);
		
		//Dia Habil
		System.out.println("Dia Habil 1: "+Funciones.esdiaHabil(fecha));
		System.out.println("Dia Habil 2: "+Funciones.esdiaHabil(fecha2));
		System.out.println("Dia Habil 3: "+Funciones.esdiaHabil(fecha3));
		System.out.println("----------------------------");
		
		//Dias de la Semana
		System.out.println("Dia de la Semana 1:"+Funciones.traerDiaSemana(fecha));
		System.out.println("Dia de la Semana 2:"+Funciones.traerDiaSemana(fecha2));
		System.out.println("Dia de la Semana 3:"+Funciones.traerDiaSemana(fecha3));
		System.out.println("----------------------------");
		
		//Mes en letras del Año
		System.out.println("Mes del Año 1: "+Funciones.traerMesenLetras(fecha));
		System.out.println("Mes del Año 2: "+Funciones.traerMesenLetras(fecha2));
		System.out.println("----------------------------");
		
		
		//Fecha Larga
		System.out.println("Fecha Larga 1: "+Funciones.traerFechaLarga(fecha));
		System.out.println("Fecha Larga 2: "+Funciones.traerFechaLarga(fecha2));
		System.out.println("Fecha Larga 3: "+Funciones.traerFechaLarga(fecha3));
		System.out.println("----------------------------");
		
		//Comparar Fechas
		System.out.println("Fecha Iguales: "+Funciones.sonFechasIguales(fecha, fecha2));
		System.out.println("Fecha Iguales: "+Funciones.sonFechasIguales(fecha2, fecha3));
		System.out.println("----------------------------");
		
		//Cantidad de dias del Mes
		System.out.println("Cantidad de dias del Mes 1: "+Funciones.traerCantDiasDeUnMes(9,2014));
		System.out.println("Cantidad de dias del Mes 2: "+Funciones.traerCantDiasDeUnMes(2,2000));
		System.out.println("Cantidad de dias del Mes 2: "+Funciones.traerCantDiasDeUnMes(2,2001));
		System.out.println("----------------------------");
		
		// Limito 2 decimales
		System.out.println("Numero con 2 decimales 2,998: "+Funciones.aproximar2Decimal(2.998));
		System.out.println("Numero con 2 decimales 23,546: "+Funciones.aproximar2Decimal(23.546));
		System.out.println("Numero con 2 decimales 1,542: "+Funciones.aproximar2Decimal(1.542));
		System.out.println("----------------------------");
		
	}

}