package ar.edu.unju.escmi.poo.ejercicio3;

public abstract class Figura {
	
	 protected double dato1;
	protected String color;
	
	
	
	
	public double getDato1() {
		return dato1;
	}




	public void setDato1(double dato1) {
		this.dato1 = dato1;
	}




	public String getColor() {
		return color;
	}




	public void setColor(String color) {
		this.color = color;
	}




	public Figura(double dato1, String color) {
		super();
		this.dato1 = dato1;
		this.color = color;
	}

	public abstract double CalcularArea();
	public abstract double CalcularPerimetro();





}
