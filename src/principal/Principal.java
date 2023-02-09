package principal;

import java.util.Iterator;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import banco.*;

public class Principal {

	public static void main(String[] args) {

		int opc = 0;
		cuentaCorriente[] ccs = new cuentaCorriente[10];

		for (int i = 0; i < ccs.length; i++) {
			ccs[i] = new cuentaCorriente();
		}

		menu();
		do {
			opc = Util.LeerInt("Seleccione una opción: ");

			switch (opc) {
			case 0:
				break;
			case 1:
				bajaCuenta(ccs);
				break;
			case 2:
				consultarCuenta(ccs);
				break;
			case 3:
				modificarCuenta(ccs);
				break;
			case 4:
				mostrarListado(ccs);
				break;
			default:
				System.out.println("Opción no valida.");
			}
		} while (opc != 0);

	}
	public static void pedirDatos() {
		String nombre ="Pepe";
		String edad ="23";
		String dni = "12345678a";
		String calle = "Pepito";
		String nCalle = "32";
		
		String readNombre = Util.LeerString("Nombre ["+nombre+"] : ");
		String readEdad = Util.LeerString("Edad ["+edad+"] : ");
		String readDni = Util.LeerString("Dni ["+dni+"] : ");
		String readCalle = Util.LeerString("Calle ["+calle+"] : ");
		String readNcalle= Util.LeerString("Nº calle ["+nCalle+"] : ");

		if(readNombre!="") nombre = readNombre;
		if(readEdad!="") edad = readEdad;
		if(readDni!="") dni = readDni;
		if(readCalle!="") calle = readCalle;
		if(readNcalle!="") nCalle = readNcalle;

	}
	
	
	public static void menu() {
		System.out.println("MENU:");
		System.out.println("1 → Dar de baja cuenta");
		System.out.println("2 → Consultar cuenta");
		System.out.println("3 → Modificar cuenta");
		System.out.println("4 → Listado");
		System.out.println("0 → Salir");
	}

	public static void bajaCuenta(cuentaCorriente[] cc) {
		int opc;
		opc = Util.LeerInt("¿Qué cuenta quiere eliminar? (existen 10 cuentas)");
		switch (opc) {
		case 1:
			cc[0] = null;
			System.out.println("Cuenta eliminada");
			break;
		case 2:
			cc[1] = null;
			System.out.println("Cuenta eliminada");
			break;
		case 3:
			cc[2] = null;
			System.out.println("Cuenta eliminada");
			break;
		case 4:
			cc[3] = null;
			System.out.println("Cuenta eliminada");
			break;
		case 5:
			cc[4] = null;
			System.out.println("Cuenta eliminada");
			break;
		case 6:
			cc[5] = null;
			System.out.println("Cuenta eliminada");
			break;
		case 7:
			cc[6] = null;
			System.out.println("Cuenta eliminada");
			break;
		case 8:
			cc[7] = null;
			System.out.println("Cuenta eliminada");
			break;
		case 9:
			cc[8] = null;
			System.out.println("Cuenta eliminada");
			break;
		case 10:
			cc[9] = null;
			System.out.println("Cuenta eliminada");
			break;
		default:
			System.out.println("Opción no valida");
		}
	}

	public static void modificarCuenta(cuentaCorriente[] cc) {
		int caso;
		String sn;

		caso = Util.LeerInt("¿Qué cuenta quiere modificar? (1-10) ");
		if (caso > 10 || caso <= 0) {
			System.out.println("Cuenta inexistente.");
		} else {
			if (cc[caso - 1] == null) {
				System.out.println("Esta cuenta fué eliminada");
			} else {
				sn = Util.LeerString("¿Desea cambiar el titular? (S/N)");
				if (sn.equalsIgnoreCase("s")) {
					String n = "";
					n = Util.LeerString("Dime el nombre del titular: ");
					cc[caso - 1].getTitular().setNombre(n);
					n = Util.LeerString("Dime el apellido del titular: ");
					cc[caso - 1].getTitular().setApellidos(n);
					n = Util.LeerString("Dime el dni del titular: ");
					cc[caso - 1].getTitular().setDni(n);
					String c1;
					c1 = Util.LeerString("Dime el nombre de la calle del titular: ");
					cc[caso - 1].getTitular().getDomicilio().setCalle(c1);

					int num1;
					num1 = Util.LeerInt("Introduzca el número de dicha calle: ");
					cc[caso - 1].getTitular().getDomicilio().setNumero(num1);
				}
				sn = Util.LeerString("¿Desea cambiar el tipo de cuenta? (S/N) ");
				if (sn.equalsIgnoreCase("s")) {
					int miniOpc;
					minimenu();
					miniOpc = Util.LeerInt("Seleccione una opción: ");
					switch (miniOpc) {
					case 1:
						cc[caso - 1].setTipo(TipoCC.DEBITO);
						break;
					case 2:
						cc[caso - 1].setTipo(TipoCC.CREDITO);
						break;
					case 3:
						cc[caso - 1].setTipo(TipoCC.BLACK);
						break;
					default:
						System.out.println("Opción no valida. Siguiente pregunta:");
					}
				}
				sn = Util.LeerString("¿Desea cambiar el banco? (S/N) ");
				if (sn.equalsIgnoreCase("s")) {
					
					String n = "";
					n = Util.LeerString("Dime el nombre del banco de la cuenta: ");
					cc[caso - 1].getBanco().setNombre(n);

					String c2;
					c2 = Util.LeerString("Dime la calle del banco: ");
					cc[caso - 1].getBanco().getDireccionFiscal().setCalle(c2);

					int num2;
					num2 = Util.LeerInt("Introduzca el número de dicha calle: ");
					cc[caso - 1].getBanco().getDireccionFiscal().setNumero(num2);
				}
				sn = Util.LeerString("¿Desea cambiar el saldo de la cuenta? (S/N)");
				if (sn.equalsIgnoreCase("s")) {
					int saldo;
					saldo = Util.LeerInt("Introduzca su saldo actual");
					cc[caso - 1].setSaldo(saldo);
				}

			}
		}

	}

	private static void minimenu() {
		System.out.println("Tipos de cuenta:");
		System.out.println("1 → DEBITO");
		System.out.println("2 → CREDITO");
		System.out.println("3 → BLACK");
	}

	public static void consultarCuenta(cuentaCorriente[] cc) {
		Gson g = new GsonBuilder().setPrettyPrinting().create();
		int n;

		n = Util.LeerInt("¿Qué cuenta quiere mostrar? (10 cuentas disponibles): ");
		switch (n) {
		case 1:
			System.out.println(g.toJson(cc[0]));
			break;
		case 2:
			System.out.println(g.toJson(cc[1]));
			break;
		case 3:
			System.out.println(g.toJson(cc[2]));
			break;
		case 4:
			System.out.println(g.toJson(cc[3]));
			break;
		case 5:
			System.out.println(g.toJson(cc[4]));
			break;
		case 6:
			System.out.println(g.toJson(cc[5]));
			break;
		case 7:
			System.out.println(g.toJson(cc[6]));
			break;
		case 8:
			System.out.println(g.toJson(cc[7]));
			break;
		case 9:
			System.out.println(g.toJson(cc[8]));
			break;
		case 10:
			System.out.println(g.toJson(cc[9]));
			break;
		default:
			System.out.println("Cuenta inexistente.");
		}
	}

	public static void mostrarListado(cuentaCorriente[] cc) {
		int cont = 0;
		for (int i = 0; i < cc.length; i++) {
			if (cc[i] != null) {
				cont++;
			}
		}
		System.out.println("Hay un total de " + cont + " cuentas disponibles.");
	}

}
