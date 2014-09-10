package modelo;

public class ObraSocial {
	private String obraSocial;
	private String eMail;
	private String telefono;
	
	/*constructor
	public ObraSocial(){
		this.obraSocial="";
		this.eMail="";
		this.telefono="";
	}*/
	
	public ObraSocial(String os, String eM, String tel){
		this.obraSocial=os;
		this.eMail=eM;
		this.telefono=tel;
	}
	
	public void setObraSocial(String obraSocial){
		this.obraSocial=obraSocial;
	}//funcion para llevar obra social a clase Paciente.

	public String geteMail(){
		return eMail;// devuelve el email de la obra social.
							}
	public String getobraSocial(){
		return this.obraSocial;
	}
	public void seteMail(String eMail){
		this.eMail=eMail;// modifica el email de la obra social.
									  }
	public String gettelefono(){
		return telefono;// devuelve el telefono de una obra social.
							   }
	public void settelefono(String telefono){
		this.telefono=telefono;//modifica el telefono de una obra social.
											}
	/*metodos re-definidos*/
	@Override
	public String toString(){
		return("Obra social: "+obraSocial+" Email: "+eMail+" Telefono: "+telefono);
	}



}

