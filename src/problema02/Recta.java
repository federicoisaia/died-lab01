package problema02;

public class Recta {

	Punto p1; 
	Punto p2;
	
	public Recta(Punto p1, Punto p2) {
		this.p1 = p1;
		this.p2= p2;
	}
	public Recta () {
		this.p1= new Punto((float)0, (float) 0);
		this.p2= new Punto((float)1, (float) 1);
		
	}
	public float pendiente() {
		return (p2.getY() - p1.getY())/(p2.getX() - p1.getX());
	}
	public boolean paralelas(Recta r1, Recta r2) {
		return (r1.pendiente() == r2.pendiente() );
		
	}
	public Punto punto1() {
		return this.p1;
	}
	public Punto punto2() {
		return this.p2;
	}
	
	public boolean equals1(Object r2) {
		if (r2 instanceof Recta) {
			if (this.pendiente() == ((Recta)r2).pendiente()) {
			Recta aux = new Recta(this.p1, ((Recta)r2).punto2() );
				return ( aux.pendiente() == this.pendiente() );
				}
			else return false;
			
			}
		else return false;
		}
	

}
