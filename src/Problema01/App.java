package Problema01;

public class App {
	public static void main(String[] Args) {
	Coordenada Cprueba = new Coordenada(0,0);
	Coordenada No= new Coordenada(90.0,-90.0);
	Coordenada Se= new Coordenada(-90.0,90.0);
	Camino CamPrueba = new Camino();
	//System.out.println(Cprueba.toString());
	CamPrueba.agregar(Cprueba);
	CamPrueba.agregar(0.0 ,75.0);
	CamPrueba.agregar(15.0,0.0);
	CamPrueba.agregar(-90.0,0.0);
	CamPrueba.agregar(0.0,-180.0);
	System.out.println(CamPrueba.getCoordenadas().get(0).toString());
	System.out.println(CamPrueba.getCoordenadas().get(1).toString());
	System.out.println(CamPrueba.getCoordenadas().get(2).toString());
	System.out.println("inciso g");
	System.out.println();
	CamPrueba.buscar(No, Se);
	System.out.println("inciso h");
	System.out.println();
	CamPrueba.buscar(Cprueba, 100000000);
	

	
	
	
		}
	}
