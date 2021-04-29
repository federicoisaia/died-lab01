package problema05;

public class Herramienta {
	private String nombre;
	private double costo_dia;
	private boolean alquilada;
	public Herramienta(String nombre, double costo_dia) {
		super();
		this.nombre = nombre;
		this.costo_dia = costo_dia;
		this.alquilada =false;
	}
	public Herramienta() {
		super();
	}
	public double getcosto_dia() {
		return this.costo_dia;
	}
	public void alquilar() {
		this.alquilada = true;
	}
	public void devolver() {
		this.alquilada = false;
	}
}
