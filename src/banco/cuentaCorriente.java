package banco;

import principal.Util;

public class cuentaCorriente {
	private final int MAX_TITULARES =3;
	
	private double saldo;
	private TipoCC tipo;
	private Persona[] titular;
	private Bco banco;

	public cuentaCorriente() {
		titular = new Persona[MAX_TITULARES];
		for (int i = 0; i < MAX_TITULARES; i++) {
			titular[i] = new Persona();
		}
		setTitular(titular);
		setBanco(banco);
		setTipo(TipoCC.DEBITO);
		setSaldo(0.0);
	}

	public cuentaCorriente(Persona[] titular, int saldo, Bco banco ) {
		setTitular(titular);
		setSaldo(saldo);
		setBanco(banco);
	}

	public void setTitular(Persona[] titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public TipoCC getTipo() {
		return tipo;
	}

	public void setTipo(TipoCC tipo) {
		this.tipo = tipo;
	}

	public Persona getTitular() {
		return this.titular[0];
	}
	
	public Bco getBanco() {
		return banco;
	}

	public void setBanco(Bco banco) {
		this.banco = banco;
	}

	@Override
	public String toString() {
		return "El titular de la cuenta [" + getTitular() + "] tiene una cuenta de tipo "+ getTipo() + " con un saldo de " + getSaldo() + " € en el banco "+ getBanco();
	}

}
