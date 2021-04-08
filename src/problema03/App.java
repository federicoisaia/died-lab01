package problema03;

public class App {
	public static void main(String[] Args) {
		Temperatura dia1 = new Temperatura(30.0,Escala.CELCIUS);
		Temperatura dia2 = new Temperatura(55.0,Escala.FARENHEIT);
		System.out.println("T1 en C°: "+dia1.asCelcius());
		System.out.println("T1 en F°: "+dia1.asFarenheit());
		System.out.println("T2 en C°: "+dia2.asCelcius());
		System.out.println("T2 en F°: "+dia2.asFarenheit());
		dia2.aumentar(dia1);
		System.out.println("T1+T2 en C°: "+dia2.asCelcius());
		System.out.println("T1+T2 en F°: "+dia2.asFarenheit());
		dia1.disminuir(new Temperatura(10.0, Escala.CELCIUS));
		System.out.println("T1 en C°: "+dia1.asCelcius());
		System.out.println("T1 en F°: "+dia1.asFarenheit());
		
	}

}
