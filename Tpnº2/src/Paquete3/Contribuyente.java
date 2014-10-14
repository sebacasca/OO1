package Paquete3;

public class Contribuyente {
	
	private long idContribuyente;
	private static long idSiguiente=0;
	
	private String apellido;
	private String nombres;
	private long dni;
	private String cuil;
	private  char sexo;
	
	//constructor
	
	public Contribuyente(String apellido, String nombres, long dni, String cuil, char sexo) {
			this.setIdContribuyente();	
			this.apellido=apellido;
			this.nombres=nombres;
			this.setdni(dni);
			this.setsexo(sexo);
			this.setcuil(cuil);
		}

	//getters y setters
		
		public long getIdContribuyente() {return idContribuyente;}


		protected void setIdContribuyente() {idSiguiente++;
		this.idContribuyente = idSiguiente;}

	
		public String getapellido(){
			return this.apellido;
		}
		
		public String getnombres(){
			return this.nombres;
		}
		
		public long getdni(){
			return this.dni;
		}
		
		public String getcuil(){
			return this.cuil;
		}
		
		public char getsexo(){
			return this.sexo;
		}
		
		public void setapellido(String apellido){
			this.apellido=apellido;
		}
		
		public void setnombres(String nombres){
			this.nombres=nombres;
		}
		
		public void setdni(long dni){
			if(validarDni(dni)){
				this.dni=dni;}
		}
		
	
		public void setsexo(char sexo){
			String sex= String.valueOf(sexo);
			sex = sex.toUpperCase();
			
			if ((sex.length()!=1) && ((sex.charAt(0)!= 'F') || (sex.charAt(0)!= 'M'))){
				System.out.print("Genero no valido.");}
			else{
				sexo=sex.charAt(0);
				this.sexo=sexo;}
		}
		
		public void setcuil(String cuil){
			if(!validarCuil(cuil)){
				this.cuil="Cuil invalido.";}
			else this.cuil=cuil;
			
		}
		
		
		public boolean validarCuil(String cuil){
			
			int [] lista={5,4,3,2,7,6,5,4,3,2};
			int numero,valor1=0,valor2, valor3;
			boolean correcto=true;
			
			
			if (cuil.length()==11){
				
				for(int i=0;(i<10);i++){
					numero = Integer.parseInt("" + cuil.charAt(i));
					valor1 += (numero*lista[i]);}
				valor2 = valor1 % 11;
				valor3 = 11-valor2;
				
				switch(valor3){
				case 11:
					if(Integer.parseInt(""+cuil.charAt(10))!=0){
						correcto=false;}
				break;
				
				case 10:
					if(Integer.parseInt(""+cuil.charAt(10))!=9){
						correcto=false;}
				break;
				
				default:
					if (valor3!=Integer.parseInt(""+cuil.charAt(10))){
						correcto=false;}
					break;
					}
				}
			else correcto=false;
	
			
		return correcto;
}
			
	//metodo validar DNI:
			
		public boolean validarDni(long dni){
			boolean correcto=true;
			String documento=Long.toString(dni);
				if(documento.length()!= 8){
					correcto=false;}
				return correcto;	
				}
			
		
		//redefino los metodos
		
		public String toString(){
			String cadena = "Apellido: "+this.apellido+"\nNombres: "+this.nombres+"\nDNI: "+this.dni+"\nCUIL: "+this.cuil+"\nSexo: "+this.sexo+"\n";
			
			return cadena;}
		
		//equals
		
		public boolean equals(Contribuyente c){
			boolean correcto=true;
			
			int comparadorcuil=this.cuil.compareTo(c.getcuil());
			boolean comparadordni=this.dni ==(c.getdni());
			
			if(comparadorcuil!=1 && comparadordni!=false){
				correcto=false;
			}
			return correcto;}
		
}