package Paquete3;
import java.util.GregorianCalendar;

import Paquete3.Contribuyente;

public class Ceta {
	private long idCeta;
	private GregorianCalendar fecha;
	private double valorTransferencia;
	int idSiguiente;
	
    

	//constructor
	
	public  Ceta(String [] compra, String [] vende,String [] rodad){
		this.fecha=new GregorianCalendar();;
		this.valorTransferencia=Double.parseDouble(rodad[2]);
		Rodado auto = new Rodado(rodad[0],rodad[1],Integer.parseInt(rodad[3]));
		Contribuyente comprador = new Contribuyente (compra[0],compra[1],Long.parseLong(compra[4]), compra[2],compra[3].charAt(0));
	}
		
	
	//getters y setters
	
	protected void setId(){
	
		idSiguiente++;
		setIdCeta(idSiguiente);}

	public long getIdCeta() {return idCeta;}
	
	public void setIdCeta(int valor){
		this.idCeta=valor;
	}
	
	public GregorianCalendar getfecha(){
		return fecha;
	}
	public void setfecha(GregorianCalendar fecha){
		this.fecha=fecha;
	}
	public double getvalorTransferencia(){
		return valorTransferencia;
	}
	public void setvalorTransferencia(double valorTransferencia){
		this.valorTransferencia=valorTransferencia;
	}
	
	
	// traer formulario
	
	public String traerFormulario(){
		String formulario="";
		
		formulario +="IdCeta: "+idCeta+ "\nVendedor:  "/*+vendedor.toString()*/+ "\ncomprador: "+/*comprador.toString()+ */"\nfecha:"+fecha+ "\nValor de la transaferencia:"+valorTransferencia+"\nDatosRodado: "/*+automotor.toString()*/;
		
	return formulario;//to string para comprador y vendedor(HACER)	
		
	}}

