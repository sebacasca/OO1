package Paquete3;
import java.util.GregorianCalendar;

public class Ceta {
	private long idCeta;
	private GregorianCalendar fecha;
	private double valorTransferencia;
	
	//ACA ABAJO, FIJATE LOS CAMBIOSSS!!!!
	private Contribuyente vendedor = new Contribuyente (1, "apellido", "nombres", 12345678, "cuil");
    //private Contribuyente comprador= new Contribuyente();
    
	
    private Rodado automotor = new Rodado("asd124","Ford Falcon '85");

	//constructor
	
	public  Ceta(long idCeta, GregorianCalendar fecha, double valorTransferencia){
		this.idCeta=idCeta;
		this.fecha=fecha;
		this.valorTransferencia=valorTransferencia;
		//vendedor.setContribuyente(idContribuyente);
		
		
		
	}
		
	public void setContribuyente(String Contribuyente){
		this.vendedor=vendedor;


}}
