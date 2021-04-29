package problema05;
import java.time.temporal.ChronoUnit;
import java.time.Month;
import java.time.LocalDate;

public class Alquiler implements Contratable{
	private LocalDate fecha_inicio;
	private LocalDate fecha_fin;
	private LocalDate fecha_devolusion;
	private Herramienta herramienta;
	
	public Alquiler () {
		super ();
	}
	public Alquiler(LocalDate fecha_inicio, LocalDate fecha_fin, Herramienta herramienta) {
		super();
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.fecha_devolusion=null;
		this.herramienta = herramienta;
		this.herramienta.alquilar();
	}
	public double costo() {
		int dias;
		if(this.fecha_devolusion == null) dias= (int) ChronoUnit.DAYS.between(fecha_inicio, LocalDate.now());
		else dias=(int)ChronoUnit.DAYS.between(fecha_inicio, fecha_devolusion);
				return herramienta.getcosto_dia()*dias;
	}
	public boolean enMora(){
		if ((this.fecha_devolusion == null && LocalDate.now().isAfter(fecha_fin)) || this.fecha_devolusion.isAfter(fecha_fin))return true;
		else return false;
	}
	public boolean finalizado() {
		if (fecha_devolusion != null) {
			this.herramienta.devolver();
			return true;
		}
		else return false;
	}
	public void devolver() {
		this.fecha_devolusion= LocalDate.now();
		return;
	}
}
