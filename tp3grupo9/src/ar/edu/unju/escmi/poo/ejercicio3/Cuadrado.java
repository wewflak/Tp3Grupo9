package ar.edu.unju.escmi.poo.ejercicio3;

public class Cuadrado extends Figura {

	public Cuadrado(double dato1, String color) {
		super(dato1, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double CalcularArea() {
		// TODO Auto-generated method stub
		return Math.pow(dato1, 2);
	}

	@Override
	public double CalcularPerimetro() {
		// TODO Auto-generated method stub
		return dato1*4;
	}

	@Override
	public String toString() {
		return "Cuadrado [dato1=" + dato1 + ", color=" + color + ", CalcularArea()=" + CalcularArea()
				+ ", CalcularPerimetro()=" + CalcularPerimetro() + ", getClass()=" + getClass() + "]";
	}
	

}
