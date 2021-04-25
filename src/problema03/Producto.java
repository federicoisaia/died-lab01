package problema03;

public class Producto {
	private String descripcion;
	private double costo;
	public Producto(String descripcion, double costo) {
		super();
		this.descripcion = descripcion;
		this.costo = costo;
	}
	public Producto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getCosto() {
		return costo;
	}
	@Override
	public String toString() {
		return "Producto [descripcion=" + descripcion + ", costo=" + costo + "]";
	}
	public void setCosto(double costo) {
		this.costo = costo;
	}
	

}
