package Paquete3;
import java.util.GregorianCalendar;

import Paquete3.Contribuyente;

public class Ceta {
	private long idCeta;
	private GregorianCalendar fecha= new GregorianCalendar();
	private double valorTransferencia;
	int idSiguiente;
	
	
	private Contribuyente vendedor = new Contribuyente (1, "apellido", "nombres", 12345678, "cuil",'f');
    private Contribuyente comprador= new Contribuyente(2,"apellido","nombres", 87654321,"cuil",'m');
    
    private Rodado automotor = new Rodado("asd124","Ford Falcon", 1985);
    
    //private Ceta f1= new Ceta(1,fecha,1234);QUE HACE ESTO ACA? xd

	//constructor
	
	public  Ceta(long idCeta, GregorianCalendar fecha, double valorTransferencia){
		this.idCeta=idCeta;
		this.fecha=fecha;
		this.valorTransferencia=valorTransferencia;
		}
		
	
	//getters y setters
	
	protected void setId(){
	
		idSiguiente++;
		setIdCeta(idSiguiente);}

	public long getIdCeta() {return idCeta;}


	public void setIdCeta(long idCeta) { this.idCeta = idCeta;}

	
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
		
		formulario +="IdCeta: "+idCeta+ "\nVendedor:  "+vendedor.toString()+ "\ncomprador: "+comprador.toString()+ "\nfecha:"+fecha+ "\nValor de la transaferencia:"+valorTransferencia+"\nDatosRodado: "+automotor.toString();
		
	return formulario;//to string para comprador y vendedor(HACER)	
		
	}}

