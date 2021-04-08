package problema03;

public class Temperatura {
	private double grados;
	private Escala escala;

	public Temperatura() {
		this.grados =0;
		this.escala= Escala.CELCIUS;
	}
	public Temperatura(double grad, Escala esc) {
		this.grados= grad;
		this.escala= esc;
	}
	
	//-1
	public String toString() {
		if(this.escala == Escala.CELCIUS) return (Double.toString(this.grados)).concat(" C°");
		else return (Double.toString(this.grados)).concat(" F°");
	}
	
	//2-
	
	//en caso de que la consigna haga referencia a convertir la instancia de temp que 
	//llama al metodo
	
	public Double asCelcius() {
		if(this.escala == Escala.CELCIUS) return this.grados;
		else {
			return ((this.grados -32.0)*(5.0/9.0));
			
		}
	}
	
	//en caso de que la consigna sea que el return debe ser otra instancia de Temperatura 
	//equivalente a la que llama al metodo:
	
		public Temperatura asCelcius2() {
			
			Temperatura resultado = new Temperatura();
			if(this.escala == Escala.CELCIUS) {
				resultado.escala=this.escala;
				resultado.grados= this.grados;
				return resultado;
			}
			else {
				resultado.escala= Escala.FARENHEIT;
				resultado.grados= (this.grados - 32.0) * (5.0/9.0);
				return resultado;
			}
	}
		
		//3-
			public Double asFarenheit() {
				if(this.escala == Escala.FARENHEIT) return this.grados;
				else {
					return ((this.grados * (9.0/5.0)) + 32);
			}
		}
			public Temperatura asFarenheit2(){
				
				Temperatura resultado = new Temperatura();
				if(this.escala == Escala.FARENHEIT) {
					//no hago resultado = this, para que resultado y this apunten a instancias distintas.
					resultado.escala= this.escala;
					resultado.grados= this.grados;
					return resultado;
				}
				else {
					resultado.escala= Escala.FARENHEIT;
					resultado.grados= (this.grados *(9.0/5.0))+32;
					return resultado;
				}
				
			}
			
			//-4
			public void aumentar(Temperatura temp) {
			if(temp.grados > 0.0) {
				if(this.escala == temp.getEscala()) this.grados= this.grados + temp.getgrados();
			else {
				if(this.escala == Escala.FARENHEIT)this.grados = this.grados + temp.asFarenheit();
				else this.grados = this.grados + temp.asCelcius();
			}
			}
				
			else System.out.println("la temperatura no debe ser igual a 0.0");
			return;
			
			}
			
			public void disminuir(Temperatura temp) {
				if(temp.grados > 0.0) {
					if(this.escala == temp.getEscala()) this.grados= this.grados - temp.getgrados();
				else {
					if(this.escala == Escala.FARENHEIT)this.grados = this.grados - temp.asFarenheit();
					else this.grados = this.grados - temp.asCelcius();
				}
				}
				else System.out.println("la temperatura no debe ser igual a 0.0");
				return;
				
				}
			
			
			//getters
			
			public double getgrados() {
				return this.grados;
			}
			public Escala getEscala() {
				return this.escala;
			}

}
