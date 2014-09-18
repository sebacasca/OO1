package Paquete3;
import Paquete3.*;
import java.util.GregorianCalendar;


public class test {

	public static void main(String[] args) {
		
		String [] valoresrodado ={"kaw342","Ford","32133.32","1935"};
		String [] valorescomprador={"Simpson","Homero","20123456782","m","12345678"};
		String [] valoresvendedor={"Colman","Gary","27343112312","m","87654321"};
		
		
		Ceta f2 = new Ceta (valorescomprador,valoresvendedor,valoresrodado);
		
		System.out.print(f2.traerFormulario());
		
	
		
	
	}

}
