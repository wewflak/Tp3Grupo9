package ar.edu.unju.escmi.poo.ejercicio3;

public class Rectangulo extends Figura {

	private double dato2;
	
	public Rectangulo(double dato1, String color, double dato2) {
		super(dato1, color);
		this.dato2 = dato2;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double CalcularArea() {
		// TODO Auto-generated method stub
		return this.dato1 * this.dato2;
	}

	@Override
	public double CalcularPerimetro() {
		// TODO Auto-generated method stub
		return 2 * (dato1 + dato2);
	}

}
