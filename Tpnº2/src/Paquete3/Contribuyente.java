package Paquete3;

public class Contribuyente {
	
	private long idContribuyente;
	private String apellido;
	private String nombres;
	private long dni;
	private String cuil;
	
	//constructor
	
	public Contribuyente(long idContribuyente, String apellido, String nombres, long dni, String cuil){
		this.idContribuyente=idContribuyente;
		this.apellido=apellido;
		this.nombres=nombres;
		this.dni=dni;
		this.cuil=cuil;
	}
	
	
		
		//geters y setters


		public long getidContribuyente(){
			return this.idContribuyente;
								}
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
		
		
		public void setidContribuyente(long idContribuyente){
			this.idContribuyente=idContribuyente;
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
		
		public void setcuil(String cuil){
			this.cuil=cuil;
		}
	
	//metodo validar DNI:
		
	public static boolean validarDni(long dni){
			boolean correcto=true;
			Long.valueOf(dni);
			String documento=Long.toString(dni);
			
				if(documento.length()<0 && documento.length()>8){
					correcto=false;}
					System.out.print("DNI invalido.");
			return correcto;	
			}
			
		
		
		/*public boolean validarDni(long doc){
			boolean correcto=true;
			int cont=0;
			
			for(int i=0; i<doc;i++){
				cont=cont+1;
				}
			if (cont!=8){
				correcto=false;
				System.out.print("DNI invalido");
			}
			return correcto;	
			}*/
		
	//metodo validar Cuil:
		
		/*public boolean validarCuil(String cuil){
			boolean correcto=true;
		
		
		
		
		
		
		
		}*/
		
		
	}


