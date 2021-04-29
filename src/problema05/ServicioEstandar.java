package problema05;

import java.time.LocalDate;

public class ServicioEstandar extends Servicios {
	private double monto;
	private TipoServicio servicio;
	private Trabajador trabajador;
	private int horas;

	public ServicioEstandar() {
		super();
		}

	public ServicioEstandar(Oficio of,LocalDate fec_in, double monto,Trabajador T, TipoServicio serv) {
		super(of, fec_in);
		this.monto=monto;
		this.trabajador=T;
		this.servicio=serv;
		this.horas=0;
		
			}
	public void actualizarHoras(int horas) {
		this.horas=horas;
	}
	
	public double costo() {
		double costo=this.monto + this.trabajador.cobrar(this.horas,this.monto);
		if (this.urgente== false)return costo;
		else return(costo + (costo/2));
		
	}
	public void  cargarHoras(int horas) {
		this.horas=horas;
	}
}
