package Problema02;

public class PedidoBasico extends Pedido {
	private boolean express;
	
	public PedidoBasico() {
		super();
		express=false;
		max=5;
	}
	public void marcarexpress(){
		this.express = true;
		return;
	}
	@Override
	public double precio() {
		double res=0;
		for (Producto unProd: this.prods) {
			res+=unProd.getCosto();
		}
		res+=(5*res/100);
		if(this.express==true)res+=(20*res/100);
		return res;
		
	}
	@Override
	public double comision() {
		if(this.fechaentrega == null)return 0;
		else return (10*this.precio()/100);
	}
}

