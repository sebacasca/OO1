package Paquete3;

public class Test {

	public static void main(String[] args) {
		
		String [] valoresrodado ={"kaw342","VW Gol sedan","62133.32","2005"};
		String [] valorescomprador={"Cascardo","Sebastian","20324617400","m","32461740"};
		String [] valoresvendedor={"De Domingo","Gonzalo","20356861818","m","87654321"};
		
		String [] valoresrodado2 ={"sxj651","Fiat Palio","59800.90","2001"};
		String [] valorescomprador2={"Palazzo","Gabriel","20376118737","m","37611873"};
		String [] valoresvendedor2={"Gonzalez","Laura","20306789567","f","3067895600"};
		
		String [] valoresrodado3 ={"987wsd","Ford Focus","82590.00","1915"};
		String [] valorescomprador3={"Cristiani","Matias","20343215667","m","3432156"};
		String [] valoresvendedor3={"Gonzalez","Laura","20306789567","f","3067895600"};
		
		Ceta f1 = new Ceta (valorescomprador,valoresvendedor,valoresrodado);
		
		Ceta f2 = new Ceta (valorescomprador2,valoresvendedor2,valoresrodado2);
		
		Ceta f3 = new Ceta (valorescomprador3,valoresvendedor3,valoresrodado3);
		
		
		System.out.println("Formulario 1:\n"+f1.traerFormulario()+"\n\n");
		
		System.out.println("Formulario 2:\n"+f2.traerFormulario()+"\n\n");
		
		System.out.println("Formulario 3:\n"+f3.traerFormulario()+"\n\n");
		
		
	
	}

}
