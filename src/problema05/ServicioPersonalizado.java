package problema05;

import java.time.LocalDate;

public class ServicioPersonalizado extends Servicios{
	private double costo_mat;
	private double costo_transp;
	private double presupuesto;
	
	public ServicioPersonalizado(Oficio of, LocalDate fec_in) {
		super (of,fec_in);
	}
	
	public void cargarcostos(double mat, double transp, double presupuesto) {
		this.costo_mat=mat;
		this.costo_transp=transp;
		this.presupuesto=presupuesto;
		return;
	}
	public double costo() {
	double costo = (this.costo_mat + this.costo_transp + this.presupuesto);
	
	if(this.urgente == true) return 1.5*costo;
	else return costo;
	}
	}
