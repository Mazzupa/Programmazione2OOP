package es36;

public abstract class Figura implements Comparable<Figura>{
	
	public abstract double getArea();
	public abstract double getPerimetro();
	
	public int compareTo(Figura F) {
		return (int) ((int)this.getPerimetro() + F.getPerimetro());
	}
	@Override
	public String toString() {
		return "Figura [getArea()=" + getArea() + ", getPerimetro()=" + getPerimetro();
	}

	
}
