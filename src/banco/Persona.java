package banco;

public class Persona {
	private String nombre;
	private String apellidos;
	private String dni;
	private Domicilio domicilio;
	
	public Persona() {}
	
	public Persona(String nombre, String apellidos, String dni, Domicilio domicilio) {
		setNombre(nombre);
		setApellidos(apellidos);
		setDni(dni);
		setDomicilio(domicilio);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Domicilio getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(Domicilio domicilio) {
		this.domicilio = domicilio;
	}

	@Override
	public String toString() {
		return "Persona →[Nombre= " + getNombre() + ", Apellidos= " + getApellidos() + ", Dni= " + getDni()
				+ ", " + getDomicilio() + "]";
	}
	
	
}
