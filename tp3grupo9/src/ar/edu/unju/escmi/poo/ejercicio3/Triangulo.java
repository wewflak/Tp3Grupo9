package ar.edu.unju.escmi.poo.ejercicio3;

public class Triangulo extends Figura {

	private double dato2;
	private double dato3;
	
	public Triangulo(double dato1, String color, double dato2, double dato3) {
		super(dato1, color);
		this.setDato2(dato2);
		this.setDato3(dato3);
		// TODO Auto-generated constructor stub
	}

	public double getDato2() {
		return dato2;
	}

	public double getDato3() {
		return dato3;
	}

	public void setDato3(double dato3) {
		this.dato3 = dato3;
	}

	public void setDato2(double dato2) {
		this.dato2 = dato2;
	}

	@Override
	public double CalcularArea() {
		// TODO Auto-generated method stub
		return (dato1 * getDato2())/2;
	}

	@Override
	public double CalcularPerimetro() {
		// TODO Auto-generated method stub
		return dato1 + getDato2() + getDato3();
	}

}
