package problema03;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Tramite implements Comisionable{
	private String descripcion;
	private String domicilio;
	private LocalDateTime hora_a_realizar;
	private LocalDate fecha_realizado;
	
	public Tramite() {
		super();
	}
	public Tramite(String desc, String dom, LocalDateTime hora) {
		super();
		this.descripcion= desc;
		this.domicilio= dom;
		this.hora_a_realizar= hora;
		this.fecha_realizado= null;
	}
	
	 public double costo() {
		 return 50.0;
	 }
	 public double comision() {
		 return 20.0;
	 }
}
