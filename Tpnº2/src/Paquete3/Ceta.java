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
	
    

	//constructor
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

	public void setRodado(String [] movil){
		auto = new Rodado(movil[0], movil[1],Integer.parseInt(movil[3]));
	}
	
	public void setVendedor(String [] vende){
		vendedor = new Contribuyente (vende[0],vende[1],Long.parseLong(vende[4]), vende[2], vende[3].charAt(0));
	}
	
	public void setComprador(String [] compra){
		comprador = new Contribuyente (compra[0],compra[1],Long.parseLong(compra[4]), compra[2],compra[3].charAt(0));
	}
	
	
	// traer formulario
	
	public String traerFormulario(){
		String formulario="";
		
		formulario +="Fecha: "+Funciones.traerFechaCorta(fecha)+ "\nIdCeta: "+idCeta+ "\n-----\nVendedor:  "+vendedor.toString()+ "\ncomprador: "+comprador.toString()+
		"\nValor de la transaferencia:"+valorTransferencia+
		"\n-----\nDatos del rodado:\n"+auto.toString();
		
	return formulario;	
		
	}}

