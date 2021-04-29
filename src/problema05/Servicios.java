package problema05;

import java.time.LocalDate;

public abstract class  Servicios implements Contratable{
	protected Oficio oficio;
	protected boolean urgente;
	protected LocalDate fecha_inicio;
	protected LocalDate fecha_fin;
	public Servicios() {
		super ();
	}
	public Servicios(Oficio of, LocalDate fec_in) {
		super ();
		this.oficio=of;
		this.urgente=false;
		this.fecha_inicio= fec_in;
	}
	public boolean finalizado() {
	if(this.fecha_fin!=null) return true;
	else return false;
	}
	public Oficio getOficio() {
		return this.oficio;
	}
	public LocalDate getfecha_inicio() {
		return this.fecha_inicio;
	}
	public void marcarUrgente() {
		this.urgente=true;
		return;
	}
	public void maracarfin() {
		this.fecha_fin=LocalDate.now();
	}
}
