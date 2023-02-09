package banco;

public class Bco {
	private String nombre;
	private Domicilio direccionFiscal;
	
	public Bco() {
		
	}
	
	public Bco(String nombre, Domicilio direccionFiscal) {
		setNombre(nombre);
		setDireccionFiscal(direccionFiscal);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Domicilio getDireccionFiscal() {
		return direccionFiscal;
	}

	public void setDireccionFiscal(Domicilio direccionFiscal) {
		this.direccionFiscal = direccionFiscal;
	}

	@Override
	public String toString() {
		return "Banco →[Nombre= " + getNombre() + ", Direccion Fiscal= " + getDireccionFiscal() + "]";
	}
	
}
