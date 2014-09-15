package Paquete3;
import Paquete1.Funciones;

public class Rodado {

	private static long idSiguiente=0;
	private long idRodado;
	private String dominio;
	private String marca;
	private int modelo;
	
	
	public Rodado(String patente, String marca, int model){
		
			setDominio(patente);
			setMarca(marca);
			setModelo(model);
	}
	
	protected void setId(){
		idSiguiente++;
		setIdRodado(idSiguiente);
	}
	
	
	public boolean validarDominio(String patente){
		boolean correcto = true;
		patente = patente.toUpperCase();
		
		
		if(patente.length() == 6){
			for(int i=0;i<=5;i++){
				if(i==0 || i==1 || i==2){
					if(!(Funciones.validarLetra(patente.charAt(i)))){
						correcto = false;}
				}
				if(i==3 || i==4 || i==5){
					if(!(Funciones.validarNum(patente.charAt(i)))){
						correcto = false;
					}
				}
							
			}
		}else correcto=false;
		
	return correcto;
	}
	


	public long getIdRodado() {return idRodado;}


	public void setIdRodado(long idRodado) { this.idRodado = idRodado;}


	public String getDominio() {return dominio;}


	public void setDominio(String dominio) {
		if(validarDominio(dominio)){
			dominio=dominio.toUpperCase();
			this.dominio=dominio;
		}else System.out.println("El dominio es incorrecto.");
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getModelo() {
		return modelo;
	}

	public void setModelo(int modelo) {
		if(modelo >= 1930){this.modelo = modelo;
			}else System.out.println("El modelo no es valido.");
	}


}
