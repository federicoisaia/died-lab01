package problema03;

public class PedidoPremium extends Pedido implements Comisionable{
	
	public PedidoPremium() {
		super();
		max=20;
		
	}

	public double precio() {
		double res=0;
		for (Producto unProd: this.prods) {
			res+= unProd.getCosto();
		}
		res+= (20*res/100);
		if (this.prods.size() > 5) res+=(30*res/100);
		return res;
	}
	public double comision() {
		if (this.fechaentrega== null)return 0;
		else {
		if (this.prods.size() > 10)return (15* this.precio() /100) +50;
		else return (15* this.precio() /100);
		}
	}
}
