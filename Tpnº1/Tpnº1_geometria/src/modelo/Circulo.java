package modelo;

public class Circulo {
	private Punto origen;
	private double radio;
	public Circulo(double radio) {
	this.origen=new Punto(0,0);
	this.radio = radio;
	}
	
	public Circulo(Punto origen, double radio) {
	this.origen = origen;
	
	this.radio = radio;
	}
	
	public Circulo(Punto origen , Punto radio) {
	this.origen=origen;
	this.setRadio( radio);
	}
	
	public Punto getOrigen() {
	return origen;
	}
	
	public void setOrigen(Punto origen) {
	this.origen = origen;
	}
	
	public double getRadio() {
	return radio;
	}
	
	public void setRadio(double radio) {
	this.radio = radio;
	}
	public void setRadio(Punto radio){
	this.radio=Math.sqrt(Math.pow(origen.getX()-radio.getX(),
	2)+Math.pow(origen.getY()-radio.getY(), 2));
	}
	
	@Override
	public String toString (){
	return "Circulo centro en:"+origen +" radio="+radio;
	}
	
	public double calcularArea(){
	return Math.PI*Math.pow(radio,2);
	}
	
	public double calcularPerimetro(){
		return 2*Math.PI*radio;
	}
	
	public boolean equals(Circulo c){
		return ((c.radio==this.radio) && (this.origen.equals(c.getOrigen())));
		}
		
	

	
	}
	
	

