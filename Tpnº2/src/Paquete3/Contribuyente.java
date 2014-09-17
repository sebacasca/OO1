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
	
	public Contribuyente(long idContribuyente, String apellido, String nombres, long dni, String cuil, char sexo){
		this.idContribuyente=idContribuyente;
		this.apellido=apellido;
		this.nombres=nombres;
		this.dni=dni;
		this.setCuil(cuil);
		this.setsexo(sexo);
	}
	
	//getters y setters

		protected void setId(){
			idSiguiente++;
			setIdContribuyente(idSiguiente);}
	
		public long getIdContribuyente() {return idContribuyente;}


		public void setIdContribuyente(long idContribuyente) { this.idContribuyente = idContribuyente;}

	
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
			this.dni=dni;
		}
		
		//public void setcuil(String cuil){
			//this.cuil=cuil;
		//}
		
		public void setsexo(char sexo){
			String sex= String.valueOf(sexo);
			sex = sex.toUpperCase();
			System.out.println("sex"+sex);
			
			if ((sex.length()!=1) && ((sex.charAt(0)!= 'F') || (sex.charAt(0)!= 'M'))){
				System.out.print("Genero no valido.");}
			else{
				sexo=sex.charAt(0);
				this.sexo=sexo;}
		}
		
		//metodo validar DNI:
		
		public static boolean validarDni(long dni){
			boolean correcto=true;
			//Long.valueOf(dni);
			String documento=Long.toString(dni);
		
				if(documento.length()!= 8){
					correcto=false;
					System.out.print("DNI invalido.");}
			return correcto;	
			}
			
		
		public void setCuil(String cuil){
			
			int [] lista={5,4,3,2,7,6,5,4,3,2};
			int numero,valor1=0,valor2, valor3;
			
			for(int i=0;i<cuil.length();i++){
				numero = Integer.parseInt("" + cuil.charAt(i));
				valor1 += numero*lista[i];}
			
			valor2 = valor1 % 11;
			valor3 = 11-valor2;
			
			switch(valor3){
				case 11:System.out.println("El digito verificador es 0.");
					break;
				case 10:System.out.println("El digito verificador es 9.");
					break;
				default: System.out.println("El digito verificador es "+valor3);}
			}
		
		//metodo validar Cuil:
			
			public boolean validarCuil(String setCuil){
				boolean correcto=true;
				
			if (setCuil.length()!= 11){
				correcto=false;
				System.out.print("CUIL invalido.");}
			return correcto;		
			}
		
		
		/*public boolean validarDni(long doc){
			boolean correcto=true;
			int cont=0;
			
			for(int i=0; i<doc;i++){
				cont=cont+1;
				}
			if (cont!=8){
				return correcto=false;
			}
			return correcto;	
			}*/
		
	//metodo validar Cuil:
		
		/*public boolean validarCuil(String cuil){
			boolean correcto=true;
			
		if (cuil.length()!= 11){
			correcto=false;
			System.out.print("CUIL invalido.");}
		return correcto;		
		}
		
		public boolean obtenerVerificacion(String cuil){
		int nCuil= Integer.parseInt(cuil);	
		int guion=0;
		int [] multiplicador={5, 4, 3, 2, 7, 6, 5, 4, 3, 2};
		
		
		
		for(int i=0;i<cuil.length();i++){
			if(cuil.charAt(i)=='-'){
				guion = i;}}
		
		for(int j=0; j<9; j++){
			int valor = multiplicador[1]*nCuil[1];
		}*/
		
		//redefino los metodos
		
		public String toString(){
			String cadena = "Apellido: "+this.apellido+"\nNombres: "+this.nombres+"\nDNI: "+this.dni+"\nCUIL: "+this.cuil;
			
			return cadena;}
		
		public boolean equalsDni(Contribuyente c){
			return (c.dni==this.dni);}
		
		public boolean equalsCuil(Contribuyente c){
			return (c.cuil==this.cuil);}
		
		
		
		}
		


