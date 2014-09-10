package test;

import modelo.Paciente;

public class Test{
	
		public static void main(String[] args) {
		
		Paciente p1=new Paciente("Lopez","Jose","30500600","osecac","osecac@gmail.com","45768000",2014,9,4);
		Paciente p2=new Paciente("Gonzales","Maria","31700800","osde","osde@gmail.com","43219000",2014,9,14);
		Paciente p3=new Paciente("Perez","Laura","39200100","galeno","galeno@gmail.com","42302000",2014,9,1);
		
		Paciente p4=new Paciente("Mesmayor","Jose","30500600","osecac","osecac@gmail.com","45768000",2014,11,4);
		Paciente p5=new Paciente("Mesmayor","Jose","30500600","osecac","osecac@gmail.com","45768000",2014,11,14);
		Paciente p6=new Paciente("Mesmayor","Jose","30500600","osecac","osecac@gmail.com","45768000",2014,11,1);
		
		Paciente p7=new Paciente("Lopez","Jose","30500600","osecac","osecac@gmail.com","45768000",2014,5,4);
		Paciente p8=new Paciente("Lopez","Jose","30500600","osecac","osecac@gmail.com","45768000",2014,5,14);
		Paciente p9=new Paciente("Lopez","Jose","30500600","osecac","osecac@gmail.com","45768000",2014,5,1);
		
		Paciente p10=new Paciente("Lopez","Jose","30500600","osecac","osecac@gmail.com","45768000",2012,9,4);
		Paciente p11=new Paciente("Lopez","Jose","30500600","osecac","osecac@gmail.com","45768000",2012,9,14);
		Paciente p12=new Paciente("Lopez","Jose","30500600","osecac","osecac@gmail.com","45768000",2012,9,1);
		
		Paciente p13=new Paciente("LoDHAD","Jose","30500600","osecac","osecac@gmail.com","45768000",2012,10,4);
		Paciente p14=new Paciente("Lopez","Jose","30500600","osecac","osecac@gmail.com","45768000",2012,11,14);
		Paciente p15=new Paciente("Lopez","Jose","30500600","osecac","osecac@gmail.com","45768000",2012,11,1);
		
		Paciente p16=new Paciente("Lopez","Jose","30500600","osecac","osecac@gmail.com","45768000",2012,5,4);
		Paciente p17=new Paciente("Lopez","Jose","30500600","osecac","osecac@gmail.com","45768000",2012,5,14);
		Paciente p18=new Paciente("Lopez","Jose","30500600","osecac","osecac@gmail.com","45768000",2012,5,1);
		
		
		

				
//System.out.println(p1.toString());

//System.out.println( p1.calcularEdad() );		

System.out.println("Test del toString:\n");
System.out.println(p1.toString());
System.out.println(p1.calcularEdad() );		

System.out.println("-");
System.out.println(p2.toString());
System.out.println(p2.calcularEdad() );		

System.out.println("-");
System.out.println(p3.toString());
System.out.println(p3.calcularEdad() );		

System.out.println("-");
System.out.println(p4.toString());
System.out.println(p4.calcularEdad() );	

System.out.println("-");
System.out.println(p5.toString());
System.out.println(p5.calcularEdad() );

System.out.println("-");
System.out.println(p6.toString());
System.out.println(p6.calcularEdad() );

System.out.println("-");
System.out.println(p7.toString());
System.out.println(p7.calcularEdad() );

System.out.println("-");
System.out.println(p8.toString());
System.out.println(p8.calcularEdad() );

System.out.println("-");
System.out.println(p9.toString());
System.out.println(p9.calcularEdad() );	

System.out.println("-");
System.out.println(p10.toString());
System.out.println(p10.calcularEdad() );

System.out.println("-");
System.out.println(p11.toString());
System.out.println(p11.calcularEdad() );

System.out.println("-");
System.out.println(p12.toString());
System.out.println(p12.calcularEdad() );

System.out.println("-");
System.out.println(p13.toString());
System.out.println(p13.calcularEdad() );

System.out.println("-");
System.out.println(p14.toString());
System.out.println(p14.calcularEdad() );

System.out.println("-");
System.out.println(p15.toString());
System.out.println(p15.calcularEdad() );

System.out.println("-");
System.out.println(p16.toString());
System.out.println(p16.calcularEdad() );

System.out.println("-");
System.out.println(p17.toString());
System.out.println(p17.calcularEdad() );

System.out.println("-");
System.out.println(p18.toString());
System.out.println(p18.calcularEdad() );	

System.out.println("\nTest del equals:\n");
if (p1.equals(p2)){
	System.out.println("Tienen el mismo dni.\n");}
	else{
		System.out.println("Tienen distinto dni.\n");}

if (p1.equals(p4)){
	System.out.println("Tienen el mismo dni.\n");}
	else{
		System.out.println("Tienen distinto dni.\n");}
	
}
}
