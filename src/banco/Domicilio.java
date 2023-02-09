package banco;

public class Domicilio {
	private String calle;
	private int numero;
	
	public Domicilio() {
		
	}
	
	public Domicilio(String calle, int numero) {
		setCalle(calle);
		setNumero(numero);
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Domicilio →[Calle= " + getCalle() + ", Numero= " + getNumero() + "]";
	}
	
	
}
