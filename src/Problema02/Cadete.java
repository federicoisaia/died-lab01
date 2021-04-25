package Problema02;
import java.util.ArrayList;
public class Cadete {
	ArrayList<Pedido> pedidos;
	
	public Cadete() {
		super();
		this.pedidos = new ArrayList<>();
	}
	public void agregarPedido(Pedido P) {
	this.pedidos.add(P);
	return;
	}
	public double comisiones() {
		double comision=0;
		for(Pedido unPed: this.pedidos) {
		comision+= unPed.comision();
		}
		return comision;
	}
}
