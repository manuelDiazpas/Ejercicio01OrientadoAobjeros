package banco;

import java.util.Scanner;

public class Util {

	static int LeerInt(String pregunta) {
		Scanner teclado = new Scanner(System.in);
		int respuesta;

		System.out.print(pregunta);
		respuesta = Integer.parseInt(teclado.nextLine());

		return respuesta;
	}

	static double LeerDouble(String pregunta) {
		Scanner teclado = new Scanner(System.in);
		double respuesta;

		System.out.print(pregunta);
		respuesta = Double.parseDouble(teclado.nextLine());

		return respuesta;

	}

	static String LeerString(String pregunta) {
		Scanner teclado = new Scanner(System.in);
		String respuesta;

		System.out.print(pregunta);
		respuesta = teclado.next();

		return respuesta;
	}

	static void pedirDoubleArrys(Double[] v, int n) {
		for (int i = 0; i < v.length; i++) {
			v[i] = Util.LeerDouble("Introduzca un valor [" + (i + 1) + "/" + n + "]: ");
		}
	}

	public static void obtenerDoubleArrys(Double[] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i]);
		}
	}

	public static void obtenerDoubleSinNumDet(Double[] v, int n) {
		for (int i = n - 1; i >= 0; i--) {
			System.out.println(v[i]);
		}
	}
	
	static void ordenarDouble(Double[] v) {
		Double temp;
		for (int i = 0; i < v.length; i++) {
			for(int j = i+1; j<v.length;i++ ) {
				if(v[i] > v[j]) {
					temp = v[i];
					v[i] = v[j];
					v[j] = temp;
				}
			}
		}
	}
	
	static void pedirIntegerArrys(Integer[] v, int n) {
		for (int i = 0; i < v.length; i++) {
			v[i] = Util.LeerInt("Introduzca un valor [" + (i + 1) + "/" + n + "]: ");
		}
	}

	public static void obtenerIntegerArrys(Integer[] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.println(v[i]);
		}
	}
	public static void obtenerIntegerSinNumDet(Integer[] v, int n) {
		for (int i = n - 1; i >= 0; i--) {
			System.out.println(v[i]);
		}
	}
	static void ordenarInteger(Integer[] v) {
		Integer temp;
		for (int i = 0; i < v.length; i++) {
			for(int j = i+1; j<v.length;i++ ) {
				if(v[i] > v[j]) {
					temp = v[i];
					v[i] = v[j];
					v[j] = temp;
				}
			}
		}
	}
}
