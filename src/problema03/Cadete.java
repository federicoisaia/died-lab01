package problema03;
import java.util.ArrayList;
public class Cadete {
	ArrayList<Comisionable> servicios;
	
	public Cadete() {
		super();
		this.servicios = new ArrayList<>();
	}
	public void agregarServicio(Comisionable C) {
	this.servicios.add(C);
	return;
	}
	public double comisiones() {
		double comision=0;
		for(Comisionable com: this.servicios) {
		comision+= com.comision();
		}
		return comision;
	}
}
