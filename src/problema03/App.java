package problema03;

import java.time.LocalDateTime;

public class App {
public static void main (String[] Args) {
	Producto p1 = new Producto("termo", 1100);
	Producto p2 = new Producto ("mate", 700);
	Producto p3 = new Producto ("guitarra", 1700);
	Producto p4= new Producto ("monitor", 3000);
	Producto p5= new Producto("mouse", 200);
	//System.out.println(p1.toString());
	PedidoBasico ped1 = new PedidoBasico();
	ped1.agregarPedido(p1);
	ped1.agregarPedido(p2);
	ped1.agregarPedido(p3);
	ped1.agregarPedido(p4);
	ped1.agregarPedido(p5);
	
	ped1.marcarexpress();
	
	System.out.println(ped1.precio());
	
	PedidoPremium ped2 = new PedidoPremium();
	ped2.agregarPedido(p1);
	ped2.agregarPedido(p2);
	ped2.agregarPedido(p3);
	ped2.agregarPedido(p4);
	ped2.agregarPedido(p5);
	ped2.agregarPedido(p1);
	ped2.agregarPedido(p2);
	ped2.agregarPedido(p3);
	ped2.agregarPedido(p4);
	ped2.agregarPedido(p5);
	ped2.agregarPedido(p4);
	ped2.agregarPedido(p5);
	
	//System.out.println(ped2.comision());
	Cadete Cad1= new Cadete();
	Cad1.agregarServicio(ped1);
	ped1.pedidoEntregado();
	System.out.println(Cad1.comisiones());
	Tramite tr1= new Tramite("Pagar metrogas", "mi casa", LocalDateTime.now());
	Cad1.agregarServicio(tr1);

	System.out.println(Cad1.comisiones());

	

}
}
