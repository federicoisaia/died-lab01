package problema02;

public class Punto {

	public float x;
	public float y;
public Punto(float x, float y) {
	this.x=x;
	this.y=y ;
}
public float getX() {
	return x;
}
public void setX(float x) {
	this.x = x;
}
public float getY() {
	return y;
}
public void setY(float y) {
	this.y = y;
}
public boolean equals1(Object p2) {
	if(p2 instanceof Punto) 
	{
		if ((((Punto) p2).getX() == this.x ) && (((Punto)p2).getY() == this.y))
		return true;
		else return false;
				}
	else return false;
}

}
