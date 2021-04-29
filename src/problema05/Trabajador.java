package problema05;
import java.util.ArrayList;

public class Trabajador {
	private String nombre;
	private String correo_electronico;
	private Oficio oficio;
	private double costo_hora;
	private double ptje_comision;//es un porcentaje, no un valor.
	private ArrayList<Servicios> trabajos;
	
	public Trabajador() {
		super();
	}
	public Trabajador(String nombre, String mail, Oficio ofici, double costo_h, double com) {
		super();
		this.nombre=nombre;
		this.correo_electronico=mail;
		this.oficio=ofici;
		this.costo_hora=costo_h;
		this.ptje_comision=com;
		this.trabajos= new ArrayList<>();
		
	}
	public double getcomision() {
		return this.ptje_comision;
	}
		public double cobrar(int horas,double monto) {
		return ((double)horas * this.costo_hora)+(monto * this.ptje_comision);
	}
		
		public void agregarTrabajo(Servicios S){
			try {
				this.checkearOficio(S);
				this.checkearAgenda(S);
				this.trabajos.add(S);
			}catch (OficioNoCoincideException e1) {
				System.out.println(e1.getMessage());
			}catch (AgendaOcupadaException e2){
				System.out.println(e2.getMessage());
			}
		}
		public void checkearOficio(Servicios S) throws OficioNoCoincideException{
			if (this.oficio!= S.getOficio()) throw new OficioNoCoincideException("Oficio no compatible con el trabajador");
			return;
		}
		public void checkearAgenda(Servicios S) throws AgendaOcupadaException{
			for (Servicios Serv: this.trabajos) {
				if (Serv.getfecha_inicio().equals(S.getfecha_inicio())) {
					throw new AgendaOcupadaException("El trabajador tiene la agenda ocupada para la fecha indicada");
					
				}
			}
	
		}
}
