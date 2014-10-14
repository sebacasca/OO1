package Paquete1;

public class Test {

	public static void main(String[] args){
		
		try{
			System.out.println("Escenario 1: ");
			String [] valoresrodado ={"rqe342","Ford","32133.32","1938"};
			String [] valorescomprador={"Cascardo","Sebastian","20324617400","f","32461740"};
			String [] valoresvendedor={"De Domingo","Gonzalo","20356861818","m","87654310"};
			Ceta escenario1 = new Ceta(valorescomprador, valoresvendedor,valoresrodado);
			System.out.println(escenario1.traerFormulario());
			System.out.println("Creacion correcta!\n============");
			}
		catch (Exception e){
			System.out.println(e.getMessage());
			}
		
		try{
			System.out.println("Escenario 2: ");
			String [] valoresrodado ={"rqe342","Ford","32133.32","1938"};
			String [] valorescomprador={"Cascardo","Sebastian","20324617400","m","3246174"};
			String [] valoresvendedor={"De Domingo","Gonzalo","20356861818","m","8765431"};
			Ceta escenario2 = new Ceta(valorescomprador, valoresvendedor,valoresrodado);
			System.out.println(escenario2.traerFormulario());
			System.out.println("Creacion correcta!\n\n\n");
			}
		catch (Exception e){
			System.out.println(e.getMessage());
			}
		
		try{
			System.out.println("Escenario 3: ");
			String [] valoresrodado ={"rqe342","Ford","32133.32","1938"};
			String [] valorescomprador={"Cascardo","Sebastian","203246174000","m","32461740"};
			String [] valoresvendedor={"De Domingo","Gonzalo","27356861818","m","87654310"};
			Ceta escenario3 = new Ceta(valorescomprador, valoresvendedor,valoresrodado);
			System.out.println(escenario3.traerFormulario());
			System.out.println("Creacion correcta!\n");
			}
		catch (Exception e){
			System.out.println(e.getMessage());
			}
		
		try{
			System.out.println("Escenario 4: ");
			String [] valoresrodado ={"rqe342","Ford","32133.32","1938"};
			String [] valorescomprador={"Cascardo","Sebastian","20324617400","y","32461740"};
			String [] valoresvendedor={"De Domingo","Gonzalo","20356861818","m","876543105"};
			Ceta escenario4 = new Ceta(valorescomprador, valoresvendedor,valoresrodado);
			System.out.println(escenario4.traerFormulario());
			System.out.println("Creacion correcta!\n");
			}
		catch (Exception e){
			System.out.println(e.getMessage());
			}
		
		try{
			System.out.println("Escenario 5: ");
			String [] valoresrodado ={"rqe342","Ford","32133.32","1938"};
			String [] valorescomprador={"Cascardo","Sebastian","20324617400","m","32461740"};
			String [] valoresvendedor={"Cascardo","Sebastian","20324617400","m","32461740"};
			Ceta escenario4 = new Ceta(valorescomprador, valoresvendedor,valoresrodado);
			System.out.println(escenario4.traerFormulario());
			System.out.println("Creacion correcta!\n");
			}
		catch (Exception e){
			System.out.println(e.getMessage());
			}
		
		
	}

}
