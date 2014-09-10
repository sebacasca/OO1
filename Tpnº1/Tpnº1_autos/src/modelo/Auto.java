package modelo;

public class Auto {
	
	//atributos
	public String patente;
	public String chasis;
	public int modelo;
	public String marca;
	
	//contructor
	public Auto(String patente, String chasis, int modelo, String marca) {
	this.patente = patente;
	this.chasis = chasis;
	this.modelo = modelo;
	this.marca = marca;
	}
	
	//métodos
	public String getPatente() {
	return patente;
	}
	
	public void setPatente(String patente) {
	this.patente = patente;
	}
	
	public String getChasis() {
	return chasis;
	}
	
	public void setChasis(String chasis) {
	this.chasis = chasis;
	}
	
	public int getModelo() {
	return modelo;
	}
	
	public void setModelo(int modelo) {
	this.modelo = modelo;
	}
	
	public String getMarca() {
	return marca;
	}
	
	public void setMarca(String marca) {
	this.marca = marca;
	}

	
	//metodos re-definidos.
	
	public boolean equals(Auto a) {
		boolean correcto = true;
		int aux1 = patente.compareTo(a.getPatente());
		int aux2 = chasis.compareTo(a.getChasis());
		int aux4 = modelo-a.getModelo();
		int aux3 = marca.compareTo(a.getMarca());
		
		if (aux1+aux2+aux3+aux4 != 0){
			correcto = false;
		}
		return correcto;
	}
	
	
	@Override
	public String toString() {
		return "Patente: " + patente + ".\nChasis: " + chasis + ".\nModelo: " + modelo + ".\nMarca: " + marca;
	}



}
	


