package Paquete3;
import Paquete3.*;
import java.util.GregorianCalendar;


public class test {

	public static void main(String[] args) {
		
		GregorianCalendar fechahoy = new GregorianCalendar();
		
		//Contribuyente c1= new Contribuyente(1, "apellido", "nombres", 12345678, "cuil", 'f');
		
		Ceta f2 = new Ceta (2, fechahoy , 1990);
		
		//System.out.print (c1.getsexo());
		
		System.out.print(f2.traerFormulario());
		
		
		//System.out.println(Contribuyente.validarDni(1234));
	
		//System.out.println(Long.toString(6666));
		
		//System.out.println(1111111));
		
		Rodado auto = new Rodado("ssw123","jaosdjas",1931);
		auto.setDominio("sdwe21");
		auto.setModelo(1923);
		auto.setDominio("we1312");
		auto.setModelo(1932);
		System.out.println(auto.toString());
		
		
	
	}

}
