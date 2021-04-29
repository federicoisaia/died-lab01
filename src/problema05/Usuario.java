package problema05;

import java.util.ArrayList;

public class Usuario {
	ArrayList<Contratable> serv_alq;
	
	public Usuario() {
		super();
		this.serv_alq= new ArrayList<>();
		}
	public void agregarContratable(Contratable C) {
		try {
			this.checkearAlquileres();
			this.serv_alq.add(C);
		}catch (AlquilerNoEntregadoException e) {
			System.out.println(e.getMessage());
		}
	}
	public void checkearAlquileres() throws AlquilerNoEntregadoException{
		int alq_no_devueltos=0;
		for(Contratable Cont: this.serv_alq) {
			if(Cont instanceof Alquiler && !((Alquiler) Cont).finalizado())alq_no_devueltos++;
		}
		if(alq_no_devueltos>=2)throw new AlquilerNoEntregadoException("Cuenta con mas de dos alquileres activos.");
	}
}
