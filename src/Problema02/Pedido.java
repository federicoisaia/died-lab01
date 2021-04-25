package Problema02;
import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Pedido {
	protected ArrayList<Producto> prods;
	protected int max;
	protected LocalDate fechaentrega;
	
	public Pedido() {
		super();
		prods = new ArrayList<>();
		}
	public void agregarPedido(Producto P) {
		if (this.prods.size()== max) System.out.println("No se pueden agregar mas productos, carrito lleno para este tipo de pedido.");
		else this.prods.add(P);
	}
	public void pedidoEntregado() {
		this.fechaentrega=LocalDate.now();
	}
	public LocalDate getfechaentrega() {
		return this.fechaentrega;
	}
	public abstract double precio();
	public abstract double comision();
	
	
}
