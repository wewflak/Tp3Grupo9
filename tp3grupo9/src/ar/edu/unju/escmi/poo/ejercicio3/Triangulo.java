package ar.edu.unju.escmi.poo.ejercicio3;

public class Triangulo extends Figura {

	private double dato2;
	private double dato3;
	
	public Triangulo(double dato1, String color, double dato2, double dato3) {
		super(dato1, color);
		this.dato2 = dato2;
		this.dato3 = dato3;
		// TODO Auto-generated constructor stub
	}

	@Override
	public double CalcularArea() {
		// TODO Auto-generated method stub
		return (dato1 * dato2)/2;
	}

	@Override
	public double CalcularPerimetro() {
		// TODO Auto-generated method stub
		return dato1 + dato2 + dato3;
	}

}
