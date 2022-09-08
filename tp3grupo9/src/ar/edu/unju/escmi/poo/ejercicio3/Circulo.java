package ar.edu.unju.escmi.poo.ejercicio3;

public class Circulo extends Figura {

	public static final double PI = 3.1415926535;
	public Circulo(double dato1, String color) {
		super(dato1, color);
		// TODO Auto-generated constructor stub
	}
	@Override
	public double CalcularArea() {
		// TODO Auto-generated method stub
		return PI * Math.pow(dato1, 2);
	}
	@Override
	public double CalcularPerimetro() {
		// TODO Auto-generated method stub
		return 2* PI * getDato1();
	}
	@Override
	public String toString() {
		return "Circulo [dato1=" + dato1 + ", color=" + color + ", CalcularArea()=" + CalcularArea()
				+ ", CalcularPerimetro()=" + CalcularPerimetro() + ", getClass()=" + getClass() + "]";
	}
	
}
