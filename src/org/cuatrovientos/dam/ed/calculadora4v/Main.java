package org.cuatrovientos.dam.ed.calculadora4v;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Crear el objeto Scanner para capturar la entrada del usuario
		Scanner scanner = new Scanner(System.in);
		boolean salir = false;

		// Bucle principal para mostrar el menú y realizar operaciones hasta que el usuario decida salir
		while (!salir) {
			
			//Menú 
			mostrarMenu();

			// Leer la opción seleccionada por el usuario
			int operacion = scanner.nextInt();

			// Ejecutar la operación correspondiente según la opción seleccionada
			switch (operacion) {
			case 1:
				// Llamada directa a Suma
				
				System.out.print("Introduce el primer número: ");
				double num1 = scanner.nextDouble(); 
				System.out.print("Introduce el segundo número: ");
				double num2 = scanner.nextDouble();
				Suma(num1, num2);
				break;
			case 2:
				// Llamada directa a Resta
				System.out.print("Introduce el primer número: ");
				num1 = scanner.nextDouble();
				System.out.print("Introduce el segundo número: ");
				num2 = scanner.nextDouble();
				Resta(num1, num2);
				break;
			case 3:
				// Llamada directa a Multiplicacion
				System.out.print("Introduce el primer número: ");
				num1 = scanner.nextDouble();
				System.out.print("Introduce el segundo número: ");
				num2 = scanner.nextDouble();
				Multiplicacion(num1, num2);
				break;
			case 4:
				// Llamada directa a Division
				System.out.print("Introduce el primer número: ");
				num1 = scanner.nextDouble();
				System.out.print("Introduce el segundo número: ");
				num2 = scanner.nextDouble();
				Division(num1, num2);
				break;
			case 5:
				//TODO: Comprobar cuando se sale de la calculadora
				System.out.println("Saliendo de la calculadora. ¡Adiós!");
				salir = true;
				break;
			default:
				System.err.println("Opción no válida. Intenta nuevamente.");
				break;
			}

			// Indicar que la operación ha finalizado
			System.out.println("Fin de operación. Continuando...");
		}

		// Cerrar el scanner al finalizar
		scanner.close();
	}



	private static void mostrarMenu() {
		System.out.println("\n===== Calculadora =====");
		System.out.println("\t1. Sumar");
		System.out.println("\t2. Restar");
		System.out.println("\t3. Multiplicar");
		System.out.println("\t4. Dividir");
		System.out.println("\t5. Salir");
		System.out.print("Elige una opción: ");
	}



	/**
	 * Método que realiza la suma entre dos números proporcionados por el usuario.
	 *
	 * @param num1 Primer número.
	 * @param num2 Segundo número.
	 */
	private static void Suma(double num1, double num2) {
		double resultado = num1 + num2;
		System.out.println("Resultado de la suma: " + resultado);
	}

	/**
	 * Método que realiza la resta entre dos números proporcionados por el usuario.
	 *
	 * @param num1 Primer número.
	 * @param num2 Segundo número.
	 */
	private static void Resta(double num1, double num2) {
		double resultado = num1 - num2;
		System.out.println("Resultado de la resta: " + resultado);
	}

	/**
	 * Método que realiza la multiplicación entre dos números proporcionados por el
	 * usuario.
	 *
	 * @param num1 Primer número.
	 * @param num2 Segundo número.
	 */
	private static void Multiplicacion(double num1, double num2) {
		double resultado = num1 * num2;
		System.out.println("Resultado de la multiplicación: " + resultado);
	}

	/**
	 * Método que realiza la división entre dos números proporcionados por el
	 * usuario.
	 *
	 * @param num1 Primer número.
	 * @param num2 Segundo número.
	 */
	
	private static void Division(double num1, double num2) {
		if (num2 != 0) {
			double resultado = num1 / num2; 
			System.out.println("Resultado de la división: " + resultado);
		} else {
			// FIXME: Añadir una validación más robusta en caso de que se produzca un error
			// en la división
			System.out.println("Error: No se puede dividir entre cero.");
		}
	}

}
