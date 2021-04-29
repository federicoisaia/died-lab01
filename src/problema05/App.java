package problema05;

import java.time.LocalDate;

public class App {
public static void main (String[] Args) {
	Trabajador t1= new Trabajador("Carlos mascheroni", "carlitos1998@gmail.com",Oficio.Albanileria,200.0,0.1);
	ServicioPersonalizado sp1= new ServicioPersonalizado(Oficio.Albanileria, LocalDate.now());
	sp1.cargarcostos(200, 4000, 1000);
	ServicioEstandar se1=new ServicioEstandar(Oficio.Albanileria, LocalDate.now(), 1000.0, t1, TipoServicio.Instalacion);
	Herramienta h1 = new Herramienta("martillo", 50.0);
	Alquiler al1= new Alquiler(LocalDate.now().minusDays(2), LocalDate.now().plusDays(2), h1);
	Usuario u1 = new Usuario();
	
	
	// CASOS DE PRUEBA 
	
	/*se1.marcarUrgente();
	se1.cargarHoras(1);
	System.out.println(se1.costo());*/
	
	/*sp1.marcarUrgente();
	System.out.println(sp1.costo());*/
	
	/*al1.devolver();
	System.out.println(al1.costo());
	System.out.println(al1.finalizado());
	System.out.println(al1.enMora());
	*/
	
	/*al1.devolver();
	System.out.println(al1.finalizado());
	
	
	/*se1.maracarfin();
	System.out.println(se1.finalizado());
	*/
	
	/*
	t1.agregarTrabajo(se1);
	t1.agregarTrabajo(se1);
	*/
	
	/*u1.agregarContratable(al1);
	u1.agregarContratable(al1);
	u1.agregarContratable(al1);
	u1.agregarContratable(se1);
	u1.agregarContratable(sp1);
	*/
	
}
}
