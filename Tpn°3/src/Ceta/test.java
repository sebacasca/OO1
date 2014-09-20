package Ceta;

public class test {

	public static void main(String[] args) {
		
		try{
			System.out.println("Escenario 1: ");
			String [] valoresrodado ={"kaq342","Ford","32133.32","1938"};
			Ceta escenario1 = new Ceta(valoresrodado);
			System.out.println(escenario1.traerFormulario());
			System.out.println("Creacion correcta!\n============");
			}
		catch (Exception e){
			System.out.println(e.getMessage());
			}
		
		try{
			System.out.println("Escenario 2: ");
			String [] valoresrodado ={"kaq3v2","Ford","32133.32","1938"};
			Ceta escenario2 = new Ceta(valoresrodado);
			System.out.println(escenario2.traerFormulario());
			System.out.println("Creacion correcta!\n\n\n");
			}
		catch (Exception e){
			System.out.println(e.getMessage());
			}
		
		try{
			System.out.println("Escenario 3: ");
			String [] valoresrodado ={"kas322","Ford","32133.32","1922"};
			Ceta escenario3 = new Ceta(valoresrodado);
			System.out.println(escenario3.traerFormulario());
			System.out.println("Creacion correcta!\n");
			}
		catch (Exception e){
			System.out.println(e.getMessage());
			}
		
		
	}

}
