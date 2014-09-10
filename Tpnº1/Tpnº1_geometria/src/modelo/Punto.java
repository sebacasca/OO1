package modelo;

public class Punto {
	
	//atributos
	
	private double x;
	private double y;
	
	//contructor
	
	public Punto() {
	this.x = 0.0;
	this.y = 0.0;
	}
	public Punto(double x, double y) {// sobrecargado
	this.x = x;
	this.y = y;
	}
	
	//métodos getter y setter
	public double getX() {
	return x;
	}
	public void setX(double x) {
	this.x = x;
	}
	public double getY() {
	return y;
	}
	public void setY(double y) {
	this.y = y;
	}
	
	//re-definición de métodos de la clase Object
	
	public boolean equals(Punto p){
	return ((x==p.getX())&&(y==p.getY()));
	}
	
	@Override
	public String toString(){
	return "("+x+","+y+")";
	}
	
	//metodo para calcular distancia entre dos puntos
	
	public double calcularDistancia(Punto p){
		return Math.sqrt(Math.pow(p.getX()-x,2)+(Math.pow(p.getY()-y,2)));
	}

}
	

