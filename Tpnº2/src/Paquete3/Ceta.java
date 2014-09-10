package Paquete3;
import java.util.GregorianCalendar;

import Paquete3.Contribuyente;

public class Ceta {
	private long idCeta;
	private GregorianCalendar fecha;
	private double valorTransferencia;
	
	private Contribuyente vendedor = new Contribuyente (idContribuyente, apellido, nombres, dni, cuil);
    //private Contribuyente comprador= new Contribuyente();
    
	
    private Rodado automotor=new Rodado();

	//constructor
	
	public  Ceta(long idCeta, GregorianCalendar fecha, double valorTransferencia){
		this.idCeta=idCeta;
		this.fecha=fecha;
		this.valorTransferencia=valorTransferencia;
		vendedor.setContribuyente(idContribuyente);
		
		
		
	}
		
	public void setContribuyente(String Contribuyente){
		this.vendedor=vendedor;


}
