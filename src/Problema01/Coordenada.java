package Problema01;

public class Coordenada {
	private double latitud;
	private double longitud;
	
	public Coordenada() {
		
	}
	public Coordenada(double lat, double longi) {
		this.longitud= longi;
		this.latitud= lat;
	}
	public boolean equals(Coordenada C) {

		if(this.latitud== C.getLatitud() && this.longitud == C.getLongitud()) return true;
		else return false;
	}
	public String toString() {
		return "Coordenada [latitud; " +latitud+", longitud: "+longitud+"]";
	}
	public double getLatitud() {
		return latitud;
	}
	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
}
