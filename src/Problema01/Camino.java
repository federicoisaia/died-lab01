package Problema01;
import java.util.ArrayList;
import java.lang.Math;

public class Camino {
	private ArrayList<Coordenada> Coordenadas;
	
	public Camino() {
		this.Coordenadas = new ArrayList<>();
	}
	
	public void agregar(Coordenada x) {
		this.Coordenadas.add(x);
	}
	public void agregar(double lat, double lng) {
		this.Coordenadas.add(new Coordenada(lat,lng));
	}
	public void agregar(int mtsLT, int mtsLn) {
		if (this.Coordenadas.isEmpty())return;
		else {
			double lat_sig;
			double lng_sig;
			
			lat_sig= (this.Coordenadas.get(this.Coordenadas.size()-1)).getLatitud() + (mtsLT/6378100.0) * (180 / Math.PI);
			lng_sig= (this.Coordenadas.get(this.Coordenadas.size()-1)).getLongitud() + (mtsLn /6378100.0 )* (180 / Math.PI);
			
			this.Coordenadas.add(new Coordenada(lat_sig, lng_sig));
			return;
			
		}
	}
	public ArrayList<Coordenada> getCoordenadas() {
		return this.Coordenadas;
	}
	public ArrayList<Coordenada> buscar(Coordenada no, Coordenada se){
		ArrayList<Coordenada> resultado= new ArrayList<>();
		for (Coordenada Cord: this.Coordenadas) {
			if((Cord.getLatitud()<= no.getLatitud() && Cord.getLatitud()>=se.getLatitud()) && (Cord.getLongitud()>=no.getLongitud() && Cord.getLongitud()<= se.getLongitud())) {
				resultado.add(Cord);
				System.out.println(Cord.toString());
			}
		}
		return resultado;
	}
	public ArrayList<Coordenada> buscar(Coordenada C, int mts){
		double lat_no;
		double lng_no;
		double lat_se;
		double lng_se;
		
		lat_no= C.getLatitud() + (mts/6378100.0) * (180 / Math.PI);
		lng_no= C.getLongitud() + ((-mts) /6378100.0 )* (180 / Math.PI);
		lat_se= C.getLatitud() + ((-mts)/6378100.0) * (180 / Math.PI);
		lng_se= C.getLongitud() + (mts /6378100.0 )* (180 / Math.PI);
		return this.buscar(new Coordenada(lat_no,lng_no),new Coordenada(lat_se, lng_se));
	}
}
