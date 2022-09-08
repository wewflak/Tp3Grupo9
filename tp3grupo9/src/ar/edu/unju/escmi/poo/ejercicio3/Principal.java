package ar.edu.unju.escmi.poo.ejercicio3;

import java.util.Scanner;

public class Principal {

	static Figura[] figuras = new Figura[8];
	static Figura[] figurasAux = new Figura[8];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op;
		Scanner scanner = new Scanner (System.in);
		do
		{
			
			System.out.println("+/- +/- Menu +/- +/-");
			System.out.println("******Ingrese la opcion deseada*******");
			System.out.println("1 - Crear un c�rculo.");
			System.out.println("2 - Crear un cuadrado.");
			System.out.println("3 - Crear un rect�ngulo.");
			System.out.println("4 - Crear un tri�ngulo.");
			System.out.println("5 - Mostrar todas las figuras geom�tricas.");
			System.out.println("6 - Ingrese un color y muestre todas las figuras con ese color.");
			System.out.println("7 - Mostrar solo c�rculos.");
			System.out.println("8 - Mostrar solo cuadrados.");
			System.out.println("9 - Mostrar solo rect�ngulos.");
			System.out.println("10 - Mostrar solo tri�ngulos.");
			System.out.println("11 - Salir.");
			
			op=scanner.nextInt();
		
			
			switch(op) {
				
			case 1:
					crearFigura(op);
				break;
			case 2:
				crearFigura(op);
				break;
			case 3:
				crearFigura(op);
				break;
			case 4:
				crearFigura(op);
			break;
			case 5:
				mostrarFiguras(op);
				break;
			case 6:
				mostrarFiguras(op);
				break;
			case 7:
				mostrarFiguras(op);
				break;
			case 8:
				mostrarFiguras(op);
				break;
			case 9:
				mostrarFiguras(op);
				break;
			case 10:
				mostrarFiguras(op);
				break;
			case 11:
				System.out.println("Salir");
				break;
			}
		}while(op!=11);
		scanner.close();
		
}
	public static void crearFigura(int op) {
		boolean espacio=false;
		int pos = 0, i=0, aux = 0;
		double dato1 = 0;
		double dato2 = 0;
		double dato3 = 0;
		String color=" ";
		Scanner scanner2 = new Scanner (System.in);
		switch(op) {
		case 1:
			
		Circulo nCirculo = new Circulo(dato1, color);
		System.out.println("Ingrese el r�dio del c�rculo");
		nCirculo.dato1 = scanner2.nextDouble();
		System.out.println("Ingrese el color del c�rculo");
		nCirculo.color = scanner2.next();
		try {
			while(espacio!=true && i<figuras.length) {
			if(figuras[i]==null) {
				//System.out.println(i);
				espacio=true;
				
				aux=i;
				//System.out.println(aux);
			}else {
				espacio=false;
				i++;
			}
			}
			if(espacio == true ) {
				pos=aux;
			figuras[pos] = nCirculo;
			System.out.println("Presione cualquier tecla para continuar...");
	          new java.util.Scanner(System.in).nextLine();
			//System.out.println(pos);
			//System.out.println("entra");
			}else {
				System.out.println("El arreglo est� lleno");
				System.out.println("Presione cualquier tecla para continuar...");
		          new java.util.Scanner(System.in).nextLine();
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("error");
			e.printStackTrace();
		}
		break;
		
		case 2:
			Cuadrado nCuadrado = new Cuadrado(dato1, color);
			System.out.println("Ingrese el lado del cuadrado");
			nCuadrado.dato1 = scanner2.nextDouble();
			System.out.println("Ingrese el color del cuadrado");
			nCuadrado.color = scanner2.next();
			try {
				while(espacio!=true && i<figuras.length) {
				if(figuras[i]==null) {
					System.out.println(i);
					espacio=true;
					
					aux=i;
					System.out.println(aux);
				}else {
					espacio=false;
					i++;
				}
				}
				if(espacio == true ) {
					pos=aux;
				figuras[pos] = nCuadrado;
				System.out.println(pos);
				System.out.println("Presione cualquier tecla para continuar...");
		          new java.util.Scanner(System.in).nextLine();
				}else {
					System.out.println("El arreglo est� lleno");
					System.out.println("Presione cualquier tecla para continuar...");
			          new java.util.Scanner(System.in).nextLine();
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			}
			break;
			
		case 3:
			Rectangulo nRectangulo = new Rectangulo(dato1, color, dato2);
			System.out.println("Ingrese el lado 1 del rect�ngulo");
			nRectangulo.dato1 = scanner2.nextDouble();
			System.out.println("Ingrese el lado 2 del rect�ngulo");
			nRectangulo.setDato2(scanner2.nextDouble());
			System.out.println("Ingrese el color del rect�ngulo");
			nRectangulo.color = scanner2.next();
			try {
				while(espacio!=true && i<figuras.length) {
				if(figuras[i]==null) {
					System.out.println(i);
					espacio=true;
					
					aux=i;
					System.out.println(aux);
				}else {
					espacio=false;
					i++;
				}
				}
				if(espacio == true ) {
					pos=aux;
				figuras[pos] = nRectangulo;
				System.out.println(pos);
				System.out.println("entra");
				}else {
					System.out.println("El arreglo est� lleno");
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
			
		case 4:
			Triangulo nTriangulo = new Triangulo(dato1, color, dato2, dato3);
			System.out.println("Ingrese el lado 1 del tri�ngulo");
			nTriangulo.dato1 = scanner2.nextDouble();
			System.out.println("Ingrese el lado 2 del tri�ngulo");
			nTriangulo.setDato2(scanner2.nextDouble());
			System.out.println("Ingrese el lado 3 del tri�ngulo");
			nTriangulo.setDato3(scanner2.nextDouble());
			System.out.println("Ingrese el color del tri�ngulo");
			nTriangulo.color = scanner2.next();
			try {
				while(espacio!=true && i<figuras.length) {
				if(figuras[i]==null) {
					System.out.println(i);
					espacio=true;
					
					aux=i;
					System.out.println(aux);
				}else {
					espacio=false;
					i++;
				}
				}
				if(espacio == true ) {
					pos=aux;
				figuras[pos] = nTriangulo;
				System.out.println(pos);
				System.out.println("entra");
				}else {
					System.out.println("El arreglo est� lleno");
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
	}
	};	

	public static void mostrarFiguras(int op) {

		String coulour;
		boolean nonull=false;
		Scanner scanner3 = new Scanner (System.in);
		Figura[] figurasPorColor = new Figura[8];
		switch (op) {
		case 7:
			for(Figura fig: figuras) {
				if(fig instanceof Circulo) {
					System.out.println( " El elemento  es un c�rculo: " +fig);
					System.out.println( " El �rea es: " +fig.CalcularArea());
					System.out.println( " El perimetro es: " +fig.CalcularPerimetro());
				}else {
					System.out.println("El elemento no es un c�rculo");
				}
			}
			break;
		case 8:
			for(Figura fig: figuras) {
				if(fig instanceof Cuadrado) {
					System.out.println( " El elemento  es un cuadrado: " +fig);
					System.out.println( " El �rea es: " +fig.CalcularArea());
					System.out.println( " El perimetro es: " +fig.CalcularPerimetro());
				}else {
					System.out.println("El elemento no es un cuadrado");
				}
			}
			break;
		case 9:
			for(Figura fig: figuras) {
				if(fig instanceof Rectangulo) {
					System.out.println( " El elemento  es un rect�ngulo: " +fig);
					System.out.println( " El �rea es: " +fig.CalcularArea());
					System.out.println( " El perimetro es: " +fig.CalcularPerimetro());
				}else {
					System.out.println("El elemento no es un rect�ngulo");
				}
			}
			break;
		case 10:
			for(Figura fig: figuras) {
				if(fig instanceof Circulo) {
					System.out.println( " El elemento  es un tri�ngulo: " +fig);
					System.out.println( " El �rea es: " +fig.CalcularArea());
					System.out.println( " El perimetro es: " +fig.CalcularPerimetro());
				}else {
					System.out.println("El elemento no es un tri�ngulo");
				}
			}
			break;
		case 5:
			for(int i=0; i<figuras.length;i++) {
				
				if(figuras[i]!=null) {
					System.out.println("El elemento es: " +figuras[i].getColor());
				}else {
					System.out.println("No hay elemento");
				}
			}
			break;
		
		case 6:
			System.out.println("Ingrese el color");
			coulour = scanner3.next();
			for(int k=0; k<figuras.length; k++) {
				if(figuras[k]!=null && figuras[k].getColor().contentEquals(coulour)) {
					System.out.println("El elemento es: " +figuras[k] + "  ");
				}else {
					System.out.println(" ");
				}
			}
		}
	};
	
	
}
