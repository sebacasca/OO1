package Paquete3;	

public class Rodado {

	private static long idSiguiente=0;
	private long idRodado;
	private String dominio;
	private String marcamodelo;
	
	public Rodado(String patente, String mm){
			this.setDominio(patente);
			this.marcamodelo=mm;
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
					if(!(validarLetra(patente.charAt(i)))){
						correcto = false;}
				}
				if(i==3 || i==4 || i==5){
					if(!(validarNum(patente.charAt(i)))){
						correcto = false;
					}
				}
							
			}
		}else correcto=false;
		
	return correcto;
	}
	
	
	public boolean validarNum(char c){
		char [] numero={'0','1','2','3','4','5','6','7','8','9'};
		boolean correcto = false;
		int i=0;
		
		while( i<11 && !correcto){
			if(c == numero[i]){
				correcto = true;
			}
			i++;}
		
			
		return correcto;
		}
		
	
	
	public boolean validarLetra(char c){
		char [] letra={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		boolean correcto = false;
		int i=0;
				
		while( i<26 && !correcto){
			if(c == letra[i]){
				correcto = true;
			}
			i++;
		}
			
		
	return correcto;
	}


	public long getIdRodado() {
		return idRodado;
	}


	public void setIdRodado(long idRodado) {
		this.idRodado = idRodado;
	}


	public String getDominio() {
		return dominio;
	}


	public void setDominio(String dominio) {
		if(validarDominio(dominio)){
			dominio=dominio.toUpperCase();
			this.dominio=dominio;
		}else System.out.println("El dominio es incorrecto.");
	}


	public String getMarcamodelo() {
		return marcamodelo;
	}


	public void setMarcamodelo(String marcamodelo) {
		this.marcamodelo = marcamodelo;
	}
	
	
	
}
