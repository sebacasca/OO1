package Paquete3;
import java.util.GregorianCalendar;

import Paquete1.Funciones;

public class Ceta {
	
	private static int idSiguiente=0;
	private long idCeta;
	private GregorianCalendar fecha;
	private double valorTransferencia;
	private Rodado auto;
	private Contribuyente comprador;
	private Contribuyente vendedor;
	
    //constructor1
	
	public Ceta (Contribuyente v, Contribuyente c, Rodado r, double p) throws Exception{
		setId();
		setFecha(new GregorianCalendar());
		setValorTransferencia(p);
		setRodado(r);
		setVendedor(v);
		setComprador(c);		
		
	}
	
	//constructor2
	
	public  Ceta (String [] compra, String [] vende,String [] rodad){
		
		setId();
		setFecha(new GregorianCalendar());
		setValorTransferencia(Double.parseDouble(rodad[2]));
		setRodado(rodad);
		setVendedor(vende);
		setComprador(compra);
	}
		
	
	//getters y setters
	
	protected void setId(){
							idSiguiente++;
							setIdCeta(idSiguiente);}

	public long getIdCeta() {return idCeta;}
	
	public void setIdCeta(int valor){this.idCeta=valor;}
	
	public GregorianCalendar getFecha(){return fecha;}
	
	public void setFecha(GregorianCalendar fecha){this.fecha=fecha;}
	
	public double getValorTransferencia(){return valorTransferencia;}
	
	public void setValorTransferencia(double valorTransferencia){
		this.valorTransferencia=valorTransferencia;}

	public void setRodado(String [] rodad){
		auto = new Rodado(rodad[0], rodad[1],Integer.parseInt(rodad[3]));
	}
	
	public void setVendedor(String [] vende){
		vendedor = new Contribuyente (vende[0],vende[1],Long.parseLong(vende[4]), vende[2], vende[3].charAt(0));
	}
	
	public void setComprador(String [] compra){
		comprador = new Contribuyente (compra[0],compra[1],Long.parseLong(compra[4]), compra[2],compra[3].charAt(0));
	}
	
	//getter y setters constructor1
	
	public void setRodado(Rodado r){
		this.auto=r;
	}
	
	public void setVendedor(Contribuyente v){
		this.vendedor=v;
		}
	
	public void setComprador(Contribuyente c) throws Exception{
		//System.out.println("!(vendedor.equals(c))"+!(vendedor.equals(c)));
		if(!(vendedor.equals(c))){
			throw new Exception("Error comprador y vendedor son los mismos Contribuyentes");
		}
		this.comprador=c;
	}
		
	// traer formulario
	
	public String traerFormulario(){
		String formulario="";
		
		formulario +="Fecha: "+Funciones.traerFechaCorta(fecha)+ "\nIdCeta: "+idCeta+ "\n-----\nVENDEDOR:  \n"+vendedor.toString()+ "\nCOMPRADOR: \n"+comprador.toString()+"\n-----"+
		"\nValor de la transaferencia:"+valorTransferencia+
		"\n-----\nDATOS DEL RODADO:\n"+auto.toString();
		
	return formulario;	
	}

	
}